<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Show Product

<table border="1">

<tr>

<th>Product Id</th>
<th>Product Product</th>
<th>Product Price</th>

</tr>
<a:forEach var="pro" items="${data}">
<tr>


<td>${pro.prodId} </td>
<td>${pro.prodName} </td>
<td>${pro.prodPrice} </td>




</tr>
</a:forEach>
</table>


</body>
</html>