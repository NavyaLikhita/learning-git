<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<table border="1">

<tr>

<th>Employee Id</th>
<th>Employee Name</th>
<th>Employee Salary</th>

</tr>
<a:forEach var="emp" items="${data}">
<tr>


<td>${emp.empId} </td>
<td>${emp.empName} </td>
<td>${emp.empSal} </td>




</tr>
</a:forEach>
</table>




</body>
</html>