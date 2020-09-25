//This is to read PDF content and print on console

package com.dgsl.selenium.scenario;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPDF {

	static FileInputStream inputstream;
	static PDFTextStripper striper;
	static PDDocument document;

	public static void main(String args[]) throws IOException {
		File file = new File(System.getProperty("user.dir") + "\\pdffile\\printTicket.pdf");

		inputstream = new FileInputStream(file);

		document = PDDocument.load(inputstream);

		striper = new PDFTextStripper();

		String text = striper.getText(document);

		if (text.contains("IRCTCs e-Ticketing Service")) {
			System.out.println(text);
		}

		document.close();

	}
}
