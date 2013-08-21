<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="../fragments/headTag.jsp"/>
<body>
<jsp:include page="../fragments/bodyHeader.jsp"/>
	<h3>Стоворити нову медичну картку</h3>
	 <form class="well" id="new_medicalCard_form">
	 	<label for="patientName_input">№ паціента: </label>
	 	<input type="text" name="patient.id" id="patient.id" readonly="readonly" value="${patient.id}"/>
	 	<label for="patientName_input">Ім'я паціента: </label>
	 	<input type="text" name="patient.name" id="patient.name" readonly="readonly" value="${patient.name}"/>
	 	<label for="clinicName_input">Назва клініки: </label>
		<input type="text" name="clinicName" id="clinicName_input" />
 		<label for="hospitalized_in_planned_order">Госпіталізований в плановому порядку: </label>
		<select id="hospitalized_in_planned_order" name="hospitalizedInPlannedOrder">
			<option value="true">ТАК</option>
			<option value="false">НІ</option>
		</select>
		<input class="btn btn-info" type="submit" value="Save medical card" />
	 </form>
</body>
<script>
	$("#new_medicalCard_form").submit(addNewMedicalCard);
</script>
</html>