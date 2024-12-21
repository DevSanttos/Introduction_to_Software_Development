import java.util.Scanner;

public class Ex7 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        double contaPositivos = 0;
        double contaNegativos = 0;
        int totalValores = 10;

        for (int i = 1; i <= totalValores; i++) {
            System.out.println("Informe o " + i + "º número");
            int num = s.nextInt();

            if (num > 0) contaPositivos++;
            if (num < 0) contaNegativos++;
        }
        System.out.println("Percentual positivo: " + (double) (contaPositivos / totalValores) * 100 + "%");
        System.out.println("Percentual negativo: " + (double) (contaNegativos / totalValores) * 100 + "%");
    }
}
