package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class StepsFlyAway {

	RequestSpecification request;
	
	@Given("SomePrecondition")
	public void some_precondition() {
		RestAssured.baseURI = "http://localhost:8080/FlyAway/";
		request = RestAssured.given();
	}
	
	@When("Usrsubmites the signup with required details")
	public void user_submits_the_signup_with_required_details () {
		request.
		queryParams("email_id", "apiuser1@user.com")
		queryParams("pwd", "user")
		queryParams("pwd2", "user")
		queryParams("name", "Sam")
		queryParams("address", "1234 Street")
		queryParams("city", "Lincoln");
		
		queryParams.request(Method.POST, "/signupaction");
		
		System.out.println(response.getBody().asStrinf());
	}
	
	@Then("Status code returned is {expStatusCode}")
	public void status_code_returned_is(String expStatusCode) {
		int statusCode = response.getStatusCode();
		String actStatusCode = Integer.toString(statusCode);
		Assert.assertEquals(expStatusCode, actStatusCode);
		
	}
	
	@Then("User should be able to register successfully")
	public void user_should_be_able_to_register_successfully() {
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
	}
}
