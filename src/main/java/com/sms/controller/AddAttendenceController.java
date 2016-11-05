package com.sms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.bo.AddAttendenceBO;
import com.sms.vo.Attendence;

public class AddAttendenceController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rDispatcher;
		String url="";
		HttpSession session=request.getSession();
		final Attendence attend = new Attendence();
		String studentId = request.getParameter("studentId");
		String date = request.getParameter("date");
		String attendence = request.getParameter("attended");
		attend.setStudentId(studentId);
		attend.setDate(date);
		attend.setAttendence(attendence);
		AddAttendenceBO bo =new AddAttendenceBO();
		int flag=0;
		flag = bo.addAttendence(attend);
		
		if(flag == 1)
		{			
			url="/jsp/crsuccess.jsp";
			rDispatcher=request.getRequestDispatcher(url);
			rDispatcher.forward(request, response);
		}else
		{
			url="/jsp/crerror.jsp";
			rDispatcher=request.getRequestDispatcher(url);
			rDispatcher.forward(request, response);
		}
			
		}
}
