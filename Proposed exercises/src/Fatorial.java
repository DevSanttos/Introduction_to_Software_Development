import java.util.Scanner;

public class Fatorial {
    static Scanner s = new Scanner(System.in);

    static long fatorial(int valor) {
        if (valor == 0) return 1;
        else
            return valor * fatorial(valor-1);
    }

    public static void main(String[] args) {
        System.out.println("Informe um valor");
        int valor = s.nextInt();
        System.out.println(fatorial(valor));
    }
}
