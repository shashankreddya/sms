package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sms.connection.ConnectionManager;
import com.sms.constants.SQLConstants;
import com.sms.vo.Student;

public class DeleteStudentDAO {

    private transient Connection dbconnection;
    private transient PreparedStatement preparedStatement;
    private transient String sql;
    private transient ResultSet resultSet;

    public int deleteStudent(final Student student) {
	sql = SQLConstants.DELETESTUINFO;// SQL1
	int flag = 0;
	try {
	    dbconnection = ConnectionManager.getConnection();
	    preparedStatement = dbconnection.prepareStatement(sql);

	    preparedStatement.setString(1, student.getId());
	    flag = preparedStatement.executeUpdate();

	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    flag = 0;
	}

	finally {
	    try {
		dbconnection.close();
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
	    }
	}

	return flag;
    }

}
