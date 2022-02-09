package com.ra.test;


import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstTest {

	public static void main(String[] args) {
//		RestAssured.baseURI = "https://reqres.in/";
//		RequestSpecification given = RestAssured.given();
//		Response response = given.request(Method.GET, "api/users/2");
//		
//		System.out.println(response.getBody().asString());
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getStatusLine());
		
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification given = RestAssured.given();
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("name", "Sam");
		jsonObject.put("job", "architect");
		given.body(jsonObject);
		
		given.header("content-type", "application/json");
		
		given.body(jsonObject.toJSONString());
		
		Response response = given.request(Method.POST, "api/users");
		System.out.println(response.getBody().asString());
	}
	
}
