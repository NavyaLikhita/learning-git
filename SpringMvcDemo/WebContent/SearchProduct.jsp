<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a:form action="searchdata" , method="post">
<table>
<tr>
<td>Product Id </td>
<td><input type="text" name="pid"/> </td>
</tr>
<tr>
<td><input type="submit" value="Show Product"/> </td>
</tr>
</a:form>
</table>
<jsp:include page="FoundProduct.jsp"></jsp:include>
</body>
</html>