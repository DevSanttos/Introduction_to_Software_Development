import java.util.Scanner;

public class Ex1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o raio da respectiva esfera");
        double raio = s.nextDouble();
        System.out.println("O volume da esfera, com base no raio informado, é: "+calculaVolume(raio));
    }
    public static double calculaVolume(double raio){ return (4 * Math.PI * Math.pow(raio, 3))/3; }
}
