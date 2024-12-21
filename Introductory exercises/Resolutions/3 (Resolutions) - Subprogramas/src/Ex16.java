import java.util.Scanner;

public class Ex16 {
    static Scanner s = new Scanner(System.in);

    public static double retornaExpressao(int valorN){
        int num = 1;
        for (int i = 1; i <= valorN; i++) {
            num *= i;
        }
        return 1 + (double)(1 / 2) + (double)(1 / 6) + (double)(1 / num);
    }
    public static void main(String[] args) {
        System.out.println("Informe um valor");
        int valorN = s.nextInt();

        System.out.println(retornaExpressao(valorN));
    }
}
