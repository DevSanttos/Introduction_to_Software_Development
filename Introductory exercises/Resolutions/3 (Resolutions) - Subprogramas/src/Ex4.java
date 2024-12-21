import java.util.Scanner;

public class Ex4 {
    static Scanner s = new Scanner(System.in);

    public static double calculaDelta(int valorA,int valorB,int valorC){
        return Math.pow(valorB, 2) - (4 * valorA * valorC);
    }

    public static double calculaBaskara(int valorA,int valorB,int valorC){
        double x1 = (-(valorB) + calculaDelta(valorA, valorB, valorC))/ 2 * valorA;
        double x2 = (-(valorB) - calculaDelta(valorA, valorB, valorC))/ 2 * valorA;
        return x1 + x2;
    }

    public static void main(String[] args) {
        System.out.println("Informe o valor de A");
        int valorA = s.nextInt();
        System.out.println("Informe o valor de B");
        int valorB = s.nextInt();
        System.out.println("Informe o valor de C");
        int valorC = s.nextInt();

        System.out.println("As duas raizes são: "+calculaBaskara(valorA,valorB,valorC));

    }
}
