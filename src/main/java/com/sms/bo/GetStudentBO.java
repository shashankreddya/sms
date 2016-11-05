package com.sms.bo;

import com.sms.dao.GetStudentDAO;
import com.sms.vo.Student;

public class GetStudentBO {

    public Student getStudentIdentity(Student student) {
	GetStudentDAO dao = new GetStudentDAO();
	Student stu = dao.getStudent(student);
	return stu;

    }

}
