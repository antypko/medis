package com.chetyrkin.medis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chetyrkin.medis.service.PatientService;

@Controller
@RequestMapping("/patientsList/editPatient")
public class EditPatientController {

	private PatientService patientService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) 
	public String getEditPatient(@PathVariable final Long id, ModelMap modelMap) {
		modelMap.addAttribute("patient", patientService.findById(id));
		return "editPatient";
	}
	
	@Autowired
	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}
}
