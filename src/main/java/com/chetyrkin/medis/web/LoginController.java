package com.chetyrkin.medis.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login*", method = RequestMethod.GET)
	public String login(Map<String, Object> model) {
		return "/login";
	}
 
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(Map<String, Object> model) {
		return "redirect:login";
	}
 
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Map<String, Object> model) {
		return "redirect:login";
	}

}
