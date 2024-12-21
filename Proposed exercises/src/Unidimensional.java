import java.text.DecimalFormat;
import java.util.Scanner;

public class Unidimensional {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#0.00");
    public static void main(String[] args) {
        int[] vetor = new int[15];

        double armazena = 0;
        int menorValor;
        int indxMenorValor = 0;
        int armazenaMaior = 0;

        s.useDelimiter(";");

        System.out.println("Informe o valor correspondente");
        vetor[0] = s.nextInt();
        armazena += vetor[0];
        menorValor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            System.out.println("Informe o valor correspondente");
            vetor[i] = s.nextInt();
            armazena += vetor[i];

            if (menorValor > vetor[i]) {
                menorValor = vetor[i];
                indxMenorValor = i;
            }
        }

        double fazMedia = armazena / vetor.length;
        System.out.println("Média: " + df.format(fazMedia));

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= fazMedia) {
                armazenaMaior++;
            }
        }
        System.out.println("Qtd. >= média: " + armazenaMaior);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posição menor: " + indxMenorValor);
    }
}
