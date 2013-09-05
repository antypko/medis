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
	<h3>Сторінка редагування даних доктора</h3>
	 <form class="well" id="edit_doctor_form">
	 	<input type="text" name="id" id="id_input" hidden="true" readonly="readonly" value="${doctor.id}"/>
	 	<label for="name_input">Ім'я: </label>
		<input type="text" name="name" id="name_input" value="${doctor.name}" />
		<label for="surname_input">Прізвище: </label>
		<input type="text" name="surname" id="surname_input" value="${doctor.surname}" />
		<label for="fathersName_input">По-батькові: </label>
		<input type="text" name="fathersName" id="fatherName_input" value="${doctor.fathersName}" />
		<label for="profession_input">Професія: </label>
		<input type="text" name="profession" id="profession_input"  value="${doctor.profession}"/>
		<label for="assignment_input">Призначення: </label>
		<input type="text" name="assignment" id="assignment_input" value="${doctor.assignment}"/>
		<label for="department_input">Відділення: </label>
		<input type="text" name="department" id="department_input" value="${doctor.department}"/>
      	<input class="btn btn-info" type="submit" value="Save Doctorr" />
      	<div class="alert alert-error" id="warn_message" style="display: none;"></div>
	 </form>
</body>
<script>

$("#edit_doctor_form").submit(editDoctor);
</script>
</html>
