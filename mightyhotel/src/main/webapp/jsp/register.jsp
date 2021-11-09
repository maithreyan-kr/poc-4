<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	
	<form:form modelAttribute="user" action="registerProcess" method="post">
			Username:<input type="text" name="Username" required><br><br>
			password:<input type="password" name="password" required><br><br>
			firstname:<input type="text" name="firstname" required><br><br>
			lastname:<input type="text" name="lastname" required><br><br>
			email:<input type="text" name="email" required><br><br>
			address:<input type="text" name="address" required><br><br>
			phone:<input type="text" name="phone" required><br><br>
			<input type="submit" value="Register"><br><br>
			<a href="home.jsp">Home</a><br><br>
		<form align="center">	
	</form:form>

</body>
</html>