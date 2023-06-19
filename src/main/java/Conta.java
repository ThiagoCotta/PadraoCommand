public class Conta {

    private boolean credito;
    private float saldo;
    private String situacao;

    public Conta(boolean credito, float saldo) {
        this.credito = credito;
        this.saldo = saldo;
    }

    public String getSituacao() {
        return situacao;
    }

    public boolean getCredito(){
        return credito;
    }

    public void setCredito(boolean credito){
        this.credito = credito;
    }
    public void liberarCredito() {
        this.situacao = "Credito Liberado";
    }

    public void cancelarCredito() {
        this.situacao = "Crédito Cancelado";
    }
}
