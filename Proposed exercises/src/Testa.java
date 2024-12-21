import java.util.Scanner;

public class Testa {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe 15 valores inteiros positivos separados por ';'");
        s.useDelimiter(";");

        int[] valores = new int[15];
        int val = 0;

        while (s.hasNextInt() && val < 15) {
            valores[val++] = s.nextInt();
        }

        double soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
        double media = soma / valores.length;

        int maiorMedia = 0;
        for (int valor : valores) {
            if (valor >= media) {
                maiorMedia++;
            }
        }

        int menorVal = valores[0];
        int posicaoMenor = 0;
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < menorVal) {
                menorVal = valores[i];
                posicaoMenor = i;
            }
        }

        System.out.printf("Média: %.2f%n", media);
        System.out.println("Qtd. >= média: " + maiorMedia);
        System.out.println("Menor valor: " + menorVal);
        System.out.println("Posição menor: " + posicaoMenor);
    }

}

