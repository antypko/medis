package com.chetyrkin.medis.service;

import java.util.Set;

import com.chetyrkin.medis.dto.DoctorDTO;

public interface DoctorService {

	public Set<DoctorDTO> searchDoctor(String text);
	Set<DoctorDTO> getAll();
	DoctorDTO saveOrUpdate(DoctorDTO patient);
	DoctorDTO findById(Long id);

}
