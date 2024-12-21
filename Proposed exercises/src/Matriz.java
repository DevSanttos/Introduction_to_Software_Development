import java.util.Scanner;

public class Matriz {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        s.useDelimiter("\n");
        System.out.println("Informe o número de linhas de A");
        int linhaA = s.nextInt();
        System.out.println("Informe o número de colunas de A");
        int colunaA = s.nextInt();
        int[][] matrizA = new int[linhaA][colunaA];
        s.nextLine();
        s.useDelimiter(";");

        System.out.println("Informe os valores de A");
        for (int i = 0; i < linhaA; i++) {
            for (int x = 0; x < colunaA; x++) {
                matrizA[i][x] = s.nextInt();
            }
            s.nextLine();
        }
        s.useDelimiter("\n");

        System.out.println("Informe o número de linhas de B");
        int linB = s.nextInt();
        System.out.println("Informe a quantidade de colunas de B");
        int colB = s.nextInt();
        if (colunaA != linB) {
            System.out.println("Impossível multiplicar");
        }
        int[][] matrizB = new int[linB][colB];
        s.nextLine();
        s.useDelimiter(";");

        System.out.println("Informe os valores de B");
        for (int i = 0; i < linB; i++) {
            for (int x = 0; x < colB; x++) {
                matrizB[i][x] = s.nextInt();
            }
            s.nextLine();
        }

        int[][] matrizC = new int[linhaA][colB];
        for (int i = 0; i < linhaA; i++) {
            for (int x = 0; x < colB; x++) {
                for (int y = 0; y < colunaA; y++) {
                    matrizC[i][x] = matrizC[i][x] + (matrizA[i][y] * matrizB[y][x]);
                }
            }
        }
        for (int i = 0; i < linhaA; i++) {
            for (int x = 0; x < colB; x++) {
                System.out.print(matrizC[i][x] + " ");
            }
            System.out.println();
        }
    }
}
