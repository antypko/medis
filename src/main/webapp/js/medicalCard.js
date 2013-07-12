function showMedicalCards() {
	$.get("getMedicalCards", function(data) {
		fillTable(data);
	});
};





function fillTable(medicalCards) {
	$("#medical_cards_table tbody").empty();
	$.each(medicalCards, function() {
		console.log(this);
		var varId = this.id;
		var medicalCard_id = $("<td id='medicalCard_id'></td>").text(this.id);
		var medicalCard_fullname= $("<td></td>").text(this.patient.name + " " + this.patient.surname + " " + this.patient.fathersName);
		var medicalCard_date = $("<td></td>").text(this.date);
		var medicalCard_row = $("<tr class='medicalCard_row'></tr>").append(medicalCard_id, medicalCard_fullname,
				medicalCard_date);
		medicalCard_row.click(function(){
			console.log(varId);
//			document.location = "http://" + document.location.host + "/medis/editMedicalCard/" + varId;
		});
		$("#medical_cards_table tbody").append(medicalCard_row);
	});
};