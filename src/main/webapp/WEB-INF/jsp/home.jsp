<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Contacts</h3>
	<c:if test="${!empty patients}">
		<table class="data">
			<tr>
				<th>Id</th>
				<th>Name</th>
			</tr>
			<c:forEach items="${patients}" var="patient">
				<tr>
					<td>${patient.id}</td>
					<td>${patient.name}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>