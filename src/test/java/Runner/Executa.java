package Runner;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testes.*;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        value={
                ConsultaRestricao.class,
                CriarSimulacao.class,
                AlterarSimulacao.class,
                TodasSimulacoes.class,
                ConsultaSimulacao.class,
                RemoverSimulacao.class})


public class Executa {
}
