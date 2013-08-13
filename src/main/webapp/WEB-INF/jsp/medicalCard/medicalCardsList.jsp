<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="../fragments/headTag.jsp"/>
<body>
	<h1>Медичні картки</h1>

	<a href="${pageContext.request.contextPath}/home">На головну сторінку</a>
	<button id="get_medicalCards" type="submit" name="Get medical cards" value="Get medical cards">Показати всі медичні картки</button>
	<table id="medical_cards_table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Прізвище, ім"я, по батькові</th>
				<th>Дата</th>
				<th></th>
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