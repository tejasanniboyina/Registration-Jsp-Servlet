<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body >
	<div align="center">
		<h1 >Registration Form</h1>
		<form action="<%= request.getContextPath() %>/register" method="post">
			<table style="with:80%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" /></td>
				<tr>
				<tr>
					<td>Second Name</td>
					<td><input type="text" name="secondName" /></td>
				<tr>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username" /></td>
				<tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password" /></td>
				<tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				<tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="contact" /></td>
				<tr>
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>
	

</body>
</html>