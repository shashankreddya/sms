<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "_http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>edit marks</title>
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
	  <form action="../editmarks" method="post" >
	 
	   <br><br><br><br><br><br>
	 <h2 align="center"><font color="white">Edit Marks</font></h2>
	<table align="center" cellspacing="20" style="margin-top: 50px">

		

			

		<tr>
			<td><font color="white">Enter Subject1 Marks:</font></td>
			<td><input style="background-color: #FAFAD2" type="text" name="sub1" id="sub1" ></td>
			  <td width="300"><span id="sub1" style="color:red"></span></td>
		</tr>
		<tr>
			<td><font color="white">Enter Subject2 Marks:</font></td>
			<td><input style="background-color: #FAFAD2" type="text" name="sub2" id="sub2" ></td>
			  <td width="300"><span id="sub2" style="color:red"></span></td>
		</tr>
		<tr>
			<td><font color="white">Enter Subject3 Marks:</font></td>
			<td><input style="background-color: #FAFAD2" type="text" name="sub3" id="sub3" ></td>
			  <td width="300"><span id="sub3" style="color:red"></span></td>
		</tr>
				<tr>
			<td><input type="submit" value="Edit" id="edit">
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