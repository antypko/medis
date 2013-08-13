package com.chetyrkin.medis.service.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.chetyrkin.medis.service.PdfService;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;

@Service("pdfService") 
public class PdfServiceImpl implements PdfService {

	@Override
	public void addText(String text, PdfContentByte pdfContentByte, int x, int y) {
		try {
		      BaseFont baseFont = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
		      pdfContentByte.saveState();
		      pdfContentByte.beginText();
		      pdfContentByte.moveText(x, y);
		      pdfContentByte.setFontAndSize(baseFont, 12);
		      pdfContentByte.showText(text);
		      pdfContentByte.endText();
		      pdfContentByte.restoreState();
		    } catch (DocumentException e) {
		      e.printStackTrace();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}

}
