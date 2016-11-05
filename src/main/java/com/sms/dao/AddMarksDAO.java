package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sms.connection.ConnectionManager;
import com.sms.constants.SQLConstants;
import com.sms.vo.Attendence;
import com.sms.vo.Marks;

public class AddMarksDAO {

	private transient Connection dbconnection;
	private transient PreparedStatement preparedStatement;
	private transient String sql;
	private transient ResultSet resultSet;

	public int addMarks(final Marks marks){

	

		
		sql = SQLConstants.INSERTMARKSINFO;//SQL1
		int flag=0;
		try {
			dbconnection = ConnectionManager.getConnection();
			preparedStatement = dbconnection.prepareStatement(sql);

			preparedStatement.setString(1, marks.getStudentId());
			preparedStatement.setString(2, marks.getSub1());
			preparedStatement.setString(3, marks.getSub2());
			preparedStatement.setString(4, marks.getSub3());
			flag=preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			flag = 0;
		}

		finally
		{
			try {
				dbconnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
			}
		}

		return flag;
	}


}
