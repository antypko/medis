package com.chetyrkin.medis.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/MedicalCards")
public class MedicalCardController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showEventsPage() {
		return "medicalCards";
	}
}
