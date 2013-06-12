package com.chetyrkin.medis.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chetyrkin.medis.service.PatientService;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String redirectHomePage(Map<String, Object> model) {
		return "redirect:/home";
	}
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String showHomePage(Map<String, Object> model) {
		return "/home";
	}
	
	
}
