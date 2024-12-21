import java.util.Scanner;

public class Ex9 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o primeiro valor");
        int num1 = s.nextInt();
        System.out.println("Informe o segundo valor");
        int num2 = s.nextInt();
        System.out.println("Informe o terceiro valor");
        int num3 = s.nextInt();
        System.out.println("Informe o quarto valor");
        int num4 = s.nextInt();
        System.out.println("Informe o quinto valor");
        int num5 = s.nextInt();
        //Realiza a média e retorna os números que foram superior
        double fazMedia = (double) (num1 + num2 + num3 + num4 + num5) / 5;
        if (num1 > fazMedia) System.out.println("Num1 foi superior à média");
        if (num2 > fazMedia) System.out.println("Num2 foi superior à média");
        if (num3 > fazMedia) System.out.println("Num3 foi superior à média");
        if (num4 > fazMedia) System.out.println("Num4 foi superior à média");
        if (num5 > fazMedia) System.out.println("Num5 foi superior à média");
    }
}
