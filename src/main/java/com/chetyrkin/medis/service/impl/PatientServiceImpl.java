package com.chetyrkin.medis.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetyrkin.medis.dao.PatientDAO;
import com.chetyrkin.medis.domain.Patient;
import com.chetyrkin.medis.service.PatientService;

@Service("patientService") 
public class PatientServiceImpl extends AbstractServiceImpl<Patient, Long> implements PatientService {
	
	private PatientDAO patientDAO;
	
	@Autowired
	protected PatientServiceImpl(PatientDAO patientDAO) {
		super(patientDAO);
		this.patientDAO = patientDAO;
	}

	public Set<Patient> searchByName(String name) {
		return patientDAO.searchByName(name);
	}

}
