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
		if(null == patient) {
			return new PatientDTO();
		}
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
	
	public Patient toDomain(final PatientDTO patientDTO) {
		Patient patient =  new Patient();
		patient.setId(patientDTO.getId());
		patient.setName(patientDTO.getName());
		patient.setSurname(patientDTO.getSurname());
		patient.setFathersName(patientDTO.getFathersName());
		patient.setBloodType(patientDTO.getBloodType());
		patient.setSex(patientDTO.getSex());
		patient.setTelephone(patientDTO.getTelephone());
		patient.setWorkAdress(patientDTO.getWorkAdress());
		patient.setLiveAdress(patientDTO.getLiveAdress());
		patient.setSpeciaAccounting(patientDTO.getSpecialAccounting());
		patient.setHiv(patientDTO.getHiv());
		System.out.println(patient);
		return patient;
	}
	
	public Set<PatientDTO> toDTO(Collection<Patient> patients) {
		Set<PatientDTO>patientsData = new HashSet<>();
		for(Patient patient : patients) {
			patientsData.add(toDTO(patient));
		}
		return patientsData;
	}
}
