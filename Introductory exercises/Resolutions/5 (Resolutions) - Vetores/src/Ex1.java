import java.util.Scanner;

public class Ex1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vet = {1,2,3,4,5,6,7,8,9,10,11,12};
        int result = 0;

        System.out.println("Informe o valor de X");
        int valorX = s.nextInt();
        System.out.println("Informe o valor de Y");
        int valorY = s.nextInt();

        if (valorX > 11 || valorY > 11){
            System.out.println("Valores inválidos");
        }
        else{
            result = vet[valorX] + vet[valorY];
        }
        System.out.println(result);
    }
}
