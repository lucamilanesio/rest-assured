package com.jayway.restassured.module.mockmvc;

import com.jayway.restassured.module.mockmvc.http.GreetingController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class GreetingControllerRestAssuredTest {

    @Test public void
    uses_predefined_mock_mvc_instance() throws Exception {
        MockMvc mockMvc = standaloneSetup(new GreetingController()).build();

        given().
                mockMvc(mockMvc).
                param("name", "Johan").
        when().
                get("/greeting").
        then().
                log().all().
                body("id", equalTo(1)).
                body("content", equalTo("Hello, Johan!"));
    }

    @Test public void
    uses_predefined_standalone() throws Exception {
        given().
                standaloneSetup(new GreetingController()).
                param("name", "Johan").
        when().
                get("/greeting").
        then().
                body("id", equalTo(1)).
                body("content", equalTo("Hello, Johan!"));
    }

    @Test public void
    uses_static_mock_mvc() throws Exception {
        RestAssuredMockMvc.mockMvc = standaloneSetup(new GreetingController()).build();

        try {
            given().
                    param("name", "Johan").
            when().
                    get("/greeting").
            then().
                    body("id", equalTo(1)).
                    body("content", equalTo("Hello, Johan!"));

            given().
                    param("name", "Erik").
            when().
                    get("/greeting").
            then().
                    body("id", equalTo(2)).
                    body("content", equalTo("Hello, Erik!"));
        } finally {
            RestAssuredMockMvc.reset();
        }
    }
}
