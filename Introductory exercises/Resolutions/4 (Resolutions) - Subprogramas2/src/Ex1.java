import java.util.Scanner;

public class Ex1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int quantNeg = 0;
        int somaPares = 0;
        int somaIntermd = 0;

        System.out.println("Deseja iniciar o programa? Digite 'N' para finalizar");
        String continua = s.nextLine();

        for (int i = 0; i == 30 || !continua.equalsIgnoreCase("N"); i++) {
            System.out.println("Informe um valor inteiro");
            int valor = s.nextInt();

            if (ehNegativo(valor)) quantNeg++;
            if(ehPar(valor)) somaPares += valor;
            if(ehIntermediario(valor)) somaIntermd += valor;

            System.out.println("Deseja continuar? Digite N para finalizar o programa");
            continua = s.next();
        }
        System.out.println(somaPares);
        System.out.println(quantNeg);
        System.out.println(somaIntermd);

    }
    static boolean ehNegativo(int valor){return valor < 0;}
    static boolean ehPar(int valor){
        return valor % 2 == 0;
    }
    static boolean ehIntermediario(int valor){
        return valor > 0 && valor <= 25;
    }
}
