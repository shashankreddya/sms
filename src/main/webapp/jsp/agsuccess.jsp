<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "_http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="/sms/css/style1.css" rel="stylesheet" type="text/css" />
<link rel="icon" href="images/icon.ico" />
<body>

<div id="headerbg">
  <div id="headerblank">
    <div id="header">
	<div id="menublank">
      <div id="menu">
        <ul>
          <li><a href="/sms/jsp/gdmshome.jsp" class="menu">Home </a></li>
          <li><a href="/sms/jsp/aboutus.jsp"  class="menu">About Us</a></li>
          <li style="margin-right: 320px;"><a href="#" class="menu">Contact Us</a></li>
          <li><h3 style="color: white;">Logged in as</h3></li>
									<%
									
									String type=(String)session.getAttribute("type");
									%>
							<li><h3 style="color:white; margin-left: 10px;"><%=type%>!</h3></li>
							<li><a href="/sms/jsp/signout.jsp" class="menu">Sign out</a></li>
        </ul>
      </div>
	  </div>
	  <br>
	  <br>
	  <br>
	  <h2 align="center" style="padding-top: 150px;padding-left:20px"><font color="white">Adding Gift Successfully <%=request.getAttribute("giftsubid")%></font></h2>
	  <div style="margin-right: 60px;margin-left: 440px;margin-top: 20px">
	  <form action="/sms/addgift" method="get">
	  <br></br>
	  <br></br>
	  <input type="submit" value="Add One More Gift" align="right"></input>
	  </form>
	  </div>
</div></div></div>

<div id="footerbg">
		<div id="footerblank">
			<div id="footer">
				<div id="footerlinks">
					<a href="#" class="footerlinks">Home</a> | <a href="#"
						class="footerlinks">About Us</a> | <a href="#" class="footerlinks">Contact
						Us</a>
				</div>
				<div id="copyrights">� CTS GDMS. All Rights Reserved.</div>

			</div>
		</div>
	</div>
</body>
</html>