package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sms.connection.ConnectionManager;
import com.sms.constants.SQLConstants;
import com.sms.vo.Student;

public class GetStudentDAO {

    private transient Connection dbconnection;
    private transient PreparedStatement preparedStatement;
    private transient String sql;
    private transient ResultSet resultSet;

    public Student getStudent(Student student) {
	sql = SQLConstants.GETSTUINFO;// SQL1
	int flag = 0;
	Student stu = new Student();
	try {
	    dbconnection = ConnectionManager.getConnection();
	    preparedStatement = dbconnection.prepareStatement(sql);

	    preparedStatement.setString(1, student.getId());
	    resultSet = preparedStatement.executeQuery();

	    if (resultSet.next()) {
		stu.setId(resultSet.getString(1));
		stu.setName(resultSet.getString(2));
		stu.setEmail(resultSet.getString(3));

	    }

	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    stu = null;
	}

	finally {
	    try {
		dbconnection.close();
	    } catch (SQLException e) {
		// TODO Auto-generated catch block

	    }
	}

	return stu;
    }

}
