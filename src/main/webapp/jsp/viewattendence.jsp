<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "_http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view attendence</title>
</head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="../css/style1.css" rel="stylesheet" type="text/css" />
<link rel="icon" href="images/icon.ico" />
  <script language="javascript" src="/sms/js/CustomerValidation.js"></script>




<body>

<div id="headerbg">
  <div id="headerblank">
    <div id="header">
	<div id="menublank">
      <div id="menu">
        <ul>
          <li><a href="/sms/jsp/gdmshome.jsp" class="menu">Home </a></li>
          <li><a href="/sms/jsp/aboutus.jsp"  class="menu">About Us</a></li>
          <li style="margin-right: 300px;"><a href="/sms/jsp/contactus.jsp" class="menu">Contact Us</a></li>
           <li><h3 style="color: white;">Logged in as </h3></li>
									<%
									
									String type=(String)session.getAttribute("type");
									%>
							<li><h3 style="color:white; margin-left: 10px;"><%=type%>!</h3></li>
							<li><a href="/sms/jsp/signout.jsp" class="menu">Sign out</a></li>
        </ul>
      </div>
	  </div>
	  <form action="../getattendence" method="post" >
	 
	   <br><br><br><br><br><br>
	 <h2 align="center"><font color="white">View Attendence</font></h2>
	<table align="center" cellspacing="20" style="margin-top: 50px">

		

		<tr>
			<td><font color="white">Enter StudentId:</font></td>
			<td><input style="background-color: #FAFAD2" type="text" name="studentId" id="studentId" ></td>
			  <td width="300"><span id="studentId" style="color:red"></span></td>
		</tr>

		<tr>
			<td><font color="white">Enter Date:</font></td>
			<td><input style="background-color: #FAFAD2" type="text" name="date" id="date"> &nbsp;&nbsp; <font color="white">(Enter the date dd-mm-yyy format)</font></td>
			<td><span id="date" style="color:red"></span></td>
		</tr>

		
		<tr>
			<td><input type="submit" value="Get Attendence" id="viewAttend">
			</td>
			
			<td><input type="reset" value="Reset" id="reset">
			</td>
			
		</tr>
    </table>
	</form>
</div>
</div>
</div>
<div id="footerbg">
		<div id="footerblank">
			<div id="footer">
				<div id="footerlinks">
					<a href="#" class="footerlinks">Home</a> | <a href="#"
						class="footerlinks">About Us</a> | <a href="#" class="footerlinks">Contact
						Us</a>
				</div>
				<div id="copyrights">© CTS GDMS. All Rights Reserved.</div>

			</div>
		</div>
	</div>

</body>
</html>