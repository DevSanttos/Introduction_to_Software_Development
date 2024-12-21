import java.util.Scanner;

public class Troco {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int conta50 = 0;
        int conta20 = 0;
        int conta10 = 0;
        int conta5 = 0;
        int conta2 = 0;
        int conta1 = 0;

        System.out.println("Informe o nome do estabelecimento");
        String nomeEstabelecimento = s.nextLine();

        System.out.println("Qual o valor a ser pago?");
        int valorHaSerPago = s.nextInt();

        System.out.println("Qual o valor efetivamente pago");
        int valorEfetivamentePago = s.nextInt();

        int troco =  valorEfetivamentePago - valorHaSerPago;

        if (valorEfetivamentePago < valorHaSerPago){
            System.out.println("O valor pago pelo respectivo cliente não é suficiente para efetuar o pagamento");
        } else {
            while (true){
                if (troco < 50) break;
                troco = troco - 50;
                conta50++;
            }
            while (true){
                if (troco < 20) break;
                troco = troco - 20;
                conta20++;
            }
            while (true){
                if (troco < 10) break;
                troco = troco - 10;
                conta10++;
            }
            while (true){
                if (troco < 5) break;
                troco = troco - 5;
                conta5++;
            }
            while (true){
                if (troco < 2) break;
                troco = troco - 2;
                conta2++;
            }
            while (true){
                if (troco < 1) break;
                troco = troco - 1;
                conta1++;
            }
        }
        System.out.println("O respectivo troco do estabelecimento "+nomeEstabelecimento+" é:");

        System.out.println( conta50 +"x50");
        System.out.println( conta20 +"x20");
        System.out.println( conta10 +"x10");
        System.out.println( conta5 +"x5");
        System.out.println( conta2 +"x2");
        System.out.println( conta1 +"x1");
    }
}
