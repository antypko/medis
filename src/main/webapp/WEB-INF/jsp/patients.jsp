<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/patient.js"></script>
<title>Medis</title>
</head>
<body>
<h1>Patients page</h1>

<button id="get_Patients" type="submit" name="Get patients" value="Get patients">Get Patients</button>
<table id ="patients_table">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Surname</th>
			<th>Gender</th>
			<th>Birth date</th>
			<th>Blood type</th>
			<th>Telephone</th>
		</tr>
	</thead>
	<tbody>
	</tbody>
</table>

<%-- <c:if test="${!empty patients}">
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
	</c:if> --%>
<a href="${pageContext.request.contextPath}/home/">Back</a>
</body>
<script> 
	$("#get_Patients").click(showPatients);
			
	/*		function(){
		console.log(document.location);
		$.get("getPatients", function(data) {
			console.log(data);
		});
	});*/


</script>
</html>