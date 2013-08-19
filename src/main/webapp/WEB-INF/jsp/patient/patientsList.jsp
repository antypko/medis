<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="../fragments/headTag.jsp"/>
<body>
<jsp:include page="../fragments/bodyHeader.jsp"/>
<h1>Сторінка з паціентами</h1>
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
			<th></th>
			<th></th>
		</tr>
	</thead>
	<tbody>
	</tbody>
</table>
</body>
<script> 
	$("#get_Patients").click(showPatients);
	$("#name_search_input").keyup(searchByName);
</script>
</html>