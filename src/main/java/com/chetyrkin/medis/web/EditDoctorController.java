package com.chetyrkin.medis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chetyrkin.medis.dto.DoctorDTO;
import com.chetyrkin.medis.service.DoctorService;

@Controller
@RequestMapping("/editDoctor")
public class EditDoctorController {
	
	private DoctorService doctorService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getEditDoctor(@PathVariable final Long id, ModelMap modelMap) {
		DoctorDTO doctorDTO = doctorService.findById(id);
		modelMap.addAttribute("doctor", doctorDTO);
		return "doctor/editDoctor";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void updateDoctor(ModelMap modelMap, DoctorDTO doctorDTO) {
		doctorService.saveOrUpdate(doctorDTO);
		modelMap.addAttribute("doctor", doctorDTO);
	}
	
	@Autowired
	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

}
