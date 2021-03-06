function showMedicalCards() {
	$.get("medicalCard/getMedicalCards", function(data) {
		fillMedicalCardTable(data);
	});
};

function addNewMedicalCard(e) {
	$.post("newMedicalCard/addNewMedicalCard", $(this).serialize(), function(
			response) {
	});
	e.preventDefault();
};

function fillMedicalCardTable(medicalCards) {
	$("#medical_cards_table tbody").empty();
	$.each(medicalCards, 
			function() {
				var date = new Date(this.date);
				var varId = this.id;
				var medicalCard_id = $("<td id='medicalCard_id'></td>").text(this.id);
				var medicalCard_fullname = $("<td></td>").text(this.patient.name + " " + this.patient.surname
						+ " " + this.patient.fathersName);
				var medicalCard_date = $("<td></td>").text($.datepicker.formatDate('dd - mm - yy', date));
				var medicalCard_downloadButton = $("<td><button class='btn btn-info' type='button'>Завантажити карточку</button></td>");
				medicalCard_downloadButton.click(function() {
					document.location = "http://" + document.location.host + "/medis/medicalCard/" + varId + "/getFile.pdf";
						});
				var medicalCard_row = $("<tr class='medicalCard_row'></tr>").append( medicalCard_id, medicalCard_fullname,
					medicalCard_date, medicalCard_downloadButton);
				$("#medical_cards_table tbody").append(medicalCard_row);
			}
	);
};