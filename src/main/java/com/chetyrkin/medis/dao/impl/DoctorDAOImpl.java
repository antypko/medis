package com.chetyrkin.medis.dao.impl;

import org.springframework.stereotype.Repository;

import com.chetyrkin.medis.dao.DoctorDAO;
import com.chetyrkin.medis.domain.Doctor;

@Repository("doctorDAO")
public class DoctorDAOImpl extends GenericDAOImpl<Doctor, Long> implements DoctorDAO {

	protected DoctorDAOImpl() {
		super(Doctor.class);
	}

}
