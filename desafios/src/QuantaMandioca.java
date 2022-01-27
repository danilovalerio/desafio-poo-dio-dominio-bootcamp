import java.io.IOException;
import java.util.Scanner;

public class QuantaMandioca {

    public static final int[] porcoes = {300, 1500, 600, 1000, 150};

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int totalMandiocas = 225;
        int qtdPorcao = 0;

        //escreva o seu código no espaço em branco
        for (int porcao : porcoes) {
            qtdPorcao = leitor.nextInt();
            totalMandiocas += qtdPorcao*porcao;
        }

        System.out.println(totalMandiocas);


    }
}
