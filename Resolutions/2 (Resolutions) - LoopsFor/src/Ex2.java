import java.util.Scanner;

public class Ex2 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int contaNegativos = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o "+i+ "º número");
            int num = s.nextInt();
            if (num < 0) contaNegativos++;
        }
        System.out.println(contaNegativos + " números negativos foram encontrados!");
    }
}
