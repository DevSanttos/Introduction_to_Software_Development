import java.util.Scanner;

public class Ex5 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int result = 0;
        int contaPrimo = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o " + i + "º número");
            int num = s.nextInt();

            for (int x = 2; x <= num / 2; x++) {
                if (num % x == 0) result++;
            }
            if (result == 0) contaPrimo++;
        }
        System.out.println(contaPrimo);
    }
}
