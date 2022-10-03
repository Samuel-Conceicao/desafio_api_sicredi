package testes;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.is;


public class CriarSimulacao {

    @Test
    public void criarSimulacao01() {
        given()
                .body("{\n" +
                        "  \"cpf\":80810822121,\n" +
                        "  \"nome\": \"Joao\",\n" +
                        "  \"email\": \"joao@email.com\",\n" +
                        "  \"valor\": 6200,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("http://localhost:8080/api/v1/simulacoes")
                .then()
                .log().all().assertThat().statusCode(201);

    }

    @Test
    public void criarSimulacao02() {
        given()
                .body("{\n" +
                        "  \"cpf\",\n" +
                        "  \"nome\": \"\",\n" +
                        "  \"email\": \"felipe@email.com\",\n" +
                        "  \"valor\": ,\n" +
                        "  \"parcelas\": 3,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("http://localhost:8080/api/v1/simulacoes")
                .then()
                .log().all().assertThat().statusCode(400);

    }

    @Test
    public void criarSimulacao03() {
        given()
                .body("{\n" +
                        "  \"cpf\":20442654359,\n" +
                        "  \"nome\": \"Tomas\",\n" +
                        "  \"email\": \"tomas@email.com\",\n" +
                        "  \"valor\": 2100,\n" +
                        "  \"parcelas\": 6,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("http://localhost:8080/api/v1/simulacoes")
                .then()
                .log().all().assertThat().statusCode(201);

    }

    @Test
    public void criarSimulacao04() {
        given()
                .body("{\n" +
                        "  \"cpf\":47666745885,\n" +
                        "  \"nome\": \"Elias\",\n" +
                        "  \"email\": \"elias@email.com\",\n" +
                        "  \"valor\": 2200,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("http://localhost:8080/api/v1/simulacoes")
                .then()
                .log().all().assertThat().statusCode(201);

    }
    @Test
    public void criarSimulacao05() {
        given()
                .body("{\n" +
                        "  \"cpf\":32778518428,\n" +
                        "  \"nome\": \"Juliana\",\n" +
                        "  \"email\": \"juliana@email.com\",\n" +
                        "  \"valor\": 3200,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("http://localhost:8080/api/v1/simulacoes")
                .then().
                log().all().assertThat().statusCode(201);



    }
    @Test
    public void criarSimulacao06() {
        given()
                .body("{\n" +
                        "  \"cpf\":32778518428,\n" +
                        "  \"nome\": \"Juliana\",\n" +
                        "  \"email\": \"juliana@email.com\",\n" +
                        "  \"valor\": 3200,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                .contentType(ContentType.JSON)
                .when()
                .post("http://localhost:8080/api/v1/simulacoes")
                .then()
                .log().all().assertThat().
                statusCode(400);


    }
}