package com.chetyrkin.medis.dao.impl;

import org.springframework.stereotype.Repository;

import com.chetyrkin.medis.dao.MedicalCardDAO;
import com.chetyrkin.medis.domain.MedicalCard;

@Repository("eventDAO")
public class MedicalCardDAOImpl extends GenericDAOImpl<MedicalCard, Long> implements MedicalCardDAO {

	protected MedicalCardDAOImpl() {
		super(MedicalCard.class);
	}

	

}
