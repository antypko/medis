function showPatients() {
	$.get("getPatients", function(data) {
		fillTable(data);
	});
};

function searchByName() {
	var name = $("#name_search_input").val();
	if (name.length < 3) {
		return true;
	} else {
		$.get("searchByName/", {'name' : name}, function(data) {
			fillTable(data);
		});
	}
};

function addNewPatient(e) {
	$.post("addPatient", $(this).serialize(), 
			function(response) { $("#patientFormResponse").text("Паціент " + response.name + " був доданий успішно!!!!");});
	e.preventDefault();	
};

function editPatient(e) {
	$.ajax({
		  url: 'update',
		  type: 'PUT',
		  data: $(this).serialize(),
		  success: function(data) {}
		});
//	$.put("update", $(this).serialize(), function(response) {});
	e.preventDefault();	
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
		var patient_row = $("<tr class='patient_row'></tr>").append(patient_id, patient_name,
				patient_surname, patient_gender, patient_birth_date,
				patient_blood_type, patient_telephone);
		patient_row.click(function(){
//			console.log(document.location);
//			document.location = document.location.host + "/medis/editPatient/" + varId;
//			console.log("http://" + document.location.host + "/medis/editPatient/update");
			document.location = "http://" + document.location.host + "/medis/editPatient/" + varId;
		});
		$("#patients_table tbody").append(patient_row);
	});
	
};

