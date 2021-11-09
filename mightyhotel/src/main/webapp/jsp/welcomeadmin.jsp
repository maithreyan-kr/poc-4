<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<table>
		<tr>
			<td>Welcome ${username}</td>
			
		</tr>
		
	

	<h1 style="text-align: center; color: Green">MiGhTy Hotels</h1>
	<br>
	<h4>work hard be proud</h4>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/spring_mvc" user="root"
		password="maith15@10" />

	<sql:query dataSource="${db}" var="rs">  
SELECT * from book;  
</sql:query>

	<table border="1" width="50%" align="center">
		<tr>
			<th style="color: black">roomnumber</th>
			<th style="color: black">roomtype</th>
			<th style="color: black">persons</th>
			<th style="color: black">checkin</th>
			<th style="color: black">checkout</th>
		</tr>
		<c:forEach var="table" items="${rs.rows}">
			<tr>
				<th><c:out value="${table.roomnumber}" /></th>
				<th><c:out value="${table.roomtype}" /></th>
				<th><c:out value="${table.persons}" /></th>
				<th><c:out value="${table.checkin}" /></th>
				<th><c:out value="${table.checkout}" /></th>
				<%-- <c:choose>
					<c:when test="${table.availability=='Booked'}">
						<th style="color: Red"><c:out value="${table.availability }" /></th>
					</c:when>
					<c:otherwise>
						<th style="color: green"><c:out value="${table.availability }" /></th>
					</c:otherwise>
				</c:choose> --%>
				
			</tr>
		</c:forEach>
	</table>
<a href="adminlogin" method="post"><button>logout</button></a>
		<tr>
			<td><a href="home.jsp">Home</a></td>
		</tr>
	</table>
</body>
</html>