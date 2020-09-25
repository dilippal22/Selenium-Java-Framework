package com.dgsl.restapi.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.dgsl.restapi.util.Constants;

public class TestBase {

	public int RESPONSE_STATUS_200 = 200;
	public int RESPONSE_STATUS_500 = 500;
	public int RESPONSE_STATUS_400 = 400;
	public int RESPONSE_STATUS_401 = 401;
	public int RESPONSE_STATUS_201 = 201;

	File file;
	protected static Properties prop;
	static FileInputStream inputStream;

	public TestBase() {
		file = new File(Constants.CONFIG_FILE);
		try {
			prop = new Properties();
			inputStream = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\main\\java\\com\\dgsl\\restapi\\config\\config.properties");
			prop.load(inputStream);
		} catch (FileNotFoundException a) {
			a.printStackTrace();
		} catch (IOException b) {
			b.printStackTrace();
		}
	}

}
