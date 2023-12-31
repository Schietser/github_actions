package com.example;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {
        RestAssured.given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(equalTo("Hello from RESTEasy Reactive"));
    }

    @Test
    public void testThatFails(){
        RestAssured.given()
                .when().get("/hello")
                .then()
                .statusCode(200);
    }

}