package com.sms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.vo.LoginVO;

/**
 * Servlet implementation class CustomerController
 */
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */

    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
	    throws ServletException, IOException {
	RequestDispatcher rDispatcher;
	String url = "";
	HttpSession session = request.getSession();
	final LoginVO loginVO = new LoginVO();
	String userName = request.getParameter("userName");
	String password = request.getParameter("passWord");
	loginVO.setUserName(userName);
	loginVO.setPassword(password);
	if ("admin".equalsIgnoreCase(userName) && "admin".equalsIgnoreCase(password)) {
	    url = "/jsp/menu.jsp";
	    session.setAttribute("userName", userName);
	    session.setAttribute("passWord", password);
	    rDispatcher = request.getRequestDispatcher(url);
	    rDispatcher.forward(request, response);
	} else {
	    url = "/jsp/crerror.jsp";
	    rDispatcher = request.getRequestDispatcher(url);
	    rDispatcher.forward(request, response);
	}
    }
}