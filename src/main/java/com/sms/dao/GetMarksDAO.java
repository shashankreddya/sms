package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sms.connection.ConnectionManager;
import com.sms.constants.SQLConstants;
import com.sms.vo.Attendence;
import com.sms.vo.Marks;

public class GetMarksDAO {
	private transient Connection dbconnection;
	private transient PreparedStatement preparedStatement;
	private transient String sql;
	private transient ResultSet resultSet;

	public Marks getMarks(Marks marks){
		sql = SQLConstants.GETMARKSINFO;//SQL1
		int flag=0;
		Marks mrks = new Marks();
		try {
			dbconnection = ConnectionManager.getConnection();
			preparedStatement = dbconnection.prepareStatement(sql);

			preparedStatement.setString(1, marks.getStudentId());
			resultSet=preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				mrks.setStudentId(resultSet.getString(1));
				mrks.setSub1(resultSet.getString(2));
				mrks.setSub2(resultSet.getString(3));
				mrks.setSub3(resultSet.getString(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			mrks = null;
		}

		finally
		{
			try {
				dbconnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				
			}
		}

		return mrks;
	}


}
