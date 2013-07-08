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

<h2>Submit new Patient</h2>
    <form id="new_patient_form">
		<label for="name_input">Ім'я: </label>
		<input type="text" name="name" id="name_input" />
		<label for="surname_input">Прізвище: </label>
		<input type="text" name="surname" id="surname_input" />
		<label for="fathersName_input">По-батькові: </label>
		<input type="text" name="fathersName" id="fatherName_input" />
		<select name="sex">
			<option value="true">М</option>
			<option value="false">Ж</option>
		</select>
      	<input type="submit" value="Save Patient" />
      	
    </form>
<div id="patientFormResponse">${newPatient.name}</div>
</body>
<script> 
	$("#new_patient_form").submit(addNewPatient);
</script>
</html>