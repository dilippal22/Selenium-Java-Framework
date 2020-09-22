package com.dgsl.selenium.scenario;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.dgsl.util.selenium.Constants;

public class ReadPDFMethod2 {

	static WebDriver driver;
	static PDDocument document = null;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rusenergyweek.com/upload/iblock/1b9/1b9cb0045fcda0e07be921ec922f5191.pdf");

		String urlText = driver.getCurrentUrl();

		URL url = new URL(urlText);

		InputStream inStream = url.openStream();

		BufferedInputStream fileParse = new BufferedInputStream(inStream);

		document = PDDocument.load(fileParse);

		String pdfContent = new PDFTextStripper().getText(document);

		System.out.println(pdfContent);

		if (pdfContent.contains("Adobe Acrobat XI Quick start guide")) {
			System.out.println("PDF is successfully validated..");
		} else {
			System.out.println("PDF has some error..");
		}

		driver.quit();

	}

}
