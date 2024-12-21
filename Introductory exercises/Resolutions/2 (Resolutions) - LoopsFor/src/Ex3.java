import java.util.Scanner;

public class Ex3 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int armazenaPositivos = 0;
        int contaPositivo = 0;
        int contaNegativos = 0;
        int contaIntervalo = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o " + i + "º número");
            int num = s.nextInt();

            if (num > 0) {
                armazenaPositivos += num;
                contaPositivo++;
            }
            if (num < 0) contaNegativos++;
            if (num >= 5 && num <= 50) contaIntervalo++;
        }
        System.out.println("O resultado da média dos números positivos lidos é: " + (double)(armazenaPositivos / contaPositivo));
        System.out.println("A quantidade de números abaixo de 0 é: " + contaNegativos);
        System.out.println("A quantidade de números no intervalo de 5 e 50 é: " + contaIntervalo);
    }
}
