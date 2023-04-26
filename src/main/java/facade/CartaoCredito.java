package facade;

public class CartaoCredito extends Servico {

    private static final CartaoCredito cartaoCredito = new CartaoCredito();

    private CartaoCredito() {};

    public static CartaoCredito getInstancia() {
        return cartaoCredito;
    }
}
