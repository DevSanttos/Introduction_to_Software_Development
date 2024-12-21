import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex3 {
    static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Informe um valor");
        int num = s.nextInt();

        if (ehPerfeito(num)) {
            System.out.println("Seu número é perfeito");
        } else {
            System.out.println("Seu número é imperfeito");
        }
        //operador ternario;
        String resposta = ehPerfeito(num) ? "Perfeito" : "Imperfeito";
        System.out.println(resposta);
    }
    public static boolean ehPerfeito(int num) {
        int armazena = 0;
        for(int i = 1; i <= num/2; i++){
            boolean ehDivisivel;
            if(num % i == 0){
                armazena += i;
            }
        }
        return armazena == num;
    }
}