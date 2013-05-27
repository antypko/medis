package com.chetyrkin.medis.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chetyrkin.medis.dao.PatientDAO;
import com.chetyrkin.medis.domain.Patient;

@Repository
public class PatientDAOImpl implements PatientDAO {
	
    private SessionFactory sessionFactory;
	
    @Autowired
	public PatientDAOImpl (SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(Patient patient) {
		sessionFactory.getCurrentSession().save(patient);
	}

	@SuppressWarnings(value ="unchecked")
	public List<Patient> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Patient").list();
	}

	public Patient get(Long id) {
		return (Patient) sessionFactory.getCurrentSession().load(
                Patient.class, id);
	}
	
	public void delete(Patient patient) {
		sessionFactory.getCurrentSession().delete(patient);
	}

}
