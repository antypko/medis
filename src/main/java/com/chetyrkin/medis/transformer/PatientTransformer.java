package com.chetyrkin.medis.transformer;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.chetyrkin.medis.domain.Patient;
import com.chetyrkin.medis.dto.PatientDTO;

@Component("patientTransformer")
public class PatientTransformer {
	
	public PatientDTO toDTO(final Patient patient) {
		PatientDTO patientDTO = new PatientDTO();
		patientDTO.setId(patient.getId());
		patientDTO.setName(patient.getName());
		patientDTO.setSurname(patient.getSurname());
		patientDTO.setFathersName(patient.getFathersName());
		patientDTO.setBloodType(patient.getBloodType());
		patientDTO.setSex(patient.getSex());
		patientDTO.setTelephone(patient.getTelephone());
		patientDTO.setWorkAdress(patient.getWorkAdress());
		patientDTO.setLiveAdress(patient.getLiveAdress());
		patientDTO.setSpecialAccounting(patient.getSpeciaAccounting());
		patientDTO.setHiv(patient.getHiv());
		return patientDTO;
	}
	
	public Set<PatientDTO> toDTO(Collection<Patient> patients) {
		Set<PatientDTO>patientsData = new HashSet<>();
		for(Patient patient : patients) {
			patientsData.add(toDTO(patient));
		}
		return patientsData;
	}
}
