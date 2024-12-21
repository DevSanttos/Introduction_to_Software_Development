import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraBasica {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("#0.0");

    public static double fazSum(double primeiroTermo, double segundoTermo) {
        return primeiroTermo + segundoTermo;
    }

    public static double fazSub(double primeiroTermo, double segundoTermo) {
        return primeiroTermo - segundoTermo;
    }

    public static double fazMult(double primeiroTermo, double segundoTermo) {
        return primeiroTermo * segundoTermo;
    }

    public static double fazDiv(double primeiroTermo, double segundoTermo) {
        return primeiroTermo / segundoTermo;
    }

    public static void main(String[] args) {

        System.out.println("Informe qual o operador desejado");
        String operador = s.next();

        System.out.println("Informe o primeiro termo");
        double primeiroTermo = s.nextDouble();

        if (operador.equalsIgnoreCase("abs")) {
            if (primeiroTermo < 0) {
                System.out.println(primeiroTermo *= -1);
            } else {
                System.out.println(primeiroTermo);
            }
        } else {

            System.out.println("Informe o segundo termo");
            double segundoTermo = s.nextDouble();

            switch (operador) {
                case "sum": {
                    System.out.println(fazSum(primeiroTermo, segundoTermo));
                    break;
                }
                case "sub": {
                    System.out.println(fazSub(primeiroTermo, segundoTermo));
                    break;
                }
                case "mult": {
                    System.out.println(fazMult(primeiroTermo, segundoTermo));
                    break;
                }
                case "div": {
                    if (segundoTermo == 0) {
                        System.out.println("Divisão por zero");
                        break;
                    }

                    System.out.println(d.format(fazDiv(primeiroTermo, segundoTermo)));
                    break;
                }
                default: {
                    System.out.println("Não foi possível encontrar nenhum operador igual ao nome inserido");
                }
            }
        }
    }
}