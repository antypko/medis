package com.chetyrkin.medis.dao;

import java.util.List;

import com.chetyrkin.medis.domain.Patient;

public interface PatientDAO  {

	public void save(Patient patient);

	public List<Patient> getAll();

	public Patient get(Long id);
	
	public void delete(Patient patient);

}
