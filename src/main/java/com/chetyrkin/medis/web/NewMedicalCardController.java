package com.chetyrkin.medis.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chetyrkin.medis.dto.MedicalCardDTO;
import com.chetyrkin.medis.service.MedicalCardService;


@Controller
@RequestMapping("/newMedicalCard")
public class NewMedicalCardController {

	private MedicalCardService medicalCardService;
	
	@RequestMapping(value ="", method=RequestMethod.GET)
	public String showNewMedicalCardPage(){
		return "medicalCard/newMedicalCard";
	}
	
	@RequestMapping(value ="/newMedicalCard", method=RequestMethod.POST)
	public @ResponseBody MedicalCardDTO createMedicalCard(MedicalCardDTO medicalCardDTO) {
		medicalCardService.saveOrUpdate(medicalCardDTO);
		return medicalCardDTO;
	}
	
	public void setMedicalCardService(MedicalCardService medicalCardService) {
		this.medicalCardService = medicalCardService;
	}
}
