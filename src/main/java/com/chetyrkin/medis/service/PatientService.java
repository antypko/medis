package com.chetyrkin.medis.service;

import java.util.Set;

import com.chetyrkin.medis.domain.Patient;

public interface PatientService extends AbstractService<Patient, Long> {
	
	public Set<Patient> searchByName(String name);
	
}
