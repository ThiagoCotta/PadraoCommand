public class SolicitarCreditoAcao implements Acao {

    private Conta conta;

    public SolicitarCreditoAcao(Conta conta) {
        this.conta = conta;
    }

    public void executar() {
        this.conta.liberarCredito();
        conta.setCredito(true);
    }

    public void cancelar() {
        this.conta.cancelarCredito();
        conta.setCredito(false);
    }
}
