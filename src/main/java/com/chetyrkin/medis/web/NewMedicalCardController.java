package com.chetyrkin.medis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chetyrkin.medis.dto.MedicalCardDTO;
import com.chetyrkin.medis.dto.PatientDTO;
import com.chetyrkin.medis.service.MedicalCardService;
import com.chetyrkin.medis.service.PatientService;


@Controller
@RequestMapping("medicalCard/newMedicalCard")
public class NewMedicalCardController {

	private MedicalCardService medicalCardService;
	private PatientService patientService;
	
	@RequestMapping(value ="", method=RequestMethod.GET)
	public String showNewMedicalCardPage(@RequestParam Long id, ModelMap modelMap){
		PatientDTO patinentDTO = patientService.findById(id);
		modelMap.addAttribute("patient", patinentDTO);
		return "medicalCard/newMedicalCard";
	}
	
	@RequestMapping(value ="/addNewMedicalCard", method=RequestMethod.POST)
	public @ResponseBody MedicalCardDTO createMedicalCard(MedicalCardDTO medicalCardDTO) {
		medicalCardService.saveOrUpdate(medicalCardDTO);
		return medicalCardDTO;
	}
	
	@Autowired
	public void setMedicalCardService(MedicalCardService medicalCardService) {
		this.medicalCardService = medicalCardService;
	}
	
	@Autowired
	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}
}
