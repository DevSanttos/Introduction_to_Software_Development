import java.util.Scanner;

public class Emprestimo {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nome");
        String nome = s.nextLine();
        System.out.println("Salario");
        double salario = s.nextDouble();
        System.out.println("Valor pretendido");
        double valorPretendido = s.nextDouble();
        System.out.println(nome);
        if (valorPretendido <= salario * 5) System.out.println("Financiamento CONCEDIDO");
        else System.out.println("Financiamento NEGADO");
        System.out.println("Obrigado por nos consultar");
    }
}
