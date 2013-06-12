package com.chetyrkin.medis.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chetyrkin.medis.domain.Patient;
import com.chetyrkin.medis.service.PatientService;

@Controller
@RequestMapping("/patients")
public class PatientController {
	
	private PatientService patientService;
	
	@Autowired
	public PatientController (PatientService patientService) {
		this.patientService = patientService;
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showPatientsPage(final Map<String, Object> model){
//		model.put("patients", patientService.getAll());
		return "patients";
	}
	
	@RequestMapping(value = "/getPatients", method = RequestMethod.GET)
	@ResponseBody
	public List<Patient> getPatientsList(final Map<String, Object> model) {
//		model.put("patients", patientService.getAll());
		return patientService.getAll();
	}
	

}
