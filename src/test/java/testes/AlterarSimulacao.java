package testes;


import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.http.ContentType;


public class AlterarSimulacao {
	
	

	    @Test
	    public void alterarSimulacao01() {
	        given()
	                .contentType(ContentType.JSON)
	                .body("{\n" +
	                        "  \"nome\": \"Fulano de Tal\",\n" +
	                        "  \"cpf\": 63717387049,\n" +
	                        "  \"email\": \"email@email.com\",\n" +
	                        "  \"valor\": 1200,\n" +
	                        "  \"parcelas\": 3,\n" +
	                        "  \"seguro\": true\n" +
	                        "}")
	                .when()
	                .put("http://localhost:8080/api/v1/simulacoes/63717387049")
	                .then()
	                .log().all()
	                .statusCode(404);


	    }

	    @Test
	    public void alterarSimulacao02() {
	        given()
	                .body("{\n" +
	                        "  \"nome\": \"Fulano de Tales\",\n" +
	                        "  \"cpf\": 01540560147,\n" +
	                        "  \"email\": \"email@email.com\",\n" +
	                        "  \"valor\": 1200,\n" +
	                        "  \"parcelas\": 3,\n" +
	                        "  \"seguro\": true\n" +
	                        "}")
	                .contentType(ContentType.JSON)
	                .when()
	                .put("http://localhost:8080/api/v1/simulacoes/97093236014")
	                .then()
	                .log().all().assertThat().statusCode(404);


	    }

	    @Test
	    public void alterarSimulacao03() {
	        given()
	                .body("{\n" +
	                        "  \"nome\": \"Thomas Edson\",\n" +
	                        "  \"cpf\":20442654359 ,\n" +
	                        "  \"email\": \"email@email.com\",\n" +
	                        "  \"valor\": 1200,\n" +
	                        "  \"parcelas\": 3,\n" +
	                        "  \"seguro\": true\n" +
	                        "}")
	                .contentType(ContentType.JSON)
	                .when()
	                .put("http://localhost:8080/api/v1/simulacoes/20442654359")
	                .then()
	                .log().all().assertThat().statusCode(200);


	    }
}

