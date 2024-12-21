import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeCaixaAgua {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("#0.00");
    public static void main(String[] args) {
        System.out.println("Informe qual o raio");
        double raio = s.nextDouble();
        System.out.println("Informe qual é a altura");
        double altura = s.nextDouble();
        System.out.println("volume é " + d.format(Math.PI * Math.pow(raio,2) * altura));
    }
}
