import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioDesconto {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("#0.00");

    public static double calcularIR(double result) {
        if (result <= 1000) return result * 0.085;
        else
            return result * 0.09;
    }
    public static double calcularINSS(double result) {
        if (result <= 500) return 0;
        if (500 > result || result <= 1000) return result * 0.05;
        if (result > 1000) return result * 0.07;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Informe o nome do funcionário");
        String nome = s.nextLine();
        System.out.println("Informe o número de horas trabalhadas");
        int horas = s.nextInt();
        System.out.println("Informe o valor recebido por hora");
        double valorHora = s.nextDouble();
        System.out.println("Informe o número de filhos");
        int numFilhos = s.nextInt();

        double salarioBruto = valorHora * horas;
        double acrescenta = salarioBruto * (0.03 * numFilhos);
        double result = salarioBruto + acrescenta;

        System.out.print(nome+";");
        System.out.print(d.format(result)+";");
        System.out.print(d.format(calcularIR(result))+";");
        System.out.print(d.format(calcularINSS(result))+";");
        System.out.print(d.format(result - calcularINSS(result) - calcularIR(result)));
    }
}
