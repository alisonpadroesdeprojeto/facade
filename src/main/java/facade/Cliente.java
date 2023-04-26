package facade;

public class Cliente {
    public boolean fecharConta() {
        return ClienteFacade.verificarPendenciasFechamentoConta(this);
    }
}
