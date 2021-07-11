package com.qdoctor.pages;

import com.qdoctor.utilities.ConfigurationReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostcodeApiManager {
    private static RestAssured restAssured;
    private static Response response;

    public static RestAssured getRestAssured(){
        if (restAssured == null) {
            restAssured = new RestAssured();
        }
        return restAssured;
    }

    public static void setBaseUrl(String baseUrl) {
        getRestAssured().baseURI = baseUrl;
    }

    public static void getRequestForPostcode(String postcode) {
        String endpoint = ConfigurationReader.get("postCodeEndpoint");
        response = getRestAssured().given().accept(ContentType.JSON)
                .and().pathParam("postcode", postcode).
                when().get(endpoint);
    }

    public static Response getResponse(){
        return response;
    }
}
