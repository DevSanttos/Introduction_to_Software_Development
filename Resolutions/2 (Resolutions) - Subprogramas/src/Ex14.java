 import java.util.Scanner;

public class Ex14 {
    static Scanner s = new Scanner(System.in);

    public static String montaTabuada(int base){
        String tabuada = "";
            for (int i = 1; i <= 10; i++) {
                tabuada += base + "x" + i + "=" + (base * i) + "\n";
        }
            return tabuada;
    }
    public static void main(String[] args) {
        System.out.println("Informe um valor para a base");
        int base = s.nextInt();

        System.out.println("\n" + montaTabuada(base));
    }
}
