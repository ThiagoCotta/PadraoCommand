public class CancelarCreditoAcao implements Acao {

    private Conta conta;

    public CancelarCreditoAcao(Conta conta) {
        this.conta = conta;
    }

    public void executar() {
        this.conta.cancelarCredito();
    }

    public void cancelar() {
        this.conta.liberarCredito();
    }
}
