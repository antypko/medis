package com.chetyrkin.medis.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/events")
public class EventController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showEventsPage() {
		return "event";
	}
}
