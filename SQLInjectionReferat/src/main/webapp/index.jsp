
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>This is SQLInjection Example!</h1>

<!-- 	<form action="userCheck">
		<input type="text" name="user" value="" /> <input type="submit"
			value="Submit" />
	</form>
 -->
	<h2>Example query 1: "SELECT * FROM User where userid='"+user+"' and password='"+password+"'";</h2>
	<form action="userCheck">
		<input type="text" placeholder="Username" name="username"> 
		<input type="text" placeholder="Password" name="password">
		<button type="submit">Login</button>
	</form>
	
	<h2> Example query 2: "SELECT email, password, userId, firstName FROM User where email='"+email+"'"</h2>	
	<form action="example2">
		<input type="text" placeholder="Email" name="email"> 
		<button type="submit">Submit</button>
	</form>
</body>
</html>
