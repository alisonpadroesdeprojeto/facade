package facade;

public class ChequeEspecial extends Servico {

    private static final ChequeEspecial chequeEspecial = new ChequeEspecial();

    private ChequeEspecial() {};

    public static ChequeEspecial getInstancia() {
        return chequeEspecial;
    }
}
