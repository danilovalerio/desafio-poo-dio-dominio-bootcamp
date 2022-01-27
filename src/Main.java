
public class Main {

    public static void main(String[] args) {
        MockDados mock = new MockDados();
        Menu menu = new Menu();

        String opcaoEscolhida = menu.principal();

        while (!opcaoEscolhida.equals("x")) {
            switch (opcaoEscolhida) {
                case "1":
                    System.out.println("Lista de clientes");
                    for (Cliente c : mock.getClientes()) {
                        System.out.println(c.getNome());
                    }
                    opcaoEscolhida = menu.principal();
                    break;

                case "2":
                    System.out.println("Lista de Contas");
                    for (Conta c : mock.getContas()) {
                        System.out.println("Ag.:" + c.getAgencia() + " Conta: " + c.getNumero() + " " + String.format(
                                "Saldo é R$ %.2f", c.getSaldo()) + " " +
                                "cliente:" + c.cliente.getNome());
                    }
                    opcaoEscolhida = menu.principal();
                    break;
                case "3":
                    System.out.println("Saque");
                    mock.getContas().get(0).sacar(100);
                    mock.getContas().get(0).imprimirInfosComuns();
                    menu.principal();
                    break;
                case "4":
                    System.out.println("Deposito");
                    mock.getContas().get(0).depositar(200);
                    mock.getContas().get(0).imprimirInfosComuns();
                    opcaoEscolhida = menu.principal();
                    break;
                case "5":
                    System.out.println("Transferir");
                    mock.getContas().get(0).transferir(200, mock.getContas().get(2));
                    mock.getContas().get(0).imprimirInfosComuns();
                    System.out.println("----------------------------------");
                    mock.getContas().get(1).imprimirInfosComuns();
                    opcaoEscolhida = menu.principal();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    opcaoEscolhida = menu.principal();
                    break;
            }
        }
        System.out.println("Programa encerrado.");
    }

}
