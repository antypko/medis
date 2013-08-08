package com.chetyrkin.medis.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chetyrkin.medis.dto.MedicalCardDTO;
import com.chetyrkin.medis.service.MedicalCardService;

@Controller
@RequestMapping("/medicalCards")
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
	public void getMedicalCardFile(HttpServletResponse response) throws FileNotFoundException {
		File medicalCard = new File(servletContext.getRealPath("/pdf/1.pdf"));
		InputStream is = new FileInputStream(medicalCard);
		response.setContentType("application/pdf");
		response.setContentLength(new Long(medicalCard.length()).intValue());
		response.setHeader("Content-Disposition", "attachment; filename=\"1.pdf\"");
		try {
			System.out.println("starting");
			OutputStream stream = response.getOutputStream();
//			stream.write(is.read());
//			IOUtils.copy(is, stream);
//			response.flushBuffer();
			FileCopyUtils.copy(is, stream);
			System.out.println("file sended");
//			stream.flush();
			response.flushBuffer();
			System.out.println("response buffer flushed");
//			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Autowired
	public void setMedicalCardService(MedicalCardService medicalCardService) {
		this.medicalCardService = medicalCardService;
	}
}
