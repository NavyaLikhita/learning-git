<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="addProduct" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Add product
<table>
<addProduct:form action="pagesubmit" method="post" modelAttribute="product_details">
<tr>
<td>Product ID: </td>
<td><addProduct:input path="productId"/></td>
<td> <span><addProduct:errors path="productId"></addProduct:errors> </span> </td>
</tr>
<tr>
<td>Product Name: </td>
<td><addProduct:input path="productName"/></td>
</tr>
<tr>
<td>Product Price: </td>
<td><addProduct:input path="productPrice"/></td>
</tr>
<tr>
<td>Product Type: </td>
<td><addProduct:select path="productType" items="${dataitem}"/></td>
</tr>

<tr>
<td>Product Online: </td>
<td><addProduct:radiobutton path="online" value="online"/>yes</td>
<td><addProduct:radiobutton path="online" value="notonline"/>no</td>
</tr>

<tr>
<td>Product Color: </td>
<td><addProduct:checkbox path="productColor" value="Red"/>Red</td>
<td><addProduct:checkbox path="productColor" value="Blue"/>Blue</td>
<td><addProduct:checkbox path="productColor" value="Yellow"/>Yellow</td>
</tr>


<tr>
<td><input type="submit" value="Add Product"></td>
</tr>
</addProduct:form>
</table>
</body>
</html>