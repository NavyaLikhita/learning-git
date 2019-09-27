<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="tag" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tag:form action="productsubmit" method="POST" modelAttribute="product1">
			<tr>
				<td>Product Id</td>
				<td><tag:input path="productId" /></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><tag:input path="productName" /></td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><tag:input path="productCost" /></td>
			</tr>
			<%-- <tr>
				<td>Product Features:</td>
				<td><tag:input path="productFeatures" /></td>
			</tr>
			<tr>
				<td>Product Type</td>
				<td><tag:input path="productType" /></td>
			</tr>
			<tr>
				<td>Online</td>
				<td><tag:input path="online" /></td>
			</tr> --%>
			<tr>
			<td><input type="submit" value="Add Product"/></td>
			</tr> 
		</tag:form>
	</table>
</body>
</html>