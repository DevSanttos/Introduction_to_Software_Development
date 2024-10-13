import java.util.Scanner;

public class Ex9 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int contaBomAproveitamento = 0;
        int contaAlunoExemplar = 0;

        for (int i = 1; i <= 5; i++) {
            double notaBimestre = 0;
            int contaNota10 = 0;
            StringBuilder bimestresComNota10 = new StringBuilder();

            System.out.println(" ");
            System.out.println("Informe seu nome");
            String nome = s.nextLine();

            for (int x = 1; x <= 4; x++) {
                System.out.println("Informe a média do " + x + "º bimestre");
                double nota = s.nextDouble();
                s.nextLine();
                notaBimestre += nota;
                if (nota == 10) {
                    contaNota10++;
                    bimestresComNota10.append(x).append("º bimestre, ");
                }
            }

            double mediaAnual = notaBimestre / 4;
            System.out.println("Aluno de nome: " + nome + ", recebe a classificação como: ");

            if (mediaAnual >= 9 && mediaAnual <= 10 && contaNota10 >= 2) {
                System.out.println("Aluno exemplar");
                contaAlunoExemplar++;
                if (bimestresComNota10.length() > 0) {
                    System.out.println("Bimestres com nota 10: " + bimestresComNota10.substring(0, bimestresComNota10.length() - 2));
                }
            } else if (mediaAnual >= 9 && mediaAnual <= 10) {
                System.out.println("Honras pelo excelente aproveitamento");
            } else if (mediaAnual >= 8 && mediaAnual <= 8.9) {
                System.out.println("Honras pelo ótimo aproveitamento");
            } else if (mediaAnual >= 7 && mediaAnual <= 7.9) {
                System.out.println("Honras pelo bom aproveitamento");
                contaBomAproveitamento++;
            } else {
                System.out.println("Sem citação de mérito.");
            }
        }

        System.out.println("Quantidade de alunos 'Bom aproveitamento': " + contaBomAproveitamento);
        System.out.println("Quantidade de alunos 'Aluno exemplar': " + contaAlunoExemplar);
        double percentualAlunoExemplar = (contaAlunoExemplar / 5.0) * 100;
        System.out.println("Percentual de alunos 'Aluno exemplar': " + percentualAlunoExemplar + "%");
    }
}
