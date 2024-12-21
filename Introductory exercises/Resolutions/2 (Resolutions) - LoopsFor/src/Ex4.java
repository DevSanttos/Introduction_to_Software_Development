import java.util.Scanner;

public class Ex4 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int maiorValor = 0;
        int menorValor = 0;
        int armazenaNum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o " + i + "º número");
            int num = s.nextInt();

            if (maiorValor < num) maiorValor = num;
            if (menorValor > num) menorValor = num;
            armazenaNum += num;
        }
        System.out.println("O maior valor foi : " + maiorValor);
        System.out.println("O menor valor foi : " + menorValor);
        System.out.println("A média dos valores foi: " + armazenaNum / 10);
    }
}