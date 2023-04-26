package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Servico {
    private List<Cliente> clienteComPendencia = new ArrayList<Cliente>();

    public void addClientePendente(Cliente cliente) {
        this.clienteComPendencia.add(cliente);
    }

    public boolean verificarClienteComPendencia(Cliente cliente) {
        return this.clienteComPendencia.contains(cliente);
    }
}
