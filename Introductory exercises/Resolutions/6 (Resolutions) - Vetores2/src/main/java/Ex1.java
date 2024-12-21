import java.util.Scanner;

public class Ex1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vet = new int[10];
        String binario = "";

        int impar = 1;
        for (int i = 0; i < vet.length; i++){
            vet[i] = impar;

            int num = vet[i];
            while (num >= 2) {
                int resto = num % 2;
                binario = resto + binario;
                num = num /2;
            }
            binario = num + binario;
            while (binario.length() < 8)
                binario = "0" + binario;

            System.out.println(vet[i]);
            System.out.println(binario);

            impar += 2;
        }
    }
}
