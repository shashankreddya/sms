package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sms.connection.ConnectionManager;
import com.sms.constants.SQLConstants;
import com.sms.vo.Student;

public class UpdateStudentDAO {

    private transient Connection dbconnection;
    private transient PreparedStatement preparedStatement;
    private transient String sql;
    private transient ResultSet resultSet;

    public int updateStudent(final Student student) {

	sql = SQLConstants.UPDATESTUINFO;// SQL1
	int flag = 0;
	try {
	    dbconnection = ConnectionManager.getConnection();
	    preparedStatement = dbconnection.prepareStatement(sql);

	    preparedStatement.setString(1, student.getId());
	    preparedStatement.setString(2, student.getName());
	    preparedStatement.setString(3, student.getEmail());
	    preparedStatement.setString(4, student.getId());
	    flag = preparedStatement.executeUpdate();

	    System.out.println("flag" + flag);

	} catch (SQLException e) {
	    // TODO Auto-generated catch bloc
	    flag = 0;
	    e.printStackTrace();
	}

	finally {
	    try {
		dbconnection.close();
	    } catch (SQLException e) {
		// TODO Auto-generated catch bloc
		e.printStackTrace();
		flag = 0;
	    }
	}

	return flag;

    }
}