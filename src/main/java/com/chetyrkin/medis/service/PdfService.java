package com.chetyrkin.medis.service;

import com.lowagie.text.pdf.PdfContentByte;

public interface PdfService {
	
	void addText(String text, PdfContentByte pdfContentByte, int fontSize, int x, int y);

}
