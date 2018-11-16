<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="../css/style.css"/>
</head>
<body>

		 <div class="navbar">	
			<div class="experience">
				Please Register for Awesome Experience
			</div>
			<a style="float:right;" href="../index.jsp">Go Back to Welcome Page</a>
		</div>	
		
		<div class="login-page">
  			<div class="form">
			    <form action="register"  method="post" class="login-form">
			      <input type="text" placeholder="user name" name="username"/>
			      <input type="password" placeholder="password" name="password"/>
			      <input type="text" placeholder="email address" name="email"/>
			      <input type="submit" value="Register"/> 
			     <!--  <button type="submit" ></button> -->
			    </form>
			</div>
		</div>



</body>
</html>