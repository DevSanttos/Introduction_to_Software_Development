import java.util.Scanner;

public class MultiplicaMatriz {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        s.useDelimiter(";");
        int linhaAux = 3;
        int fazSomaA = 0;
        int colunaAux = 1;
        int fazSomaB = 0;
        int somaDiagonalPri = 0;
        int somaDiagonalSec = 0;
        int somaTudo = 0;

        //Grava valores
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.println("informe o valor");
                matriz[lin][col] = s.nextInt();
                somaTudo += matriz[lin][col];
            }
            s.useDelimiter("/n");
        }

        //Soma quarta linha
        for (int i = 0; i < 5; i++)
            fazSomaA += matriz[linhaAux][i];
        System.out.println(fazSomaA);

        //Soma 2° Coluna
        for (int i = 0; i < 5; i++)
            fazSomaB += matriz[i][colunaAux];
        System.out.println(fazSomaB);

        //Diagonal principal
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++)
                if (lin == col) somaDiagonalPri += matriz[lin][col];
        }
        System.out.println(somaDiagonalPri);

        //Diagonal secundária
        for (int i = 0; i < 5; i++) somaDiagonalSec += matriz[i][4 - i];
        System.out.println(somaDiagonalSec);

        //Todos os elementos da Matriz
        System.out.println(somaTudo);
    }
}
