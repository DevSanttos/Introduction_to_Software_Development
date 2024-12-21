import java.text.DecimalFormat;
import java.util.Scanner;

public class EquacaoSegundoGrau {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#0.00");
    public static void main(String[] args) {
        System.out.println("Coeficiente A");
        double a = s.nextDouble();
        System.out.println("Coeficiente B");
        double b = s.nextDouble();
        System.out.println("Coeficiente C");
        double c = s.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double xLinha = (-b + Math.sqrt(delta)) / (2 * a);
            double x2Linha = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println(df.format(xLinha) + "; " + df.format(x2Linha));
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println(df.format(x));
        } else System.out.println("Sem raiz real");
    }
}
