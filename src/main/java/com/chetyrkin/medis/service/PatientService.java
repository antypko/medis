package com.chetyrkin.medis.service;

import java.util.Set;

import com.chetyrkin.medis.domain.Patient;
import com.chetyrkin.medis.dto.PatientDTO;

public interface PatientService {
	
	public Set<PatientDTO> searchByName(String name);
	Set<PatientDTO> getAll();
	void saveOrUpdate(Patient patient);
}
