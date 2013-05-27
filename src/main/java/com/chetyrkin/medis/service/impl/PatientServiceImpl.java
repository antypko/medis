package com.chetyrkin.medis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chetyrkin.medis.dao.PatientDAO;
import com.chetyrkin.medis.domain.Patient;
import com.chetyrkin.medis.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientDAO patientDAO;
	
	@Transactional
	public List<Patient> getAll() {
		return patientDAO.getAll();
	}

}
