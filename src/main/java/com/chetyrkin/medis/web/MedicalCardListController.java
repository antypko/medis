package com.chetyrkin.medis.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.chetyrkin.medis.dto.MedicalCardDTO;
import com.chetyrkin.medis.service.MedicalCardService;

@Controller
@RequestMapping("/medicalCard")
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

	@RequestMapping(value = "getFile", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView getMedicalCardFile(HttpServletResponse response) throws IOException {
		Map<String, Object> map =  new HashMap<>();
		map.put("some", "medical card");
		return new ModelAndView("pdf", map);
	}
	
	
	//TODO: temporary method, should be deleted in nearest future
	@RequestMapping(value = "{x}/{y}/getFile", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView getMedicalCardFile(HttpServletResponse response, @PathVariable int x, @PathVariable int y) 
			throws IOException {
		Map<String, Object> map =  new HashMap<>();
		map.put("some", "5");
		map.put("x", x);
		map.put("y", y);
		return new ModelAndView("pdf", map);
	}

	@Autowired
	public void setMedicalCardService(MedicalCardService medicalCardService) {
		this.medicalCardService = medicalCardService;
	}
}
