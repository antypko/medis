package com.chetyrkin.medis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chetyrkin.medis.dao.MedicalCardDAO;
import com.chetyrkin.medis.service.MedicalCardService;

@Service("eventService") 
@Transactional(readOnly = true)
public class MedicalCardServiceImpl implements MedicalCardService {

	
	private MedicalCardDAO eventDAO;
	
	@Autowired
	public MedicalCardServiceImpl(MedicalCardDAO eventDAO) {
		this.eventDAO = eventDAO;
	}
}
