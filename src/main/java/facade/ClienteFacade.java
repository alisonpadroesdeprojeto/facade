package facade;

public class ClienteFacade {

    public static boolean verificarPendenciasFechamentoConta(Cliente cliente) {
        if (CartaoCredito.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (ChequeEspecial.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
