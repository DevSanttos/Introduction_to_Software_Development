import java.util.Scanner;

public class Ex6 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Informe um valor inteiro positivo");
        int num = s.nextInt();
        int aux = 1;
        for (int i = 2; i <= num; i++) {
            aux *= i;
        }
        System.out.println("O número em fatorial é: " + aux);
    }
}
