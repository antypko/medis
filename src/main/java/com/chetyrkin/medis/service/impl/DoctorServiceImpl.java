package com.chetyrkin.medis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chetyrkin.medis.dao.DoctorDAO;
import com.chetyrkin.medis.service.DoctorService;

@Service("doctorService") 
@Transactional(readOnly = true)
public class DoctorServiceImpl implements DoctorService {

	private DoctorDAO doctorDAO;
	
	@Autowired
	public DoctorServiceImpl(DoctorDAO doctorDAO){
		this.doctorDAO = doctorDAO;
	}
	

}
