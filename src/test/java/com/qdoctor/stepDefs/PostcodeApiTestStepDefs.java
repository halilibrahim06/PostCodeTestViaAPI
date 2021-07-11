package com.qdoctor.stepDefs;

import com.qdoctor.pages.PostcodeApiManager;
import com.qdoctor.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class PostcodeApiTestStepDefs {

    @Given("the user sets the base Url for postcode endpoint")
    public void the_user_sets_the_base_url_for_postcode_endpoint() {
        PostcodeApiManager.setBaseUrl(ConfigurationReader.get("baseUrl"));
    }
    @When("the user calls GET request to check {string}")
    public void the_user_calls_get_request_to_check_postcode(String postcode){
        PostcodeApiManager.getRequestForPostcode(postcode);
    }
    @Then("the response status should be 200")
    public void the_response_status_should_be_200() {
        assertEquals(200,PostcodeApiManager.getResponse().statusCode());
    }

}
