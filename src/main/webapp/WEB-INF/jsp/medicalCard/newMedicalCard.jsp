<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="../fragments/headTag.jsp"/>
<body id="body">
<jsp:include page="../fragments/bodyHeader.jsp"/>
	<h3>Стоворити нову медичну картку</h3>
	 <form class="well" id="new_medicalCard_form">
	 	<label for="patientId_input">№ паціента: </label>
	 	<input type="text" name="patient.id" id="patientId_input" readonly="readonly" value="${patient.id}"/>
	 	<label for="patientName_input">Ім'я паціента: </label>
	 	<input type="text" name="patient.name" id="patientName_input" readonly="readonly" value="${patient.name}"/>
	 	<label for="doctorId_input">№ доктора: </label>
		<input type="text" name="doctor.id" id="doctorId_input" readonly="readonly" />
		<label for="doctorName_input">Ім'я дуктора: </label>
		<input type="text" name="doctor.name" id="doctorName_input" readonly="readonly"/>
	 	<label for="clinicName_input">Назва клініки: </label>
		<input type="text" name="clinicName" id="clinicName_input" required/>
 		<label for="hospitalized_in_planned_order">Госпіталізований в плановому порядку: </label>
		<select id="hospitalized_in_planned_order" name="hospitalizedInPlannedOrder">
			<option value="true">ТАК</option>
			<option value="false">НІ</option>
		</select>
		<input class="btn btn-info" type="submit" value="Save medical card" />
	</form>
	<a href="#myModal" role="button" class="btn" data-toggle="modal">Вибрати доктора</a>
	<div id="myModal" class="modal hide fade">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
			<h3>Вибір доктора</h3>
		</div>
		<div class="modal-body">
			<button class="btn btn-info" id="get_Doctors" type="submit" name="Get doctors" value="Get doctors">
				Показати всіх докторів
			</button>
			<table id ="doctors_table" class="table table-striped table-condensed table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Ім'я прізвище по-батькові</th>
						<th>Профессія</th>
						<th>Призначення</th>
						<th>Відділення</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
		</div>
		<div class="modal-footer">
			<a href="#" class="btn" data-dismiss="modal">Закрити</a>
		</div>
	</div>
</body>
<script>
	$("#new_medicalCard_form").submit(addNewMedicalCard);
	$("#get_Doctors").click(function(){showDoctors(fillTableForMedicalCard);});
</script>
</html>