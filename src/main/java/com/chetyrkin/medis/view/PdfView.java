package com.chetyrkin.medis.view;

import java.io.FileInputStream;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.document.AbstractPdfView;

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
		for (int i = 1; i <= numberOfPages; i++) {
			PdfImportedPage page = writer.getImportedPage(reader, i);
			doc.newPage();
			pdfContentByte.addTemplate(page, 0, 0);
			
			//170/485 surname + name + fathers name
			//125(+28)/666 hospitalization date
			//105/557 blood type
			//340/557 Rh type
			//352/335 hours after accident 
			//284/323 hospitalized in planned order
			//270/308 facility diagnosis
			//152/265 hospitalization diagnosis
			//168/224 clinical diagnosis
			
			//TODO: temporary measures, should be deleted in nearest future
			if( x != null && y != null)
				pdfService.addText(str, pdfContentByte, x, y);
		}

	}
	
}
