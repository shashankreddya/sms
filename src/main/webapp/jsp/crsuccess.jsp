<%@page import="com.sms.constants.SQLConstants"%>
<%@page import="com.sms.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="/sms/css/style1.css" rel="stylesheet" type="text/css" />
<link rel="icon" href="images/icon.ico" />
<title>Insert title here</title>
</head>
<body>
<div id="headerbg">
  <div id="headerblank">
    <div id="header">
	<div id="menublank">
      <div id="menu">
        <ul>
          <li><a href="/sms/jsp/gdmshome.jsp" class="menu">Home </a></li>
          <li><a href="/sms/jsp/aboutus.jsp"  class="menu">About Us</a></li>
          <li style="margin-right: 390px;"><a href="#" class="menu">Contact Us</a></li>
         
            <li><a href="/sms/jsp/Login.jsp" class="menu">Login</a></li>
        </ul>
        
      </div>
	  </div>
	 <br>
	 <br>
	 <br>
	<%
			String custId = (String) session.getAttribute("custID");
		%>
		<h2 align="center">
			<font color="white">Action Performed Successfully </font>
		</h2>
		
	

	
</div>
</div>
</div>



	
</body>
</html>