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
			<td>Welcome ${firstname}</td>
			<td>${lastname}</td>
		</tr>
		
	

	<h1 style="text-align: center; color: black">Welcome to MiGhTy Hotels</h1>
	<br>
	<h4>Welcoming you to best hotels in South India</h4>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/spring_mvc" user="root"
		password="maith15@10" />
<p style="text-align:right" > Available - green</p>
<p style="text-align:right"> Booked - Red</p>
	<sql:query dataSource="${db}" var="rs">  
SELECT * from room;  
</sql:query>

	<table border="1" width="50%" align="center">
		<tr>
			<th style="color: black">RoomNumber</th>
			<th style="color: black">RoomType</th>
			<th style="color: black">Availability</th>
		</tr>
		<c:forEach var="table" items="${rs.rows}">
			<tr>
				<th><c:out value="${table.room_number}" /></th>
				<th><c:out value="${table.room_type}" /></th>
				<c:choose>
					<c:when test="${table.availability=='Booked'}">
						<th style="color: Red"><c:out value="${table.availability }" /></th>
					</c:when>
					<c:otherwise>
						<th style="color: green"><c:out value="${table.availability }" /></th>
					</c:otherwise>
				</c:choose>
				
			</tr>
		</c:forEach>
	</table>
<a href="book"><button>Book</button></a>

	</div>
		<tr>
			<td><a href="home.jsp">Home</a></td>
		
		</tr>
	</table>
</body>
</html>