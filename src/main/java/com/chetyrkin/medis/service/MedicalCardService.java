package com.chetyrkin.medis.service;

import java.util.Set;

import com.chetyrkin.medis.dto.MedicalCardDTO;

public interface MedicalCardService {

	Set<MedicalCardDTO> getAll();
}
