<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "_http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
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
          <li style="margin-right: 390px;"><a href="/sms/jsp/contactus.jsp" class="menu">Contact Us</a></li>
          <li><a href="/sms/jsp/CustomerReg.jsp" class="menu">Registration</a></li>
          
           
        </ul>
      </div>
	  </div>
	  	  	  <br><br><br><br><br>
	 <h2 align="center"><font color="white">Login</font></h2>
	  <form action="studenthome.jsp" method="post" onsubmit="return formvalidationlogin()"> 
	<table align="center" cellspacing="20" style="margin-top: 50px">

		

		<tr>
			<td><font color="white">User Name</font></td>
			<td><input style="background-color: #FAFAD2" type="text" name="userName" id="userName"></td>
			  <td width="300"><span id="userName1" style="color:red"></span></td>
		</tr>

		<tr>
			<td><font color="white">Password</font></td>
			<td><input style="background-color: #FAFAD2" type="password" name="passWord" id="passWord"></td>
			<td><span id="passWord1" style="color:red"></span></td>
		</tr>

		<tr>
			<td><font color="white">Login Type</font></td>
			<td><select style="background-color: #FAFAD2" id="loginType" name="loginType">
					<option value="" id="select1">--Select--</option>
					<option  value="C">Student</option>
					<option  value="A">Teacher</option>
					<option  value="A">Admin</option>
			</select></td>
			<td><span id="loginType1" style="color:red"></span></td>
		</tr>
		
		<tr>
		
		<td><a href="/sms/jsp/CustomerReg.jsp"><font style="color:white"><font>Sign Up</font></a></td>
		</tr>

		<tr>
			<td><input type="submit" value="Login" id="login">
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
				<div id="copyrights">� CTS GDMS. All Rights Reserved.</div>

			</div>
		</div>
	</div>

</body>
</html>