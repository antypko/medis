package com.chetyrkin.medis.transformer;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.chetyrkin.medis.domain.Doctor;
import com.chetyrkin.medis.dto.DoctorDTO;

@Component("doctorTransformer")
public class DoctorTransformer {
	
	public DoctorDTO toDTO(final Doctor doctor) {
		if(doctor == null) {
			return new DoctorDTO();
		}
		DoctorDTO doctorDTO = new DoctorDTO();
		doctorDTO.setId(doctor.getId());
		doctorDTO.setName(doctor.getName());
		doctorDTO.setSurname(doctor.getSurname());
		doctorDTO.setFathersName(doctor.getFathersName());
		doctorDTO.setProfession(doctor.getProfession());
		doctorDTO.setAssignment(doctor.getAssignment());
		doctorDTO.setDepartment(doctor.getDepartment());
		return doctorDTO;
	}
	
	public Doctor toDomain(final DoctorDTO doctorDTO) {
		if(doctorDTO == null) {
			return new Doctor();
		}
		Doctor doctor = new Doctor();
		doctor.setId(doctorDTO.getId());
		doctor.setName(doctorDTO.getName());
		doctor.setSurname(doctorDTO.getSurname());
		doctor.setFathersName(doctorDTO.getFathersName());
		doctor.setProfession(doctorDTO.getProfession());
		doctor.setAssignment(doctorDTO.getAssignment());
		doctor.setDepartment(doctorDTO.getDepartment());
		return doctor;
	}
	
	public Set<DoctorDTO> toDTO(final Collection<Doctor> doctors) {
		Set<DoctorDTO> doctorsDTO = new HashSet<DoctorDTO>();
		for(Doctor doctor : doctors) {
			doctorsDTO.add(this.toDTO(doctor));
		}
		return doctorsDTO;
	}

}
