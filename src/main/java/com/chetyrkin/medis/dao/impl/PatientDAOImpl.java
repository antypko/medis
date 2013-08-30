package com.chetyrkin.medis.dao.impl;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Junction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.chetyrkin.medis.dao.PatientDAO;
import com.chetyrkin.medis.domain.Patient;

@Repository("patientDAO")
public class PatientDAOImpl extends GenericDAOImpl<Patient, Long> implements PatientDAO {
	
	public PatientDAOImpl () {
    	super(Patient.class);
	}

	public Set<Patient> searchPatient(String text) {
		Criterion nameRestriction = Restrictions.like("name", "%" + text + "%");
		Criterion surnameRestriction = Restrictions.like("surname", "%" + text + "%");
		Criterion fathersNameRestriction = Restrictions.like("fathersName", "%" + text + "%");
		Junction conditionGroup = Restrictions.disjunction();
		conditionGroup.add(nameRestriction).add(surnameRestriction).add(fathersNameRestriction);
		return new HashSet<Patient>(this.findByCriteria(conditionGroup));
	}
}
