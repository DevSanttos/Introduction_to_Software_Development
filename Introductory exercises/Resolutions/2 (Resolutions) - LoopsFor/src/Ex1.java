import java.util.Scanner;

public class Ex1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a tabuada base");
        int tabuadaBase = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + tabuadaBase + " = " + tabuadaBase * i);
        }
    }
}
