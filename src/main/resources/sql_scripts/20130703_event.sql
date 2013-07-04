CREATE TABLE medis.event (
	id BIGINT UNSIGNED NOT NULL UNIQUE AUTO_INCREMENT,
	patient_id BIGINT UNSIGNED NOT NULL,
	date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	clinic_name VARCHAR(20) CHARACTER SET utf8 NOT NULL,
	hours_after_accident INT NULL,
	hospitalized_in_planned_order BOOL NOT NULL,
	hospitalization_diagnosis VARCHAR(50) CHARACTER SET utf8 NULL,
	facility_diagnosis VARCHAR(50) CHARACTER SET utf8 NULL,
	clinical_diagnosis VARCHAR(50) CHARACTER SET utf8 NULL,
	FOREIGN KEY (patient_id) REFERENCES patient(id),
	PRIMARY KEY (id)
)ENGINE=INNODB CHARACTER SET utf8 COLLATE utf8_general_ci;

ALTER TABLE doctor ADD PRIMARY KEY(id);