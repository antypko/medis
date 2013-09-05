package com.chetyrkin.medis.web;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chetyrkin.medis.dto.DoctorDTO;
import com.chetyrkin.medis.service.DoctorService;

@Controller
@RequestMapping("/doctorsList")
public class DoctorListController {
	
	private DoctorService doctorService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showDoctorsPage(){
		return "doctor/doctorsList";
	}
	
	@RequestMapping(value = "/getDoctors", method = RequestMethod.GET) 
	@ResponseBody
	public Set<DoctorDTO> getDoctorsList() {
		return doctorService.getAll();
	}
	
	@Autowired
	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

}
