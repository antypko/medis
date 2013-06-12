function showPatients() {
	console.log(document.location);
	$.get("getPatients", function(data) {
		console.log(data);
		clearTable();
		$.each(data, function() {
			var patient_id = $("<td></td>").text(this.id);
			var patient_name = $("<td></td>").text(this.name);
			var patient_surname = $("<td></td>").text(this.surname);
			var patient_gender = $("<td></td>").text(this.sex);
			var patient_birth_date = $("<td></td>").text(this.birthDate);
			var patient_blood_type = $("<td></td>").text(this.bloodType);
			var patient_telephone = $("<td></td>").text(this.telephone);
			var patient_row = $("<tr></tr>").append(patient_id, patient_name,
					patient_surname, patient_gender, patient_birth_date,
					patient_blood_type, patient_telephone);
			$("#patients_table tbody").append(patient_row);
		});
	});
}

function clearTable() {
	$("#patients_table tbody").empty();
}