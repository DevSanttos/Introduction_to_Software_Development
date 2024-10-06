import java.util.Scanner;

public class Ex10 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a quantidade de peixes obtidos em Kg");
        double quantPeixes = s.nextDouble();

        if (quantPeixes > 500) {
            double multa = (quantPeixes - 500) * 4;
            System.out.println("O valor de multa a ser pago é de " + multa + " reais");
        } else System.out.println("Não há multas por excedente de peso");
    }
}
