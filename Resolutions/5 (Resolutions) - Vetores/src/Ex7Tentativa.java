import java.util.Scanner;

public class Ex7Tentativa {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        int[] vetC = new int[vetA.length + vetB.length];

        for (int i = 0; i < vetA.length; i++){
            System.out.println("Informe um valor pro ver A");
            vetA[i] =  s.nextInt();
        }
        for (int i = 0; i < vetB.length; i++){
            System.out.println("Informe um valor pro vet B");
            vetB[i] =  s.nextInt();
        }
        for (int i = 0; i < vetC.length; i++){
            if (i % 2 == 0){
                for (int x = 0; x < vetC.length; x++){
                    if (vetA[x] % 2 == 0){
                        vetC[i] = vetA[x];
                        break;
                    }
                }
            }

        } for (int i = 0; i < vetC.length; i++){
            if (i % 2 != 0) {
                for (int x = 0; x < vetC.length; x++) {
                    if (vetB[x] % 2 != 0) {
                        vetC[i] = vetB[x];
                        break;
                    }
                }
            }
        }
        for (int j : vetC) {
            System.out.print(j + " ");
        }

    }
}
