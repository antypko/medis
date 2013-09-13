<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="../fragments/headTag.jsp" />
<body>
	<jsp:include page="../fragments/bodyHeader.jsp" />
	<h3>Сторінка з докторами</h3>
	<a class="btn btn-info" href="${pageContext.request.contextPath}/newDoctor/">Зареєструвати нового дохтора</a>
	<button class="btn btn-info" id="get_Doctors" type="submit" name="Get doctors" value="Get doctors">
		Показати всіх докторів
	</button>
	<table id ="doctors_table" class="table table-striped table-condensed">
		<thead>
			<tr>
				<th>Id</th>
				<th>Ім'я</th>
				<th>Прізвище</th>
				<th>По-батькові</th>
				<th>Профессія</th>
				<th>Призначення</th>
				<th>Відділення</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
</body>
<script>
	$("#get_Doctors").click(function() {showDoctors(fillTableForDoctorsPage);});
</script>
</html>