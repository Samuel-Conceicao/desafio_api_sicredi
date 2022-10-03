package testes;

import org.junit.Test;

import static io.restassured.RestAssured.*;

public class RemoverSimulacao {
	@Test
	public void testDadoQueDeletoUmUsuarioQuandoPreenchoAsiInformacoesEntaoValidoStatusCode200() {
		given().

				when().delete("http://localhost:8080/api/v1/simulacoes/15348148768").
					then().
						log().all().assertThat().statusCode(200);

	}
}