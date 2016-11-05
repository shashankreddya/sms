package com.sms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.bo.GetStudentBO;
import com.sms.vo.Student;

public class GetController extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
	    throws ServletException, IOException {
	RequestDispatcher rDispatcher;
	String url = "";
	HttpSession session = request.getSession();
	final Student student = new Student();
	String id = request.getParameter("studentId");
	String name = request.getParameter("studentName");
	String email = request.getParameter("studentMail");
	student.setId(id);
	student.setName(name);
	student.setEmail(email);
	GetStudentBO bo = new GetStudentBO();
	Student stu = bo.getStudentIdentity(student);
	if (stu != null) {
	    url = "/jsp/update.jsp";
	    session.setAttribute("studentId", stu.getId());
	    session.setAttribute("studentName", stu.getName());
	    session.setAttribute("studentEmail", stu.getEmail());
	    rDispatcher = request.getRequestDispatcher(url);
	    rDispatcher.forward(request, response);
	} else {
	    url = "/jsp/crerror.jsp";
	    rDispatcher = request.getRequestDispatcher(url);
	    rDispatcher.forward(request, response);
	}
    }

}
