<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<form:form modelAttribute="book" action="bookProcess" method="post">
			Roomnumber:<input type="text" name="roomnumber" required><br><br>
			<!-- <div class="field">
				<p>Room number :</p>
				<select name="select" id="#" required>
					<option value="-">-</option>
					<option value="1">101</option>
					<option value="2">102</option>
					<option value="3">201</option>
					<option value="4">202</option>
					<option value="5">301</option>
					<option value="6">302</option>
					<option value="7">401</option>
					<option value="8">402</option>
					<option value="9">501</option>
					<option value="10">502</option>
				</select>
			</div> -->
			Roomtype:<input type="text" name="roomtype" required><br><br>
			<!-- <div class="field">
				<p>room type :</p>
				<select name="select" id="#" required>
					<option value="-">-</option>
					<option value="1">Super</option>
					<option value="2">Super</option>
					<option value="3">Ultra</option>
					<option value="4">Ultra</option>
					<option value="5">Deluxe</option>
					<option value="6">Deluxe</option>
					<option value="7">Premium</option>
					<option value="8">Premium</option>
					<option value="9">Posh</option>
					<option value="10">Posh</option>
				</select>
			</div> -->
			No.of.persons to stay:<input type="text" name="persons" required><br><br>
			<!-- <div class="field">
				<p>number of people :</p>
				<select name="select1" id="#" required>
					<option value="-">-</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="5">6</option>
					<option value="5">7</option>
					<option value="5">8</option>
					<option value="5">9</option>
				</select>
			</div> -->
			Check-in:<input type="date" name="checkin" required><br><br>
			Check-out:<input type="date" name="checkout" required><br><br>
			
			<input type="submit" value="Book"><br><br>
			<a href="home.jsp">Home</a><br><br>
			
	</form:form>

</body>
</html>