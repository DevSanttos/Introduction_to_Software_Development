import java.util.Scanner;

public class Desafio1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] valor = {1,2,3,4,5,6};
        int fazTrocaMaior = valor.length - 1;

        for (int i = 0; i < valor.length/2; i++){
            
            int aux = valor[i];
            valor[i] = valor[fazTrocaMaior];
            valor[fazTrocaMaior] = aux;
            fazTrocaMaior--;
        /*
        int valor = 906609;
        String transformaValor = Integer.toString(valor);
        for (int i = 0; i < transformaValor.length(); i++){
         */
        }
        for (int i = 0; i < valor.length; i++){
            System.out.println(valor[i]);
        }

    }
}
