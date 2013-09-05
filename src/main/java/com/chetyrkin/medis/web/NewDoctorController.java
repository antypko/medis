package com.chetyrkin.medis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chetyrkin.medis.dto.DoctorDTO;
import com.chetyrkin.medis.service.DoctorService;

@Controller
@RequestMapping("/newDoctor")
public class NewDoctorController {
	
	private DoctorService doctorService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showNewDoctorPage() {
		return "doctor/newDoctor";
	}
	
	@RequestMapping(value = "/addDoctor", method = RequestMethod.POST)
	public @ResponseBody
	DoctorDTO registerNewDoctor(final DoctorDTO doctorDTO) {
		return doctorService.saveOrUpdate(doctorDTO);
	}
	
	@Autowired
	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

}
