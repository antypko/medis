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
<h1>Сторінка з паціентами</h1>
<a href="${pageContext.request.contextPath}/home/">На головну сторінку</a>
<a href="${pageContext.request.contextPath}/newPatient/">Зареєструвати нового паціента</a>
<button id="get_Patients" type="submit" name="Get patients" value="Get patients">Показати всіх паціентів</button>

<label for="name_search_input">Шукати паціента за ім'ям: </label>
<input type="text" name="name_search_input" id="name_search_input" />

<table id ="patients_table">
	<thead>
		<tr>
			<th>Id</th>
			<th>Ім'я</th>
			<th>Прізвище</th>
			<th>Стать</th>
			<th>Дата народження</th>
			<th>Группа крові</th>
			<th>Телефон</th>
		</tr>
	</thead>
	<tbody>
	</tbody>
</table>
</body>
<script> 
	$("#get_Patients").click(showPatients);
	$("#name_search_input").keyup(searchByName);
	$(".patient_row").click(function(){console.log(this);});
</script>
</html>