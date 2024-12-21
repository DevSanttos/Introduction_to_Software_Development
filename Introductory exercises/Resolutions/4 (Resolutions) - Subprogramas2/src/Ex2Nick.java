import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2Nick {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat d = new DecimalFormat("0.00");

    public static void main(String[] args) {
        System.out.println("""
                [1] Cubos
                [2] Paralelepípedos
                [3] Cilíndros
                [4] Esferas
                [5] Cones
                """);
        int formaGeom = s.nextInt();

        switch (formaGeom){
            case 1: cubos();
            break;
            case 2:Paralelepipedos();
            break;
            case 3:Cilindros();
            break;
            case 4:Esferas();
            break;
            case 5:Cones();
            break;
            default:
                System.out.println("Essa figura não existe");
                break;
        }
    }

    static void cubos(){
        System.out.println("Informe o valor do comprimento de um lado");
        double length = s.nextInt();

        System.out.println("Seu resultado é "+Math.pow(length,3));
    }
    static void Paralelepipedos(){
        System.out.println("Informe o valor da largura");
        double largura = s.nextInt();
        System.out.println("Informe o valor do comprimento");
        double length = s.nextInt();
        System.out.println("Informe o valor da altura");
        double altura = s.nextInt();

        System.out.println("Seu resultado é "+ largura * length * altura);
    }
    static void Cilindros(){
        System.out.println("Informe o raio");
        double raio = s.nextInt();
        System.out.println("Informe o valor da altura");
        double altura = s.nextInt();

        System.out.println("Seu resultado é "+ d.format(Math.PI * Math.pow(raio,2) * altura));
    }
    static void Esferas(){
        System.out.println("Informe o raio");
        double raio = s.nextInt();

        System.out.println("Seu resultado é "+ d.format((double)(4/3) * Math.PI * Math.pow(raio,3)));
    }
    static void Cones(){
        System.out.println("Informe o raio");
        double raio = s.nextInt();
        System.out.println("Informe o valor da altura");
        double altura = s.nextInt();

        System.out.println("Seu resultado é "+ d.format((double)(1/3) * (Math.PI * Math.pow(raio,2) * altura)));

    }
}