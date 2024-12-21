import java.text.DecimalFormat;
import java.util.Scanner;

public class DadosDemograficos {
    static Scanner s = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        int menorIdade = Integer.MAX_VALUE;
        String associaMenorIdade = "";
        int idade18e20 = 0;
        double somaIdades = 0;
        double porcentFeminino = 0;
        int contaGiros = 0;
        int contaNascidos = 0 ;

        while (true) {
            System.out.println("Nome");
            String nome = s.nextLine();

            if (nome.equalsIgnoreCase("fim")) break;

            System.out.println("Idade");
            int idade = s.nextInt();

            System.out.println("Sexo");
            char sexo = s.next().charAt(0);
            s.nextLine();

            System.out.println("Cidade");
            String cidade = s.nextLine();

            if (menorIdade > idade){
                menorIdade = idade;
                associaMenorIdade = nome;
            }
            if (18 <= idade && idade <= 20){
                idade18e20++;
            }
            somaIdades += idade;

            if (sexo == 'F'){
                porcentFeminino++;
            }
            if (cidade.equalsIgnoreCase("Ibirama")){
                contaNascidos ++;
            }
            contaGiros++;
        }
        System.out.println("Menor idade: "+associaMenorIdade);
        System.out.println("Quantidade 18-20: "+idade18e20);
        System.out.println("Média idade: "+ (df.format(contaGiros > 0 ? somaIdades/contaGiros : 0)));
        System.out.println("Percentual feminino: "+(df.format((porcentFeminino * 100) / contaGiros)));
        System.out.println("Nascidos em Ibirama: "+contaNascidos);


    }
}
