<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="fo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Add Employee
	<table>
		<fo:form action="pagesubmit" method="post" modelAttribute="myemp">

			<tr>
				<td>Employee Id</td>
				<td><fo:input path="empId" /></td>
			</tr>

			<tr>
				<td>Employee Name</td>
				<td><fo:input path="empName" /></td>
			</tr>

			<tr>
				<td>Employee Salary</td>
				<td><fo:input path="empSal" /></td>
			</tr>
			
			
			<tr>
			<td><input type="submit" value="Add Employee"/></td>
			
			</tr>
			
			
		
	</fo:form>
	</table>

</body>
</html>