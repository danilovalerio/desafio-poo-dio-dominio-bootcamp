import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Menu {

    Menu(){ }

    public String principal() {
        Scanner input = new Scanner(System.in);
        String opcaoSelecionada = "0";

        while (!validaMenu(opcaoSelecionada)) {
            System.out.println("|====== MENU PRINCIPAL ======|");
            System.out.println("| 1 - Lista Clientes ");
            System.out.println("| 2 - Lista Contas ");
            System.out.println("| 3 - Sacar ");
            System.out.println("| 4 - Depositar ");
            System.out.println("| 5 - Transferir ");
            System.out.println("| x - Sair ");
            System.out.print("|Escolha uma opção: ");
            opcaoSelecionada = input.next().toLowerCase(Locale.ROOT);
//            System.out.println("Você escolheu a: " + opcaoSelecionada);
        }
        return opcaoSelecionada;
    }

    private boolean validaMenu(String opcaoSelecionada){
        List<String> opcoes = new ArrayList<>();
        opcoes.add("1");
        opcoes.add("2");
        opcoes.add("3");
        opcoes.add("4");
        opcoes.add("5");
        opcoes.add("x");

        for (String opcao : opcoes) {
            if (opcao.equals(opcaoSelecionada))
                return true;
        }

        return false;
    }

}
