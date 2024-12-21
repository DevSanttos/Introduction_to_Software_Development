import java.util.Scanner;

public class Ex8 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o valor da primeira nota");
        double nota1 = s.nextDouble();
        System.out.println("Informe o valor da segunda nota");
        double nota2 = s.nextDouble();
        System.out.println("Informe o valor da terceira nota");
        double nota3 = s.nextDouble();
        System.out.println("Informe o valor da quarta nota");
        double nota4 = s.nextDouble();
        //Realiza a média das 4 notas
        double fazMedia = nota1 + nota2 + nota3 + nota4 / 4;
        //Verifica a nota e se aluno foi, ou não, aprovado
        if (fazMedia >= 7) System.out.println("Aprovado! Valor da média : " + fazMedia);
        else System.out.println("Informe o valor da nota do exame");
        double notaExam = s.nextDouble();
        //Realiza a nova média
        double novaMedia = fazMedia + notaExam / 2;
        if (novaMedia >= 5) System.out.println("Aluno aprovado com exame! Valor da média : " + novaMedia);
        else System.out.println("Aluno não aprovado!  Valor da média : " + novaMedia);
    }
}
