<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css"/>
</head>
<body>
		 <div class="navbar">	
				<a style="float:left;" href="./views/shoppingPage.jsp">Explore Without Registering</a>	
			<div style="bottom:735px; margin-left:620px">
				<a style="position: fixed;" class="greeting" >Welcome to My Shopping Website</a>
			</div>
				<a style="float:right;" href="views/register.jsp">Register as New Customer</a>
		</div>		
		<div class="login-page">
  			<div class="form">
			    
			    <form action="login" class="login-form" method="post">
			      <input type="text" placeholder="username" name="username"/>
			      <input type="password" placeholder="password" name="password"/>
			      <button type="submit">login</button>
			      <p class="message" style="color:red;" name="errorMsg">${errorMsg}</p>
			    </form>
  			</div>
		</div>
		
		<div style="position: fixed ;bottom:250px;left:650px;">
			<img src="welcomepage1.jpg"/>
		</div>

	
		<div class="experience">
			
		</div>
		
</body>
</html>