package com.chetyrkin.medis.web;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chetyrkin.medis.dto.MedicalCardDTO;
import com.chetyrkin.medis.service.MedicalCardService;

@Controller
@RequestMapping("/medicalCards")
public class MedicalCardListController {

	private MedicalCardService medicalCardService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showEventsPage() {
		return "medicalCard/medicalCardsList";
	}
	
	@RequestMapping(value = "/getMedicalCards", method = RequestMethod.GET) 
	@ResponseBody
	public Set<MedicalCardDTO> getMedicalCardsList() {
		return medicalCardService.getAll();
	}
	
	@Autowired
	public void setMedicalCardService(MedicalCardService medicalCardService) {
		this.medicalCardService = medicalCardService;
	}
}
