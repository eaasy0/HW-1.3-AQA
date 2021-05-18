
package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class PostmanTest {
    @Test
    void shouldReturnDemoData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data666")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("some data"))
        ;
    }
}
