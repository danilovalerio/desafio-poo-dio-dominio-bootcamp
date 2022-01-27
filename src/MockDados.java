import java.util.ArrayList;
import java.util.List;

public class MockDados {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();

    MockDados(){
        clientes.add(new Cliente("Danilo"));
        clientes.add(new Cliente("Daniela"));
        clientes.add(new Cliente("Olivia"));

        for (Cliente cliente : clientes) {
            contas.add(new ContaCorrente(cliente));
        }

        for (Cliente cliente : clientes) {
            contas.add(new ContaPoupanca(cliente));
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
