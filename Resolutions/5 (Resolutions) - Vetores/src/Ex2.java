import java.util.Scanner;

public class Ex2 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vet = new int[10];

        int impar = 1;
        for (int i = 0; i < vet.length; i++){
           vet[i] = impar;

           impar += 2;
        }
        for (int i = 0; i < vet.length; i++){
            System.out.println(vet[i]);
        }
    }
}
