import java.util.Scanner;

public class Ex13 {
    static Scanner s = new Scanner(System.in);

    public static double calculaFat(int valor){
        int num = 1;
        for(int i = 1; i <= valor; i++){
            num = num * i;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println("Informe um valor inteiro");
        int valor = s.nextInt();

        System.out.println(calculaFat(valor));
    }

}
