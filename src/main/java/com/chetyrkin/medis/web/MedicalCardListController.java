package com.chetyrkin.medis.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

	@Autowired
	ServletContext servletContext;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showEventsPage() {
		return "medicalCard/medicalCardsList";
	}

	@RequestMapping(value = "/getMedicalCards", method = RequestMethod.GET)
	@ResponseBody
	public Set<MedicalCardDTO> getMedicalCardsList() {
		return medicalCardService.getAll();
	}

	@RequestMapping(value = "/getFile", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView getMedicalCardFile(HttpServletResponse response) throws IOException {
		Map<String, String> map =  new HashMap();
		map.put("some", "medical card");
		return new ModelAndView("pdf", map);
	}

	@Autowired
	public void setMedicalCardService(MedicalCardService medicalCardService) {
		this.medicalCardService = medicalCardService;
	}
}
