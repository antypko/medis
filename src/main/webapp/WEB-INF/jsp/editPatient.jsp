<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/patient.js"></script>
<title>Medis</title>
</head>
<body>
	<h1>Сторінка редагування даних паціента</h1>
	 <form id="edit_patient_form">
	 	<label for="name_input">Ім'я: </label>
		<input type="text" name="name" id="name_input" />
		<label for="surname_input">Прізвище: </label>
		<input type="text" name="surname" id="surname_input" />
		<label for="fathersName_input">По-батькові: </label>
		<input type="text" name="fathersName" id="fatherName_input" />
		<label for="blood_type_input">Група крові: </label>
		<input type="text" name="bloodType" id="blood_type_input" />
		<label for="birth_date_input">Дата народження: </label>
		<input type="text" name="birthDate" id="birth_date_input" />
		<label for="telephone_input">Телефонний номер: </label>
		<input type="text" name="telephone" id="telephone_input" />
		<label for="work_adress_input">Місце роботи: </label>
		<input type="text" name="workAdress" id="work_adress_input" />
		<label for="live_adress_input">Домашня адреса: </label>
		<input type="text" name="liveAdress" id="live_adress_input" />
		<label for="special_accounting_input">Спецоблік: </label>
		<input type="text" name="specialAccounting" id="special_accounting_input" />
		<label for="HIV_input">Віл: </label>
		<input type="text" name="HIV" id="HIV_input" />
		<input type="radio" name="sex" value="true" checked="checked" id="male"/>
		<label for="male">М</label>
		<input type="radio" name="sex" value="false" id="female"/>
		<label for="female">Ж</label>
      	<input type="submit" value="Save Patient" />
	 </form>
	<div>${patient.name}</div>
</body>
<script>
	
</script>
</html>