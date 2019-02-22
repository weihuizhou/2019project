<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书籍</title>
</head>
<body>
	<h2>所有书籍</h2>
		<c:forEach items="${booklist}" var="book" >
		<br>
		<table>
			<tr>
				<td>书名：</td>
				<td><c:out value="${book.title}"></c:out></td>
			</tr>
			<tr>
				<td>描述：</td>
				<td>${book.description}</td>
			</tr>
			<tr>
				<td>详细信息：</td>
				<td>${book.longDescription}</td>
			</tr>
			<tr>
				<td>作者姓名：</td>
				<td>${book.firstName} ${book.lastName}</td>
			</tr>
			<tr>
				<td>街道：</td>
				<td>${book.street}</td>
			</tr>
			<tr>
				<td>城市</td>
				<td>${book.city}</td>
			</tr>
		</table>
		</c:forEach>
</body>
</html>