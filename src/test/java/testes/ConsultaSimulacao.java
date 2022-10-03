package testes;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class ConsultaSimulacao {

    @Test
    public void consultaSimulacao01() {
        given().when().get("http://localhost:8080/api/v1/restricoes/80810822121").
                then().
                    log().
                        all().
                            assertThat().
                                statusCode(204);


    }

    @Test
    public void consultaSimulacao02() {
        given().when().get("http://localhost:8080/api/v1/restricoes/20442654359").
                    then().
                        log().
                            all().
                assertThat().
                statusCode(204);


    }
}
