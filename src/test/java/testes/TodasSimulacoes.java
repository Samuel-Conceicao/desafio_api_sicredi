package testes;


import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.is;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class TodasSimulacoes {
    @Test
    public void  testDadoQueConsultoTodosUsuariosQuandoPreenchoAsInformacoesEntaoValidoStatusCode201() {
        // Configurar o caminho comum de acesso a minha API Rest
        baseURI = "http://localhost";
        port = 8080;
        basePath = "/api";

        // Retorna todas as simulacoes existentes
        given().when().get("http://localhost:8080/api/v1/simulacoes").
                then().
                log().
                all().
                assertThat().
                statusCode(200);



    }


}