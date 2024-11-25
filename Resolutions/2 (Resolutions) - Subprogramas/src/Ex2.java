import java.util.Scanner;

public class Ex2 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("informe o valor da primeira nota");
        int nota1 = s.nextInt();
        System.out.println("informe o valor da segunda nota");
        int nota2 = s.nextInt();
        System.out.println("informe o valor da terceira nota");
        int nota3 = s.nextInt();
        System.out.println("Informe A para calcular a média aritmética e P para a ponderada");
        String letraMedia = s.next();

        System.out.println("Sua média foi de "+calculaMedia(nota1, nota2, nota3,letraMedia));

    }

    public static double calculaMedia(int nota1, int nota2, int nota3, String letraMedia) {
        if (letraMedia == "A") return (nota1+nota2+nota3)/3;
        else {
            if (letraMedia == "P") return ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;
        }
        return 0;
    }
}
