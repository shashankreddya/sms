package com.sms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.bo.CreateBO;
import com.sms.vo.Student;

public class CreateController extends HttpServlet {
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
	CreateBO bo = new CreateBO();
	int flag = 0;
	flag = bo.createStudentIdentity(student);

	if (flag == 1) {
	    url = "/jsp/crsuccess.jsp";
	    rDispatcher = request.getRequestDispatcher(url);
	    rDispatcher.forward(request, response);
	} else {
	    url = "/jsp/crerror.jsp";
	    rDispatcher = request.getRequestDispatcher(url);
	    rDispatcher.forward(request, response);
	}

    }
}
