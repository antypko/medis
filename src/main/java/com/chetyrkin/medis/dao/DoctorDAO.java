package com.chetyrkin.medis.dao;

import java.util.Set;

import com.chetyrkin.medis.domain.Doctor;

public interface DoctorDAO extends GenericDAO<Doctor, Long>{
	
	public Set<Doctor> searchDoctor(String text);

}
