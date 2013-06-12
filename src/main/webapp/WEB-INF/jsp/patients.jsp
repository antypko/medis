<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Medis</title>
</head>
<body>
<h1>Patients page</h1>
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
<a href="${pageContext.request.contextPath}/home/">Back</a>
</body>
</html>