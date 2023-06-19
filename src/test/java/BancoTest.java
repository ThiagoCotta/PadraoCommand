import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BancoTest {

    Banco banco;
    Conta conta;

    @BeforeEach
    void setUp() {
        banco = new Banco();
        conta = new Conta(false, 1201);
    }

    @Test
    void deveLiberarCredito() {
        Acao liberacaoCredito = new SolicitarCreditoAcao(conta);
        banco.executarTarefa(liberacaoCredito);

        assertEquals("Credito Liberado", conta.getSituacao());
    }

    @Test
    void deveCancelarCredito() {
        Acao cancelarCredito = new CancelarCreditoAcao(conta);
        banco.executarTarefa(cancelarCredito);

        assertEquals("Crédito Cancelado", conta.getSituacao());
    }

    @Test
    void deveCancelarCancelamentoCredito() {
        Acao liberacaoCredito = new SolicitarCreditoAcao(conta);
        Acao cancelarCredito = new CancelarCreditoAcao(conta);

        banco.executarTarefa(liberacaoCredito);
        banco.executarTarefa(cancelarCredito);

        banco.cancelarUltimaTarefa();

        assertEquals("Credito Liberado", conta.getSituacao());
    }

}