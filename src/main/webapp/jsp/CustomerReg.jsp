<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>

<link href="/sms/css/style1.css" rel="stylesheet" type="text/css" />
<link rel="icon" href="images/icon.ico" />
<link rel="stylesheet" href="/sms/css/jquery-ui.custom.css" />
<link rel="stylesheet" href="/sms/css/jquery-ui.custom.min.css" />
<script language="javascript" src="/sms/js/CustomerValidation.js"></script>

<script src="/sms/js/jquery-ui.custom.min.js"></script>
<script src="/sms/js/jquery.js"></script>
<script src="/sms/js/jquery-ui.custom.js"></script>
<script type="text/javascript">
	$(function() {
		$("#datepicker1").datepicker();
	});
</script>

</head>
<body >
<div id="headerbg">
  <div id="headerblank">
    <div id="header">
	<div id="menublank">
      <div id="menu">
        <ul>
          <li><a href="/sms/jsp/gdmshome.jsp" class="menu">Home </a></li>
          <li><a href="/sms/jsp/aboutus.jsp"  class="menu">About Us</a></li>
          <li style="margin-right: 390px;"><a href="/sms/jsp/contactus.jsp" class="menu">Contact Us</a></li>
          
            <li><a href="/sms/jsp/Login.jsp" class="menu">Login</a></li>
        </ul>
      </div>
	  </div>
	  
	  <form action="crsuccess.jsp" onsubmit="return formvalidationcust()">
	    <br><br>
	    <h2 align="center"><font color="white">SCHOOL MANAGEMENT SYSTEM</font></h2>
	    <br>
              <h3 align="center"><font color="white">USER REGISTRATION</font></h3>
				<table align="center" cellspacing="20">

					<tr>
						<td style="text-align: center;" colspan="2"></td>
					</tr>

					<tr>
					
						<td><font color="white" >First Name</font></td>
						<td><input style="background-color: #FAFAD2" type="text" name="firstName"
							id="firstName" onblur="return isalphaspace(this)" onkeyup="return clearSpan('firstName1')">
						</td>
						<td width=300><span id="firstName1" style="color: red"></span>
						</td>
					</tr>

					<tr>
						<td><font color="white">Last Name</font></td>
						<td><input style="background-color: #FAFAD2" type="text" name="lastName"
							id="lastName" onkeyup="return clearSpan('lastName1')">
						</td>
						<td><span id="lastname1" style="color:red"></span></td>
					</tr>

					<tr>
						<td><font color="white">Password</font></td>
						<td><input style="background-color: #FAFAD2" type="password" name="passWord"
							id="passWord" onblur="return isPassword(this)" onkeyup="return clearSpan('passWord1')" >
						</td>
						<td><span id="passWord1" style="color: red"></span>
						</td>
					</tr>

					<tr>
						<td><font color="white">Retype Password</font></td>
						<td><input style="background-color: #FAFAD2" type="password"
							name="retypepassWord" id="retypepassWord" onblur="return isRepassword(this,document.getElementById('passWord'))"
							onkeyup="return clearSpan('retypepassWord1')">
						</td>
						<td><span id="retypepassWord1" style="color: red"></span></td>
					</tr>

					<tr>
						<td><font color="white">Contact No</font></td>
						<td><input style="background-color: #FAFAD2" type="text" name="contactNo"
							id="contactNo" onblur="return iscontactno(this)" onkeyup="return clearSpan('contactNo1')">
						</td>
						<td><span id="contactNo1" style="color: red"></span>
						</td>
					</tr>

					<tr>
						<td><font color="white">Date Of Birth</font></td>
						<td><input style="background-color: #FAFAD2" type="text" name="dateOfBirth"
							id="datepicker1">
						</td>
						<td><span id="datepicker12" style="color:red"></span></td>
					</tr>

					<tr>
						<td><font color="white">Address</font></td>
						<!--  <td><input type="text" name="address" id="address" rows="4" cols="5"></td>-->
					 
						  <td><textarea  style="background-color: #FAFAD2" name="address" id="address"
								rows="3" cols="16"></textarea>
						</td>
						<td><span id="address1" style="color:red"></span></td>
					</tr>


					<tr>
						<td><font color="white">Gender</font></td>
						<td><select style="background-color: #FAFAD2" id="gender" name="gender" style="position: relative; width: 100%; height: 25px; border: 2px solid #456879; border-radius: 10px;">
								<option value="" id="select12">--select--</option>
								<option value=male>Male</option>
								<option value=female>Female</option>
						</select></td>
						<td><span id="gender1" style="color:red"></span></td>
					</tr>

					<%-- <tr>
						<td><font color="white">Email Id</font></td>
						<td><input style="background-color: #FAFAD2" type="text" name="emailId"
							id="emailId" onchange="return isemailid(this)" onkeyup="return clearSpan('emailId1')" >
						</td>
						<td><span id="emailId1" style="color: red"></span><h4 style="color: red">${message}</h4> </td>
						<!--  <td><span id="emailId1" style="color: red"></span> <h4 style="color: red">${message}</h4></td>-->
					</tr>
 --%>
					<tr>
						<td><font color="white">Login Type</font></td>
						<td><select style="background-color: #FAFAD2" id="loginType" name="loginType"
							style="position: relative; width: 100%; height: 25px; border: 2px solid #456879; border-radius: 10px;">
								<option value=select>--select--</option>
								<option value=student>Student</option>
								<option value=teacher>Teacher</option>
								<option value=admin>Admin</option>
								
						</select></td>
						<td><span id="loginType1" style="color:red"></span></td>
					</tr>

					<tr>
						<td><input type="submit" value="Register" ></td>
						<td></td>
						<td><input type="reset" value="Reset">
						</td>
					</tr>

				</table>
		</form>
		
</div>
</div>
</div>
</body>
</html>