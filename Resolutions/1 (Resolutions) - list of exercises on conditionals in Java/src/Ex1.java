import java.util.Scanner;

public class Ex1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        boolean divisivel = false;

        System.out.println("Informe um número inteiro positivo");
        int num = s.nextInt();

        //Verificação da divisibilidade do número por 10, 5 e 2
        if (num % 10 == 0) {
            System.out.println("Número divisível por 10");
            divisivel = true;
        }
        if (num % 5 == 0) {
            System.out.println("Número divisível por 5");
            divisivel = true;
        }
        if (num % 2 == 0) {
            System.out.println("Número divisível por 2");
            divisivel = true;
        }
        if (!divisivel) System.out.println("O número informado não é divisível por 10, 5 e 2!");
    }
}
