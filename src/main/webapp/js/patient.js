function showPatients() {
	$.get("patientsList/getPatients", function(data) {
		fillTable(data);
	});
};

function searchByName() {
	var name = $("#name_search_input").val();
	if (name.length < 3) {
		return true;
	} else {
		$.get("patientsList/searchByName/", {'name' : name}, function(data) {
			fillTable(data);
		});
	}
};

function addNewPatient(e) {
	if(validateForm()) {
		$.post("addPatient", $(this).serialize(), 
				function(response) { 
			document.location = "http://" + document.location.host + "/medis/editPatient/" + response.id;
			  });
		e.preventDefault();	
	} else return false;
};

function editPatient(e) {
	if(validateForm()) {
		$.post("update", $(this).serialize(), function(data){});
		e.preventDefault();	
	} else return false;
};

function fillTable(patients) {
	$("#patients_table tbody").empty();
	$.each(patients, function() {
		var varId = this.id;
		var patient_id = $("<td id='patient_id'></td>").text(this.id);
		var patient_name = $("<td></td>").text(this.name);
		var patient_surname = $("<td></td>").text(this.surname);
		var patient_gender = $("<td></td>").text(this.sex);
		var patient_birth_date = $("<td></td>").text(this.birthDate);
		var patient_blood_type = $("<td></td>").text(this.bloodType);
		var patient_telephone = $("<td></td>").text(this.telephone);
		var patient_medicalCard_button = $("<td> <button class='btn btn-info' type='button'>Добавити карточку!</button></td>");
		var patient_edit_button = $("<td> <button class='btn btn-info' type='button'>Редагувати дані</button></td>");
		var patient_row = $("<tr class='patient_row'></tr>").append(patient_id, patient_name,
				patient_surname, patient_gender, patient_birth_date,
				patient_blood_type, patient_telephone, patient_medicalCard_button, patient_edit_button);
		
		patient_medicalCard_button.click(function(){
			document.location = "http://" + document.location.host + "/medis/medicalCard/newMedicalCard?id=" + varId;
		});
		patient_edit_button.click(function(){
			document.location = "http://" + document.location.host + "/medis/editPatient/" + varId;
		});
		$("#patients_table tbody").append(patient_row);
	});
};

function validateForm(){
	if (!$("#name_input").val() 
			|| !$("#surname_input").val() 
			|| !$("#fatherName_input").val() 
			|| !$("#birthDate_input").val()) {
		$("#warn_message").text("Введіть всі поля");
		$("#warn_message").show();
		return false;
	}  else if(!$("#birthDate_input").val().match(/^\d{4}-((0\d)|(1[012]))-(([012]\d)|3[01])$/)) {
		$("#warn_message").text("Введіть правильно дату народження");
		$("#warn_message").show();
		return false;
	} else 
		return true;
};

