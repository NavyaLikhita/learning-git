<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<form action="first.jsp">
		Enter Id: <input type="text"><br> Enter Name: <input
			type="text"><br> Technology<br> <input
			type="checkbox" name="id" value="Java">Java<br> <input
			type="checkbox" name="id" value="C#">C#<br> <input
			type="checkbox" name="id" value="Angular">Angular<br> <input
			type="checkbox" name="id" value="AWS">AWS<br> <input
			type="checkbox" name="id" value="Python">Python<br> <input
			type="checkbox" name="id" value="PHP">PHP<br> Gender <input
			type="radio" name="F" value="Female">Female<br> <input
			type="radio" name="M" value="Male">Male<br>
		Qualification<br> <select>


			<option value="MSc">MSc</option>
			<option value="BTech">BTech</option>
			<option value="MBA">MBA</option>
			<option value="MTech">MTech</option>


		</select> <br> <input type="button" name="submit" value="submit">
		<input type="button" name="clean" value="clean"><br>




	</form>









</body>
</html>