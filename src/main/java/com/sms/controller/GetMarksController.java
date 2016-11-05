package com.sms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.bo.GetAttendenceBO;
import com.sms.bo.GetMarksBO;
import com.sms.vo.Attendence;
import com.sms.vo.Marks;

public class GetMarksController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rDispatcher;
		String url="";
		HttpSession session=request.getSession();
		String studentId =null;
		String flag=null;
		final Marks marks=new Marks();
		if(request.getParameter("getmarks") != null)
		{
		flag = request.getParameter("getmarks");
		}
		
		if(request.getParameter("studentId") != null)
		{
		studentId = request.getParameter("studentId");
		marks.setStudentId(studentId);
		}
		else
		{
			studentId = (String)session.getAttribute("custID");
			marks.setStudentId(studentId);
			
		}
		
		GetMarksBO bo = new GetMarksBO();
		Marks mrks = bo.getMarks(marks);
		if(mrks != null)
		{	
			url="/jsp/displaymarks.jsp";
			if(flag != null)
			{
			if(flag.equalsIgnoreCase("Get Marks"))
			{
				url="/jsp/updatemarks.jsp";
			}
			}
			
			session.setAttribute("studentId",mrks.getStudentId());
			session.setAttribute("sub1", mrks.getSub1());
			session.setAttribute("sub2", mrks.getSub2());
			session.setAttribute("sub3", mrks.getSub3());
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
