import java.text.DecimalFormat;
import java.util.Scanner;

public class AreasDeFiguras {
    static DecimalFormat df = new DecimalFormat("#0.00");

    public static double areaQuadrado(double lado){
        return Math.pow(lado,2);
    }
    public static double areaRetangulo(double base, double altura){
        return base * altura;
    }
    public static double areaCirculo(double raio){
        return Math.PI * Math.pow(raio,2);
    }
    public static double areaTriangulo(double lado1, double lado2, double lado3){
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s -lado3));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter(";");

        System.out.println("Lado quadrado");
        double ladoQuadrado = s.nextDouble();

        System.out.println("Base retângulo");
        double baseRetangulo = s.nextDouble();
        System.out.println("Altura retângulo");
        double alturaRetangulo = s.nextDouble();

        System.out.println("Raio");
        double raio = s.nextDouble();

        System.out.println("Lado1");
        double lado1 = s.nextDouble();
        System.out.println("Lado2");
        double lado2 = s.nextDouble();
        System.out.println("Lado3");
        double lado3 = s.nextDouble();

        System.out.println(df.format(areaQuadrado(ladoQuadrado)));
        System.out.println(df.format(areaRetangulo(baseRetangulo, alturaRetangulo)));
        System.out.println(df.format(areaCirculo(raio)));
        System.out.println(df.format(areaTriangulo(lado1, lado2, lado3)));

    }
}
