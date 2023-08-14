package module_2.petstore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import module_2.petstore.dto.User;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void createUserTest() {
        RestAssured.given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/user")
                .when()
                .get("/Jake") // GET. Should return 404
                .then()
                .statusCode(HttpStatus.SC_NOT_FOUND);

        User expectedUser = User.builder()
                .id(123L)
                .username("Jake")
                .firstName("Ivan")
                .lastName("Ivanov")
                .email("ivan@mail.ru")
                .password("IvanIvanov")
                .phone("+79039039033")
                .userStatus(0)
                .build();

        RestAssured.given()
                .baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .body(expectedUser)
                .when()
                .post("/user") // POST. User creation
                .then()
                .statusCode(HttpStatus.SC_OK);

        User actualUser = RestAssured.given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/user")
                .when()
                .get("/Jake") // GET. Should return created user
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(User.class);

        Assertions.assertEquals(expectedUser, actualUser);

        RestAssured.given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/user")
                .when()
                .delete("/Jake") // DELETE
                .then()
                .statusCode(HttpStatus.SC_OK);

        RestAssured.given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/user")
                .when()
                .get("/Jake") // GET. Should return 404 because user is already deleted
                .then()
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }


}
