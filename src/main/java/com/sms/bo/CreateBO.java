package com.sms.bo;

import com.sms.dao.CreateStudentDAO;
import com.sms.vo.Student;

public class CreateBO {

    public int createStudentIdentity(Student student) {
	CreateStudentDAO dao = new CreateStudentDAO();
	int flag = dao.addStudent(student);
	return flag;

    }

}
