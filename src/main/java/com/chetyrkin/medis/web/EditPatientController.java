package com.chetyrkin.medis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chetyrkin.medis.dto.PatientDTO;
import com.chetyrkin.medis.service.PatientService;

@Controller
@RequestMapping("/editPatient")
public class EditPatientController {

	private PatientService patientService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getEditPatient(@PathVariable final Long id, ModelMap modelMap, PatientDTO patientDTO) {
			modelMap.addAttribute("patient", patientService.findById(id));
		return "editPatient";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updatePatient(ModelMap modelMap, PatientDTO patientDTO) {
		System.out.println("update function");
		System.out.println(patientDTO);
		patientService.saveOrUpdate(patientDTO);
		modelMap.addAttribute("patient", patientDTO);
	}

	@Autowired
	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}
}
