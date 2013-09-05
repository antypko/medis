<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="../fragments/headTag.jsp"/>
<body>
<jsp:include page="../fragments/bodyHeader.jsp"/>
<h3>Сторінка з дохторами</h3>
<div>Зареєструвати нового дохтора</div>
    <form class="well" id="new_doctor_form">
		<label for="name_input">Ім'я: </label>
		<input type="text" name="name" id="name_input"  />
		<label for="surname_input">Прізвище: </label>
		<input type="text" name="surname" id="surname_input" />
		<label for="fathersName_input">По-батькові: </label>
		<input type="text" name="fathersName" id="fatherName_input" />
		<label for="profession_input">Професія: </label>
		<input type="text" name="profession" id="profession_input" />
		<label for="assignment_input">Призначення: </label>
		<input type="text" name="assignment" id="assignment_input" />
		<label for="department_input">Відділення: </label>
		<input type="text" name="department" id="department_input" />
      	<input class="btn btn-info" type="submit" value="Save Doctor" />
      	<div class="alert alert-error" id="warn_message" style="display: none;"></div>
    </form>
</body>
<script> 
	$("#new_doctor_form").submit(addNewDoctor);
</script>
</html>
