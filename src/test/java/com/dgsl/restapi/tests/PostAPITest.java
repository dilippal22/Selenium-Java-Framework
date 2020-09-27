package com.dgsl.restapi.tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dgsl.restapi.data.Users;
import com.dgsl.restapi.restclient.RestClient;
import com.dgsl.restapi.testbase.TestBase;
import com.dgsl.restapi.util.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostAPITest extends TestBase {

	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableHttpRespone;

	@BeforeMethod
	public void setUp() {
		testBase = new TestBase();
		serviceUrl = prop.getProperty("ServiceURL");
		apiUrl = prop.getProperty("APIURL");

		url = serviceUrl + apiUrl;

	}

	@Test
	public void postAPITestWithHeader() throws ClientProtocolException, IOException {
		restClient = new RestClient();

		// Header
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("content-type", "application/json");
		headerMap.put("username", "test");
		headerMap.put("password", "test123");
		headerMap.put("Auth Token", "213XSds32");

		// Jackson API
		ObjectMapper mapper = new ObjectMapper();
		Users usersRequestObject = new Users("Morphes", "Leader"); // Expected User object

		// POJO to JSON conversion using Jackson API
		mapper.writeValue(new File(Constants.JSON_FILE), usersRequestObject);

		// POJO to JSON in String conversion - Marshelling
		String userJsonString = mapper.writeValueAsString(usersRequestObject);
		System.out.println("Request String is: " + userJsonString);

		closeableHttpRespone = restClient.postRequest(url, userJsonString, headerMap);

		// Verify status code
		int postStatusCode = closeableHttpRespone.getStatusLine().getStatusCode();
		System.out.println("Status code for POST call is: " + postStatusCode);
		Assert.assertEquals(postStatusCode, testBase.RESPONSE_STATUS_201_CREATED);

		// Converting response string into JSON object
		String responseString = EntityUtils.toString(closeableHttpRespone.getEntity(), "UTF-8");

		JSONObject responeJson = new JSONObject(responseString);
		System.out.println("POST API response is: " + responeJson);

		// JSON to POJO conversion - Unmarshelling
		Users userResponseObject = mapper.readValue(responseString, Users.class); // Actual User Object
		System.out.println("User response is: " + userResponseObject);

		System.out.println(usersRequestObject.getName().equals(userResponseObject.getName()));
		System.out.println(usersRequestObject.getJob().equals(userResponseObject.getJob()));

		Assert.assertTrue(usersRequestObject.getName().equals(userResponseObject.getName()));
		Assert.assertTrue(usersRequestObject.getJob().equals(userResponseObject.getJob()));

		System.out.println(userResponseObject.getId());
		System.out.println(userResponseObject.getCreatedAt());

	}

}
