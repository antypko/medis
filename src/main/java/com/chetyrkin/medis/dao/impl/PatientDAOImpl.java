package com.chetyrkin.medis.dao.impl;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.chetyrkin.medis.dao.PatientDAO;
import com.chetyrkin.medis.domain.Patient;

@Repository("patientDAO")
public class PatientDAOImpl extends AbstractDAOImpl<Patient, Long> implements PatientDAO {
	
	public PatientDAOImpl () {
    	super(Patient.class);
	}

	public Set<Patient> searchByName(String name) {
		return new HashSet<Patient>(this.findByCriteria(Restrictions.like("name", "%" + name + "%")));
	}
}
