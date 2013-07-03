package com.chetyrkin.medis.dao.impl;

import com.chetyrkin.medis.dao.DoctorDAO;
import com.chetyrkin.medis.domain.Doctor;

public class DoctorDAOImpl extends GenericDAOImpl<Doctor, Long> implements DoctorDAO {

	protected DoctorDAOImpl() {
		super(Doctor.class);
	}

}
