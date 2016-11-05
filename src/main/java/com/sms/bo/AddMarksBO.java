package com.sms.bo;


import com.sms.dao.AddMarksDAO;
import com.sms.vo.Marks;

public class AddMarksBO {
	
	public int addMarks(Marks marks)
	{
		AddMarksDAO dao= new AddMarksDAO();
		int flag = dao.addMarks(marks);
		return flag;
		
	}

}
