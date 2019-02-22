<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书信息录入</title>
</head>
<body>
	<h2>书信息录入</h2>
	<mvc:form modelAttribute = "BookAuthor" action="addBook.mvc">
		<table>
			<tr>
				<td><mvc:label path="title">书名：</mvc:label></td>
				<td><mvc:input path="title"/></td>
			</tr>
			<tr>
				<td><mvc:label path="description">描述：</mvc:label></td>
				<td><mvc:input path="description"/></td>
			</tr>
			<tr>
				<td><mvc:label path="longDescription">详细信息：</mvc:label></td>
				<td><mvc:textarea path="longDescription"/></td>
			</tr>
			<tr>
				<td><mvc:label path="firstName">作者姓：</mvc:label></td>
				<td><mvc:input path="firstName"/></td>
			</tr>
			<tr>
				<td><mvc:label path="lastName">作者名：</mvc:label></td>
				<td><mvc:input path="lastName"/></td>
			</tr>
			<tr>
				<td><mvc:label path="street">街道：</mvc:label></td>
				<td><mvc:input path="street"/></td>
			</tr>
			<tr>
				<td><mvc:label path="city">城市：</mvc:label></td>
				<td><mvc:input path="city"/></td>
			</tr>
			<%-- <tr>
				<td><mvc:label path="gender">Gender</mvc:label></td>
				<td><mvc:radiobuttons path="gender" items="${genders}"/></td>
			</tr> --%>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</mvc:form>
</body>
</html>