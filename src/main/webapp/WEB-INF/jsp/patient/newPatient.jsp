<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="../fragments/headTag.jsp"/>
<body>
<jsp:include page="../fragments/bodyHeader.jsp"/>
<h3>Сторінка з паціентами</h3>

<div>Зареєструвати нового паціента</div>
    <form id="new_patient_form">
		<label for="name_input">Ім'я: </label>
		<input type="text" name="name" id="name_input" />
		<label for="surname_input">Прізвище: </label>
		<input type="text" name="surname" id="surname_input" />
		<label for="fathersName_input">По-батькові: </label>
		<input type="text" name="fathersName" id="fatherName_input" />
		<label for="birthDate_input">Дата народження: </label>
		<input type="text" name="birthDate" id="birthDate_input" />
		<select name="sex">
			<option value="true">М</option>
			<option value="false">Ж</option>
		</select>
      	<input class="btn btn-info" type="submit" value="Save Patient" />
      	
    </form>
<div id="patientFormResponse">${newPatient.name}</div>
</body>
<script> 
	$("#new_patient_form").submit(addNewPatient);
	$(document).ready(function() {
	    $("#birthDate_input").datepicker();
	  });
</script>
</html>