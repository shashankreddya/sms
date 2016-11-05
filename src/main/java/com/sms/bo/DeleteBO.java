package com.sms.bo;

import com.sms.dao.DeleteStudentDAO;
import com.sms.vo.Student;

public class DeleteBO {

    public int deleteStudentIdentity(Student student) {
	DeleteStudentDAO dao = new DeleteStudentDAO();
	int flag = dao.deleteStudent(student);
	return flag;

    }

}
