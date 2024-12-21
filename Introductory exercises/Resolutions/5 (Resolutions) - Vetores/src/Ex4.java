import java.util.Scanner;

public class Ex4 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vet = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Informe o valor de X");
        int valorX = s.nextInt();
        if (valorX <= vet.length) {
            System.out.println("Seu valor foi encontrado na posição " + vet[valorX]);
        } else
            System.out.println("Seu valor não encontrou uma correspondência");
    }
}
