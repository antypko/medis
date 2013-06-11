package com.chetyrkin.medis.dao.impl;

import org.springframework.stereotype.Repository;

import com.chetyrkin.medis.dao.PatientDAO;
import com.chetyrkin.medis.domain.Patient;

@Repository("patientDAO")
public class PatientDAOImpl extends AbstractDAOImpl<Patient, Long> implements PatientDAO {
	
	public PatientDAOImpl () {
    	super(Patient.class);
	}
}
