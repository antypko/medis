package com.chetyrkin.medis.view;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;

public class PdfView extends AbstractPdfView {

	@Autowired
	ServletContext servletContext;
	
	@Override
	protected void buildPdfDocument(Map model, Document doc, PdfWriter writer, HttpServletRequest req,
	        HttpServletResponse resp) throws Exception {
		
		PdfContentByte pdfContentByte = writer.getDirectContent();
		
		FileInputStream fileInputStream = new FileInputStream(servletContext.getRealPath("/pdf/1.pdf"));
		PdfReader reader = new PdfReader(fileInputStream);
		
		PdfImportedPage page = writer.getImportedPage(reader, 1);
		doc.newPage();
		pdfContentByte.addTemplate(page, 0, 0);
	}

}
