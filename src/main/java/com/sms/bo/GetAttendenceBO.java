package com.sms.bo;

import com.sms.dao.GetAttendenceDAO;
import com.sms.vo.Attendence;

public class GetAttendenceBO {
	public Attendence getAttendence(Attendence attendence)
	{
		GetAttendenceDAO dao= new GetAttendenceDAO();
		Attendence attend = dao.getAttendence(attendence);
		return attend;
		
	}


}
