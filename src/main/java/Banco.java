import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Acao> acaos = new ArrayList<Acao>();

    public void executarTarefa(Acao acao) {
        this.acaos.add(acao);
        acao.executar();
    }

    public void cancelarUltimaTarefa() {
        if (acaos.size() != 0) {
            Acao acao = this.acaos.get(this.acaos.size() - 1);
            acao.cancelar();
            this.acaos.remove(this.acaos.size() - 1);
        }
    }

}
