import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Exemplo de entrada
 * 50 4
 * 11 20 -15 -13
 *
 * Exemplo de saída
 * 22
 */

public class VolumeDaTV {
    public static void main(String[] args) throws IOException {
        boolean teste = true;
        Scanner leitor = new Scanner(System.in);

        int V = 0;
        int T = 0;
        if (!teste) {
            V = leitor.nextInt(); //volume inicial
            T = leitor.nextInt(); //troca de volumes
        }


        List<Integer> trocas = new ArrayList<>();

        if (!teste) {
            for (int i = 0; i  < T; i++) {
                //escreva o seu código nos espaços em branco
                trocas.add(leitor.nextInt());
            }
        } else {
            V = 50;
            T = 5;
            trocas.add(30);
            trocas.add(30);
            trocas.add(30);
            trocas.add(40);
            trocas.add(-78);

        }

        for (Integer troca : trocas) {
            if (troca > 0) {
                V += troca;
                V = validaLimite(V);
            } else {
                V += troca;
                V = validaLimite(V);
            }
        }

        System.out.println(V);
    }

    public static Integer validaLimite(int valor) {
        if (valor > 100) {
            return 100;
        } else return Math.max(valor, 0);
    }
}
