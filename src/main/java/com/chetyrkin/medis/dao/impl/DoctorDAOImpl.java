package com.chetyrkin.medis.dao.impl;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Junction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.chetyrkin.medis.dao.DoctorDAO;
import com.chetyrkin.medis.domain.Doctor;
import com.chetyrkin.medis.domain.Patient;

@Repository("doctorDAO")
public class DoctorDAOImpl extends GenericDAOImpl<Doctor, Long> implements DoctorDAO {

	protected DoctorDAOImpl() {
		super(Doctor.class);
	}

	@Override
	public Set<Doctor> searchDoctor(String text) {
		Criterion nameRestriction = Restrictions.like("name", "%" + text + "%");
		Criterion surnameRestriction = Restrictions.like("surname", "%" + text + "%");
		Criterion fathersNameRestriction = Restrictions.like("fathersName", "%" + text + "%");
		Junction conditionGroup = Restrictions.disjunction();
		conditionGroup.add(nameRestriction).add(surnameRestriction).add(fathersNameRestriction);
		return new HashSet<Doctor>(this.findByCriteria(conditionGroup));
	}

}
