import java.util.Scanner;

public class ExemploMatriz {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        //Para gravar os valores
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.println("informe o valor");
                matriz[lin][col] = s.nextInt();
            }
        }
        for (int lin = 0; lin < matriz.length; lin++){
            for (int col = 0; col < matriz[0].length; col++)
                if (lin == col)
                    System.out.print(matriz[lin][col] + " ");
        }
        System.out.println(" ");
        //Para imprimir os valores
        for (int lin = 0; lin < matriz.length; lin++){
            for (int col = 0; col < matriz[0].length; col++){
                   System.out.print(matriz[lin][col] + " ");
            }
            System.out.println();
        }
    }
}
