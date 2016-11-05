package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sms.connection.ConnectionManager;
import com.sms.constants.SQLConstants;
import com.sms.vo.Attendence;


public class GetAttendenceDAO {
	private transient Connection dbconnection;
	private transient PreparedStatement preparedStatement;
	private transient String sql;
	private transient ResultSet resultSet;

	public Attendence getAttendence(Attendence attendence){
		sql = SQLConstants.GETATTDINFO;//SQL1
		int flag=0;
		Attendence atd = new Attendence();
		try {
			dbconnection = ConnectionManager.getConnection();
			preparedStatement = dbconnection.prepareStatement(sql);

			preparedStatement.setString(1, attendence.getStudentId());
			preparedStatement.setString(2, attendence.getDate());
			resultSet=preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				atd.setStudentId(resultSet.getString(1));
				atd.setDate(resultSet.getString(2));
				atd.setAttendence(resultSet.getString(3));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			atd = null;
		}

		finally
		{
			try {
				dbconnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				
			}
		}

		return atd;
	}


}
