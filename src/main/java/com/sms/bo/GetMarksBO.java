package com.sms.bo;



import com.sms.dao.GetMarksDAO;
import com.sms.vo.Marks;

public class GetMarksBO {
	
	public Marks getMarks(Marks marks)
	{
		GetMarksDAO dao= new GetMarksDAO();
		Marks mrks = dao.getMarks(marks);
		return mrks;
		
	}


}
