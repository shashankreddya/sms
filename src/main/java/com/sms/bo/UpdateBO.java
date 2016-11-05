package com.sms.bo;

import com.sms.dao.UpdateStudentDAO;
import com.sms.vo.Student;

public class UpdateBO {

    public int updateStudentIdentity(Student student) {
	UpdateStudentDAO dao = new UpdateStudentDAO();
	int flag = dao.updateStudent(student);
	return flag;

    }

}
