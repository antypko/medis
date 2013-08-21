package com.chetyrkin.medis.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chetyrkin.medis.dao.PatientDAO;
import com.chetyrkin.medis.domain.Patient;
import com.chetyrkin.medis.dto.PatientDTO;
import com.chetyrkin.medis.service.PatientService;
import com.chetyrkin.medis.transformer.PatientTransformer;

@Service("patientService") 
@Transactional(readOnly = true)
public class PatientServiceImpl implements PatientService {
	
	private PatientDAO patientDAO;
	
	@Autowired
	private PatientTransformer patientTransformer;
	
	@Autowired
	protected PatientServiceImpl(PatientDAO patientDAO) {
		this.patientDAO = patientDAO;
	}

	@Override
	public Set<PatientDTO> searchByName(String name) {
		return patientTransformer.toDTO(patientDAO.searchByName(name));
	}

	@Override
	public Set<PatientDTO> getAll() {
		return patientTransformer.toDTO(patientDAO.getAll());
	}

	@Override
	@Transactional(readOnly = false)
	public PatientDTO saveOrUpdate(PatientDTO patientDTO) {
		Patient patient = patientTransformer.toDomain(patientDTO);
		patientDAO.saveOrUpdate(patient);
		return patientTransformer.toDTO(patient);
	}

	@Override
	public PatientDTO findById(Long id) {
		return patientTransformer.toDTO(patientDAO.findById(id));
	}
	
	
	

}
