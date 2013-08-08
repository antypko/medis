<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="../fragments/headTag.jsp"/>
<body>
	<h1>Сторінка редагування даних паціента</h1>
	<a href="${pageContext.request.contextPath}/home/">На головну сторінку</a>
	 <form id="edit_patient_form">
	 	<input type="text" name="id" id="id_input" hidden="true" value="${patient.id}"/>
	 	<label for="name_input">Ім'я: </label>
		<input type="text" name="name" id="name_input" value="${patient.name}"/>
		<label for="surname_input">Прізвище: </label>
		<input type="text" name="surname" id="surname_input"  value="${patient.surname}"/>
		<label for="fathersName_input">По-батькові: </label>
		<input type="text" name="fathersName" id="fatherName_input" value="${patient.fathersName}"/>
		<label for="blood_type_input">Група крові: </label>
		<select id="blood_type_input" name="bloodType">
			<option value="Ap">Ap</option>
			<option value="An">An</option>
			<option value="Op">Op</option>
			<option value="On">On</option>
			<option value="Bp">Bp</option>
			<option value="Bn">Bn</option>
			<option value="ABp">ABp</option>
			<option value="ABn">Abn</option>
		</select> 
		<%-- <label for="birth_date_input">Дата народження: </label>
		<input type="text" name="birthDate" id="birth_date_input" value="${patient.birthDate}"/> --%>
		<label for="telephone_input">Телефонний номер: </label>
		<input type="text" name="telephone" id="telephone_input" value="${patient.telephone}"/>
		<label for="work_adress_input">Місце роботи: </label>
		<input type="text" name="workAdress" id="work_adress_input" value="${patient.workAdress}"/>
		<label for="live_adress_input">Домашня адреса: </label>
		<input type="text" name="liveAdress" id="live_adress_input" value="${patient.liveAdress}"/>
		<label for="special_accounting_input">Спецоблік: </label>
		<input type="text" name="specialAccounting" id="special_accounting_input" value="${patient.specialAccounting}"/>
		<label for="hiv_input">Віл статус</label>
		<select id="hiv_input" name="hiv">
			<option value="false">Негативно</option>
			<option value="true">Позитивно</option>
		</select>
		<label for="sex_input">Стать</label>
		<select id="sex_input" name="sex">
			<option value="true">М</option>
			<option value="false">Ж</option>
		</select>
      	<input type="submit" value="Save Patient" />
	 </form>
	<div>${patient.name}</div>
</body>
<script>
$("#blood_type_input").val("${patient.bloodType}");
$("#hiv_input").val("${patient.hiv}");
$("#sex_input").val("${patient.sex}");
$("#edit_patient_form").submit(editPatient);
</script>
</html>