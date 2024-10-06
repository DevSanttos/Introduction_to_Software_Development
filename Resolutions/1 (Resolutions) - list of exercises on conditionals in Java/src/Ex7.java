import java.util.Scanner;

public class Ex7 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe um número inteiro e positivo");
        int num = s.nextInt();

        if (num % 2 == 0) System.out.println("É par");
        else System.out.println("É ímpar");
    }
}
