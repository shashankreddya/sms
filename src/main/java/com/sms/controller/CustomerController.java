package com.sms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.bo.CustomerRegBO;
import com.sms.vo.CustomerRegVO;
import com.sms.vo.LoginVO;

/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
	    throws ServletException, IOException {
	final CustomerRegBO cbo = new CustomerRegBO();
	final HttpSession session = request.getSession();
	RequestDispatcher rDispatcher;
	final CustomerRegVO cvo = (CustomerRegVO) session.getAttribute("customer");
	String url = "";
	System.out.println(cvo.getDateOfBirth());
	String temp;
	try {
	    temp = cbo.insertDataBO(cvo);
	    final String data[] = temp.split(" ");
	    System.out.println(data[1] + "hello ");
	    session.setAttribute("custID", data[1]);
	    if ("succes".equalsIgnoreCase(data[0])) {
		url = "/jsp/crsuccess1.jsp";
		rDispatcher = request.getRequestDispatcher(url);
		rDispatcher.forward(request, response);
	    }
	    /*
	     * else if("email exists".equalsIgnoreCase(temp)) { url =
	     * "/jsp/CustomerReg.jsp"; rDispatcher =
	     * request.getRequestDispatcher(url); request.setAttribute(
	     * "message","Email already exists,please enter new one");
	     * rDispatcher.forward(request, response); }
	     */else {
		doPost(request, response);
	    }

	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    url = "/jsp/crerror.jsp";
	}
    }

    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
	    throws ServletException, IOException {
	RequestDispatcher rDispatcher;
	String url = "";
	HttpSession session = request.getSession();
	final LoginVO loginVO = new LoginVO();
	loginVO.setUserName(request.getParameter("userName"));
	loginVO.setPassword(request.getParameter("passWord"));
	final CustomerRegBO customerRegBO = new CustomerRegBO();
	String type;
	try {
	    type = customerRegBO.loginCheck(loginVO);

	    String fname[] = type.split(" ");
	    System.out.println("cont" + fname[0]);

	    if ("student".equalsIgnoreCase(fname[0].trim())) {

		url = "/jsp/studenthome.jsp";
		session.setAttribute("type", fname[1]);
		session.setAttribute("custID", fname[2]);
		rDispatcher = request.getRequestDispatcher(url);
		rDispatcher.forward(request, response);
	    } else if ("teacher".equalsIgnoreCase(fname[0].trim())) {
		session.setAttribute("type", fname[1]);
		session.setAttribute("custID", fname[2]);
		url = "/jsp/home.jsp";

		rDispatcher = request.getRequestDispatcher(url);
		rDispatcher.forward(request, response);
	    } else if ("admin".equalsIgnoreCase(fname[0].trim())) {
		session.setAttribute("type", fname[1]);
		session.setAttribute("custID", fname[2]);
		url = "/jsp/home.jsp";

		rDispatcher = request.getRequestDispatcher(url);
		rDispatcher.forward(request, response);

	    } else {
		url = "/jsp/crerror.jsp";
		rDispatcher = request.getRequestDispatcher(url);
		rDispatcher.forward(request, response);
	    }
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    url = "/jsp/crerror.jsp";
	}
    }
}