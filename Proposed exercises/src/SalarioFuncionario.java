import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioFuncionario {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("#0.00");

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
        System.out.println(nome + ": "+d.format(result));
    }
}
