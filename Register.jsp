<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<script>  
function validateform(){  
var name=document.myform.name.value;  
var password=document.myform.password.value;  
var repassword=document.myform.repassword.value;  
var phone=document.myform.phoneno.value;  
if(phone.length!=10)
	{
	 alert("Phone Number length should be 10");  
	  return false; 
	}
 if(password.length<6 ){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  
 else
	 {
	 if(password != repassword)  
	  {   
	    alert("Passwords did not match");  
	    return false;
	  } else {  
	    alert("Password created successfully");  
	    return true;
	  } 
	 
	 }
}  
</script>  
<body style="background-color:lightsteelblue">
<div align="center">
<form name="myform" method="post" action="RegisterServlet" onsubmit="return validateform()">
<h1>REGISTRATION FORM</h1>
<table>
 <tr> <td> Name: </td> <td> <input type="text" name="name" style="width:150px;height:40px; "required> </td> </tr>
 <tr> <td> Email Address: </td> <td> <input type="text" name="email"style="width:150px;height:40px; "required> </td> </tr>
 <tr> <td> Phone Number: </td> <td> <input type="text" name="phoneno" style="width:150px;height:40px; "required> </td> </tr>
  <tr> <td> Password: </td> <td> <input type="Password" name="password" style="width:150px;height:40px; "required><span id = "message" style="color:red"> </span>  </td> </tr> 
   <tr> <td> Confirm Password: </td> <td> <input type="Password" name="repassword" style="width:150px;height:40px; "required> </td> </tr>
   
  </table> 
  
   <input type="submit" value="REGISTER" name="register"  style="background-color:black;color:white;width:150px;height:40px; ">
   
</form>
</div>
</body>

</html>