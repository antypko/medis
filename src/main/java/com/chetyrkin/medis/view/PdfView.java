package com.chetyrkin.medis.view;

import java.io.FileInputStream;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.chetyrkin.medis.dto.MedicalCardDTO;
import com.chetyrkin.medis.service.PdfService;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;

public class PdfView extends AbstractPdfView {

	@Autowired
	ServletContext servletContext;
	
	@Autowired
	PdfService pdfService;

	@Override
	protected void buildPdfDocument(Map model, Document doc, PdfWriter writer, HttpServletRequest req, 
			HttpServletResponse resp) throws Exception {

		PdfContentByte pdfContentByte = writer.getDirectContent();
		FileInputStream fileInputStream = new FileInputStream(servletContext.getRealPath("/pdf/1.pdf"));
		PdfReader reader = new PdfReader(fileInputStream);
		Paragraph p = new Paragraph();
		int numberOfPages = reader.getNumberOfPages();
/////////TODO: temporary measures, should be deleted in nearest future
//////////////////////////////////////////////////////////////////////
/*   */		String str = (String) model.get("some");
/*   */		Integer x = (Integer) model.get("x");
/*   */		Integer y = (Integer) model.get("y");
//////////////////////////////////////////////////////////////////////
/////////TODO: temporary measures, should be deleted in nearest future

// don't delete it
//		MedicalCardDTO medicalCardDTO = (MedicalCardDTO) model.get("medicalCard");
//		PdfImportedPage page = writer.getImportedPage(reader, 1);
//		doc.newPage();
//		pdfContentByte.addTemplate(page, 0, 0);
//		fillFirstPage (medicalCardDTO, pdfContentByte);

		for (int i = 1; i <= numberOfPages; i++) {
			PdfImportedPage page = writer.getImportedPage(reader, i);
			doc.newPage();
			pdfContentByte.addTemplate(page, 0, 0);
//			fillFirstPage (medicalCardDTO, pdfContentByte);
			
//TODO: temporary measures, should be deleted in nearest future
			if( x != null && y != null)
				pdfService.addText(str, pdfContentByte, 12, x, y);
		}

	}
	
	private void fillFirstPage (MedicalCardDTO medicalCardDTO, PdfContentByte pdfContentByte) {
		/*=================================================================================*/
		String date = medicalCardDTO.getDate().toString();
		// day
		pdfService.addText(date.substring(8, 9), pdfContentByte, 12, 125, 666);
		pdfService.addText(date.substring(9, 10) + ".", pdfContentByte, 12, 153, 666);
		//month
		pdfService.addText(date.substring(5, 6), pdfContentByte, 12, 181, 666);
		pdfService.addText(date.substring(6, 7) + ".", pdfContentByte, 12, 209, 666);
		//year
		pdfService.addText(date.substring(0, 2), pdfContentByte, 12, 237, 666);
		pdfService.addText(date.substring(2, 4), pdfContentByte, 12, 265, 666);
		//hours
		pdfService.addText(date.substring(11, 13), pdfContentByte, 12, 310, 666);
		//minutes
		pdfService.addText(date.substring(14, 16), pdfContentByte, 12, 360, 666);
		/*=================================================================================*/
		//105/557 patient blood type
		String bloodType = medicalCardDTO.getPatient().getBloodType();
		if(bloodType != null) {
			int lastSymbol = bloodType.length()-1;
			String bloodGroup = bloodType.substring(0, lastSymbol);
			pdfService.addText(bloodGroup, pdfContentByte, 12, 105, 557);
			// 340/557 patient Rh type
			String rh = bloodType.substring(lastSymbol);
			pdfService.addText(rh, pdfContentByte, 12, 340, 557);
		}
		/*=================================================================================*/
		//170/485 surname + name + fathers name
		StringBuilder fullName = new StringBuilder();
		fullName.append(medicalCardDTO.getPatient().getSurname());
		fullName.append(" ");
		fullName.append(medicalCardDTO.getPatient().getName());
		fullName.append(" ");
		fullName.append(medicalCardDTO.getPatient().getFathersName());
		pdfService.addText(fullName.toString(), pdfContentByte, 12, 170, 485);
		/*=================================================================================*/
		//326/463 patient sex
		byte sex = 2;
		if (medicalCardDTO.getPatient().getSex()) sex = 1;
		pdfService.addText(String.valueOf(sex), pdfContentByte, 12, 326, 463);
		/*=================================================================================*/
		//TODO:382/465 patient age
		/*=================================================================================*/
		//TODO:454/465 patient birth date
		/*=================================================================================*/
		//255/420 patient live address
		pdfService.addText(medicalCardDTO.getPatient().getLiveAdress(), pdfContentByte, 12, 255, 420);
		/*=================================================================================*/
		//30/400  patient telephone
		String telephone = String.valueOf(medicalCardDTO.getPatient().getTelephone());
		pdfService.addText(telephone, pdfContentByte, 12, 30, 400);
		/*=================================================================================*/
		//206/380 patient work address
		pdfService.addText(medicalCardDTO.getPatient().getWorkAdress(), pdfContentByte, 12, 206, 380);
		/*=================================================================================*/
		//352/335 hours after accident 
		pdfService.addText(String.valueOf(medicalCardDTO.getHoursAfterAccident()), pdfContentByte, 12, 352, 335);
		/*=================================================================================*/
		//284/323 hospitalized in planned order
		byte order = 1;
		if (medicalCardDTO.getHospitalizedInPlannedOrder()) order = 2;
		pdfService.addText(String.valueOf(order), pdfContentByte, 12, 284, 323);
		/*=================================================================================*/
		//270/308 facility diagnosis
		pdfService.addText(medicalCardDTO.getFacilityDiagnosis(), pdfContentByte, 12, 270, 308);
		/*=================================================================================*/
		//152/265 hospitalization diagnosis
		pdfService.addText(medicalCardDTO.getHospitalizationDiagnosis(), pdfContentByte, 12, 152, 265);
		/*=================================================================================*/
		//168/224 clinical diagnosis
		pdfService.addText(medicalCardDTO.getClinicalDiagnosis(), pdfContentByte, 12, 168, 224);
		/*=================================================================================*/
	}
	
}
