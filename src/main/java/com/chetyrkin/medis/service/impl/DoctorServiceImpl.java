package com.chetyrkin.medis.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chetyrkin.medis.dao.DoctorDAO;
import com.chetyrkin.medis.domain.Doctor;
import com.chetyrkin.medis.dto.DoctorDTO;
import com.chetyrkin.medis.service.DoctorService;
import com.chetyrkin.medis.transformer.DoctorTransformer;

@Service("doctorService") 
@Transactional(readOnly = true)
public class DoctorServiceImpl implements DoctorService {
	
	private DoctorDAO doctorDAO;
	
	private DoctorTransformer doctorTransformer;
	
	@Override
	public Set<DoctorDTO> searchDoctor(String text) {
		return doctorTransformer.toDTO(doctorDAO.searchDoctor(text));
	}

	@Override
	public Set<DoctorDTO> getAll() {
		return doctorTransformer.toDTO(doctorDAO.getAll());
	}

	@Override
	@Transactional(readOnly = false)
	public DoctorDTO saveOrUpdate(DoctorDTO doctorDTO) {
		Doctor doctor = doctorTransformer.toDomain(doctorDTO);
		doctorDAO.saveOrUpdate(doctor);
		return doctorTransformer.toDTO(doctor);
	}

	@Override
	public DoctorDTO findById(Long id) {
		return doctorTransformer.toDTO(doctorDAO.findById(id));
	}

	@Autowired
	public void setDoctorDAO(DoctorDAO doctorDAO) {
		this.doctorDAO = doctorDAO;
	}

	@Autowired
	public void setDoctorTransformer(DoctorTransformer doctorTransformer) {
		this.doctorTransformer = doctorTransformer;
	}

}
