import java.util.Scanner;

public class Ex8 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        double notaBimestre = 0;
        double contaNota10 = 0;
        int contaBomAproveitamento = 0;
        int contaAlunoExemplar = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println(" ");
            System.out.println("Informe seu nome");
            String nome = s.nextLine();
            for (int x = 1; x < 5; x++) {
                System.out.println("Informe a média do " + x + "º bimestre");
                notaBimestre += s.nextDouble();
                if (notaBimestre == 10) contaNota10++;
            }
            double mediaAnual = notaBimestre / 4;
            System.out.println("Aluno de nome: " + nome + ", recebe a classificação como: ");
            if (mediaAnual >= 9 && mediaAnual <= 10 && contaNota10 >= 2){
                System.out.print("Aluno exemplar");
                contaAlunoExemplar++;
            }
            else if (mediaAnual >= 9 && mediaAnual <= 10) System.out.print("Honras pelo excelente aproveitamento");
            else if (mediaAnual >= 8 && mediaAnual <= 8.9) System.out.print("Honras pelo ótimo aproveitamento");
            else if (mediaAnual >= 7 && mediaAnual <= 7.9) {
                System.out.print("Honras pelo bom aproveitamento");
                contaBomAproveitamento++;
            }
        }
        System.out.println("Quantidade de alunos 'Bom aproveitamento': "+contaBomAproveitamento);
        System.out.println("Quantidade de alunos 'Aluno exemplar': "+contaAlunoExemplar);
    }
}
