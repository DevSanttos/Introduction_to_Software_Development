import java.util.Scanner;

public class Ex2 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe seu peso em Kg");
        double peso = s.nextDouble();
        System.out.println("Informe sua altura em metros");
        double altura = s.nextDouble();
        //Calcula o imc com base nas medidas informadas
        double imc = peso / Math.pow(altura, 2);
        if (imc > 40) System.out.println("Obesidade III");
        else if (imc > 34.9) System.out.println("Obesidade II");
        else if (imc > 29.9) System.out.println("Obesidade I");
        else if (imc > 24.9) System.out.println("Sobrepeso I");
        else if (imc > 18.4) System.out.println("Normal");
        else System.out.println("Magreza");
    }
}
