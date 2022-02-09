package com.ra.test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthPractice {
	public static void main(String[] args) {
	
		RestAssured.baseURI = "https://authorization-server.com/";
		RequestSpecification given = RestAssured.given();
		given.header("content-type", "application/json");
		RequestSpecification queryParams = given
		.contentType(ContentType.URLENC)
		.queryParams("code", "Yzk5ZDczMzRlNDEwY")
		.queryParams("grant_tyoe", "code")
		.queryParams("redirect_uri", "https://example-app.com/cb")
		.queryParams("client_id", "mRkZGFjM")
		.queryParams("client_secret", "ZGVmMjMz")
		.queryParams("code_verifier", "Th7UHJdLswIYQxwSg29DbK1a_d9o41uNMTRmuH0PM8zyoMAQ");
		
		Response response = queryParams.request(Method.POST, "/oauth/token");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());

//		POST /oauth/token HTTP/1.1
//		Host: authorization-server.com
//		 
//		code=Yzk5ZDczMzRlNDEwY
//		&grant_type=code
//		&redirect_uri=https://example-app.com/cb
//		&client_id=mRkZGFjM
//		&client_secret=ZGVmMjMz
//		&code_verifier=Th7UHJdLswIYQxwSg29DbK1a_d9o41uNMTRmuH0PM8zyoMAQ
		
	}

}


