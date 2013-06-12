package com.chetyrkin.medis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetyrkin.medis.dao.PatientDAO;
import com.chetyrkin.medis.domain.Patient;
import com.chetyrkin.medis.service.PatientService;

@Service("patientService") 
public class PatientServiceImpl extends AbstractServiceImpl<Patient, Long> implements PatientService {
	
	@Autowired
	protected PatientServiceImpl(PatientDAO patientDAO) {
		super(patientDAO);
	}

}
