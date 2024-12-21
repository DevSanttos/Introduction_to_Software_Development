import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetA = new int[5];
        int[] vetB = new int[5];
        int contaAchou = 0;
        int contaNaoAchou = 0;
        Arrays.sort(vetB);
        Arrays.sort(vetA);

        for (int i = 0; i < vetA.length; i++){
            System.out.println("Informe um valor para A");
            vetA[i] = s.nextInt();
        }
        for (int i = 0; i < vetB.length; i++){
            System.out.println("Informe um valor para B");
            vetB[i] = s.nextInt();
        }

        for (int i = 0; i < vetA.length; i++){
            for (int x = 0; x < vetB.length; x++){
                if (vetA[i] == vetB[x]){
                    System.out.println("Os números em comum encontrados foram "+ vetA[i]);
                    contaAchou++;
                }
                if (vetA[i] != vetB[x])
                    contaNaoAchou++;
            }
        }

        if(Arrays.equals(vetA,vetB)){
            System.out.println("Os vetores possuem o mesmo conteúdo");
        }
        else
            System.out.println("Os vetores não possuem o mesmo conteúdo");
        System.out.println("O número de objetos iguais nos dois vetores foi "+contaAchou);
        System.out.println("O número de objetos diferentes nos dois vetores foi "+contaNaoAchou);
    }
}
