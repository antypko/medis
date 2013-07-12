package com.chetyrkin.medis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chetyrkin.medis.dto.PatientDTO;
import com.chetyrkin.medis.service.PatientService;

@Controller
@RequestMapping("/newPatient")
public class NewPatientController {

	private PatientService patientService;
	
	public NewPatientController() {
		super();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showNewPatientPage() {
		return "newPatient";
	}

	@RequestMapping(value = "/addPatient", method = RequestMethod.POST)
	public @ResponseBody
	PatientDTO registerNewPatient(final PatientDTO patientDTO) {
		patientService.saveOrUpdate(patientDTO);
		return patientDTO;
	}
	
	@Autowired
	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}
}
