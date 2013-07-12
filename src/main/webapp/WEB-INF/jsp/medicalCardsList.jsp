<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/medicalCard.js"></script>
<title>Medis</title>
</head>
<body>
	<h1>Медичні картки</h1>

	<a href="${pageContext.request.contextPath}/home">На головну сторінку</a>
	<a href="${pageContext.request.contextPath}/newMedicalCard">Створити медичну карточку</a>
	<button id="get_medicalCards" type="submit" name="Get medical cards" value="Get medical cards">Показати всі медичні картки</button>
	<table id="medical_cards_table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Прізвище, ім"я, по батькові</th>
				<th>Дата</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
</body>
<script>
$("#get_medicalCards").click(showMedicalCards);
</script>
</html>