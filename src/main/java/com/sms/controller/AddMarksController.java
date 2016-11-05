package com.sms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.bo.AddAttendenceBO;
import com.sms.bo.AddMarksBO;
import com.sms.vo.Attendence;
import com.sms.vo.Marks;

public class AddMarksController extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rDispatcher;
		String url="";
		HttpSession session=request.getSession();
		final Marks marks = new Marks();
		String studentId = request.getParameter("studentId");
		String sub1 = request.getParameter("sub1");
		String sub2 = request.getParameter("sub2");
		String sub3 = request.getParameter("sub3");
		marks.setStudentId(studentId);
		marks.setSub1(sub1);
		marks.setSub2(sub2);
		marks.setSub3(sub3);
		AddMarksBO bo =new AddMarksBO();
		int flag=0;
		flag = bo.addMarks(marks);
		
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
