package com.chetyrkin.medis.web;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chetyrkin.medis.dto.PatientDTO;
import com.chetyrkin.medis.service.PatientService;

@Controller
@RequestMapping("/patientsList")
public class PatientListController {

	private PatientService patientService;
	
	@Autowired
	public PatientListController(PatientService patientService) {
		this.patientService = patientService;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showPatientsPage() {
		return "patient/patientsList";
	}

	@RequestMapping(value = "/getPatients", method = RequestMethod.GET) 
	@ResponseBody
	public Set<PatientDTO> getPatientsList() {
		return patientService.getAll();
	}
	
	@RequestMapping(value = "/searchByName/", method = RequestMethod.GET)
	public @ResponseBody
	Set<PatientDTO> searchByName(@RequestParam final String name) {
		return patientService.searchByName(name);
	}

}
