package testes;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.is;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.lang.reflect.Method;

public class ConsultaRestricao {

    @Test
    public void consultaRestricao01() {
        given().when().get("http://localhost:8080/api/v1/restricoes/97093236014").
                then().
                    log().
                        all().
                            statusCode(200).
                                body("mensagem", is ("O CPF 97093236014 tem problema"));
    }

    @Test
    public void consultaRestricao02() {
        given().when().get("http://localhost:8080/api/v1/restricoes/60094146012").
                then().
                    log().
                        all().
                            statusCode(200).
                                body("mensagem", is ("O CPF 60094146012 tem problema"));
    }

    @Test
    public void consultaRestricao03() {
        given().when().get("http://localhost:8080/api/v1/restricoes/84809766080").
                then().
                    log().
                        all().
                            statusCode(200).
                                body("mensagem", is ("O CPF 84809766080 tem problema"));
    }

    @Test
    public void consultaRestricao04() {
        given().when().get("http://localhost:8080/api/v1/restricoes/62648716050").
                then().
                    log().
                        all().
                            statusCode(200).
                                body("mensagem", is ("O CPF 62648716050 tem problema"));
    }

    @Test
    public void consultaRestricao05() {
        given().when().get("http://localhost:8080/api/v1/restricoes/26276298085").
                then().
                    log().
                        all().
                            statusCode(200).
                                body("mensagem", is ("O CPF 26276298085 tem problema"));
    }

    @Test
    public void consultaRestricao06() {
        given().when().get("http://localhost:8080/api/v1/restricoes/01317496094").
                then().
                    log().
                        all().
                            statusCode(200).
                                 body("mensagem", is ("O CPF 01317496094 tem problema"));
    }

    @Test
    public void consultaRestricao07() {
        given().when().get("http://localhost:8080/api/v1/restricoes/55856777050").
                then().
                    log().
                        all().
                            statusCode(200).
                                body("mensagem", is ("O CPF 55856777050 tem problema"));

    }

    @Test
    public void consultaRestricao08() {
        given().when().get("http://localhost:8080/api/v1/restricoes/19626829001").
                then().
                    log().
                        all().
                         statusCode(200).
                            body("mensagem", is ("O CPF 19626829001 tem problema"));
    }

    @Test
    public void consultaRestricao09() {
        given().when().get("http://localhost:8080/api/v1/restricoes/24094592008").
                then().
                    log().
                        all().
                            statusCode(200).
                                body("mensagem", is ("O CPF 24094592008 tem problema"));
    }

    @Test
    public void consultaRestricao10() {
        given().when().get("http://localhost:8080/api/v1/restricoes/58063164083").
                then().
                    log().
                        all().
                            statusCode(200).
                                body("mensagem", is ("O CPF 58063164083 tem problema"));
    }

}

