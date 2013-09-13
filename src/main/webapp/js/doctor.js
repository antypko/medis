function fillTableForMedicalCard(doctors) {
	$("#doctors_table tbody").empty();
	$.each(doctors, function() {
		var varId = this.id;
		var varName = this.name;
		var doctor_id = $("<td id='doctor_id'></td>").text(this.id);
		var doctor_name = $("<td></td>").text(this.name + " " + this.surname + " " + this.fathersName);
		var doctor_profession = $("<td></td>").text(this.profession);
		var doctor_assignment = $("<td></td>").text(this.assignment);
		var doctor_department = $("<td></td>").text(this.department);
		var doctor_edit_button = $("<td> <button class='btn btn-info' type='button'>Призначити доктора</button></td>");
		doctor_edit_button.click(function(){			
			$("#doctorId_input").val(varId);
			$("#doctorName_input").val(varName);
		});
		var doctor_row = $("<tr class='patient_row'></tr>").append(doctor_id, doctor_name, doctor_profession, 
				doctor_assignment, doctor_department, doctor_edit_button);
		$("#doctors_table tbody").append(doctor_row);
	});
};

function fillTableForDoctorsPage(doctors) {
	$("#doctors_table tbody").empty();
	$.each(doctors, function() {
		var varId = this.id;
		var doctor_id = $("<td id='doctor_id'></td>").text(this.id);
		var doctor_name = $("<td></td>").text(this.name);
		var doctor_surname = $("<td></td>").text(this.surname);
		var doctor_fathersName = $("<td></td>").text(this.fathersName);
		var doctor_profession = $("<td></td>").text(this.profession);
		var doctor_assignment = $("<td></td>").text(this.assignment);
		var doctor_department = $("<td></td>").text(this.department);
		var doctor_edit_button = $("<td> <button class='btn btn-info' type='button'>Редагувати дані</button></td>");
		var doctor_row = $("<tr class='patient_row'></tr>").append(doctor_id, doctor_name, doctor_surname, 
				doctor_fathersName, doctor_profession, doctor_assignment, doctor_department, doctor_edit_button);
		doctor_edit_button.click(function(){
			document.location = "http://" + document.location.host + "/medis/editDoctor/" + varId;
		});
		$("#doctors_table tbody").append(doctor_row);
	});
};

function showDoctors(fillTable) {
	$.ajax({
		url: "http://" + document.location.host + "/medis/doctorsList/getDoctors"
	}).done(function (data) {
		fillTable(data);
	});
};

function addNewDoctor(e) {
	if(validateDoctorForm()) {
		$.post("addDoctor", $(this).serialize(), 
				function(response) { 
					document.location = "http://" + document.location.host + "/medis/editDoctor/" + response.id;
				}
		);
		e.preventDefault();	
	} else 
		return false;
};

function editDoctor(e) {
	if(validateDoctorForm()) {
		$.post("update", $(this).serialize(), function(data){});
		e.preventDefault();	
	} else return false;
};

function validateDoctorForm(){
	if (!$("#name_input").val() 
			|| !$("#surname_input").val() 
			|| !$("#fatherName_input").val()) {
		$("#warn_message").text("Введіть всі поля");
		$("#warn_message").show();
		return false;
	} else 
		return true;
};

