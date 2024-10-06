import java.util.Scanner;

public class Ex3 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o valor do saldo médio");
        double saldoMedio = s.nextDouble();
        //Realiza verificações do saldo médio e já faz o retorno do valor do crédito
        if (saldoMedio > 3001) {
            System.out.println("O valor do saldo Médio é: " + saldoMedio);
            System.out.println("O valor do crédito é: " + saldoMedio * 1.5);
        } else if (saldoMedio < 3001 && saldoMedio > 1000) {
            System.out.println("O valor do saldo Médio é: " + saldoMedio);
            System.out.println("O valor do crédito é: " + saldoMedio * 1.4);
        } else if (saldoMedio > 500) {
            System.out.println("O valor do saldo Médio é: " + saldoMedio);
            System.out.println("O valor do crédito é: " + saldoMedio * 1.3);
        } else System.out.println("Nenhum crédito disponível");
    }
}
