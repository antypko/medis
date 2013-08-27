package com.chetyrkin.medis.service.impl;

import java.io.IOException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetyrkin.medis.service.PdfService;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;

@Service("pdfService")
public class PdfServiceImpl implements PdfService {

	@Autowired
	ServletContext servletContext;
	
	
	@Override
	public void addText(String text, PdfContentByte pdfContentByte, int fontSize, int x, int y) {
		try {
			// this hardcode solves problem with cyrillic symbols. If you could do it better, then do it.
			BaseFont baseFont = BaseFont.createFont(servletContext.getRealPath("/pdf/font/times.ttf"), 
					BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
			pdfContentByte.saveState();
			pdfContentByte.beginText();
			pdfContentByte.moveText(x, y);
			pdfContentByte.setFontAndSize(baseFont, fontSize);
			if (text != null) {
				if (text.equals("null"))
					pdfContentByte.showText("");
				else
					pdfContentByte.showText(text);
			} else {
				pdfContentByte.showText("");
			}
			pdfContentByte.endText();
			pdfContentByte.restoreState();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
