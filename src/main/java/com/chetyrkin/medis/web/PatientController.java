package com.chetyrkin.medis.web;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showPatientsPage() {
		return "patients";
	}

	@RequestMapping(value = "/getPatients", method = RequestMethod.GET)
	@ResponseBody
	public List<Patient> getPatientsList() {
		return patientService.getAll();
	}

	@RequestMapping(value = "/newPatient", method = RequestMethod.POST)
	@ResponseBody
	public String registerNewPatient(final Patient patient) {
		patientService.saveOrUpdate(patient);
		return "Saved patient: " + patient.getName();
	}

	@RequestMapping(value = "/searchByName/{name}", method = RequestMethod.GET)
	@ResponseBody
	public Set<Patient> searchByName(@PathVariable final String name) {
		return patientService.searchByName(name);
	}

}
