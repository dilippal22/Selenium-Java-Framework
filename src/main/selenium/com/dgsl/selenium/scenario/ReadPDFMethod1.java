//This is to read PDF content and print on console

package com.dgsl.selenium.scenario;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.dgsl.util.selenium.Constants;

public class ReadPDFMethod1 {

	static FileInputStream inputstream;
	static PDFTextStripper striper;
	static PDDocument document;
	static File file;

	public static void main(String args[]) throws IOException {
		file = new File(Constants.PDF_FILE_PATH);

		inputstream = new FileInputStream(file);

		document = PDDocument.load(inputstream);

		striper = new PDFTextStripper();

		String text = striper.getText(document);
		
		System.out.println(text);

		if (text.contains("IRCTCs e-Ticketing Service")) {
			System.out.println("PDF successfully Verified");
		} else {
			System.out.println("PDF has some error");
		}

		document.close();

	}
}
