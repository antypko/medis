package com.chetyrkin.medis.dao;

import java.util.Set;

import com.chetyrkin.medis.domain.Patient;

public interface PatientDAO extends GenericDAO<Patient, Long> {

	public Set<Patient> searchByName(String name);
}
