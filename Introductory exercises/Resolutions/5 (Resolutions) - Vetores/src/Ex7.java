import java.util.Scanner;

public class Ex7 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        int[] vetC = new int[vetA.length + vetB.length];

        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Informe um valor pro ver A");
            vetA[i] = s.nextInt();
        }
        for (int i = 0; i < vetB.length; i++) {
            System.out.println("Informe um valor pro vet B");
            vetB[i] = s.nextInt();
        }
        int idx = 0;
        for (int i = 0; i < vetA.length; i++){
            vetC[idx] = vetA[i];
            idx +=2;
        }
        idx = 1;
        for (int i = 0; i < vetB.length; i++){
            vetC[idx] = vetB[i];
             idx +=2;
        }
        for (int i = 0; i < vetC.length; i++){
            System.out.print(vetC[i] + " ");
        }
    }
}
