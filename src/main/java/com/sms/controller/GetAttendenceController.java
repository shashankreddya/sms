package com.sms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.bo.GetAttendenceBO;
import com.sms.vo.Attendence;

public class GetAttendenceController extends HttpServlet{

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
		final Attendence attend=new Attendence();
		if(request.getParameter("getatd") != null)
		{
		flag = request.getParameter("getatd");
		}
		if(request.getParameter("studentId") != null)
		{
		studentId = request.getParameter("studentId");
		attend.setStudentId(studentId);
		}
		else
		{
			studentId = (String)session.getAttribute("custID");
			attend.setStudentId(studentId);
			
		};
		String date = request.getParameter("date");
		
		attend.setStudentId(studentId);
		attend.setDate(date);
		GetAttendenceBO bo = new GetAttendenceBO();
		Attendence atd = bo.getAttendence(attend);
		if(atd != null)
		{			
			url="/jsp/displayattendence.jsp";
			if(flag != null)
			{
			if(flag.equalsIgnoreCase("Get Attendence"))
			{
				url="/jsp/updateattend.jsp";
			}
			}
			
			session.setAttribute("studentId",atd.getStudentId());
			session.setAttribute("date", atd.getDate());
			session.setAttribute("attendence", atd.getAttendence());
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
