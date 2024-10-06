import java.util.Scanner;

public class Ex4 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a sua idade");
        int idade = s.nextInt();
        //Realiza a verificação e retorna a classe eleitoral
        if (idade < 16)
            System.out.println("Não eleitor");
        else if (idade >= 18 && idade <= 65)
            System.out.println("Eleitor obrigatório");
        else System.out.println("Eleito facultativo");
    }
}
