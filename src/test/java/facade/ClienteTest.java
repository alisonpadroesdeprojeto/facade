package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPendenciaCartaoCreditoFechamentoConta() {
        Cliente cliente = new Cliente();
        CartaoCredito.getInstancia().addClientePendente(cliente);
        assertFalse(cliente.fecharConta());
    }

    @Test
    void deveRetornarPendenciaChequeEspecialFechamentoConta() {
        Cliente cliente = new Cliente();
        ChequeEspecial.getInstancia().addClientePendente(cliente);
        assertFalse(cliente.fecharConta());
    }

    @Test
    void deveRetornarClienteSemPendenciaFechamentoConta() {
        Cliente cliente = new Cliente();
        assertTrue(cliente.fecharConta());
    }
}