package com.sms.bo;

import com.sms.dao.AddAttendenceDAO;
import com.sms.vo.Attendence;

public class AddAttendenceBO {

    public int addAttendence(Attendence attendence) {
	AddAttendenceDAO dao = new AddAttendenceDAO();
	int flag = dao.addAttendence(attendence);
	return flag;

    }

}
