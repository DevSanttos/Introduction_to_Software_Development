import java.util.Scanner;

public class Ex10 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int candidatosComercio = 0, candidatosIndustria = 0;
        int aptosComercio = 0, aptosIndustria = 0;
        int inaptosComercio = 0, inaptosIndustria = 0;

        for (int i = 1; i <= 30; i++) {
            int verificaApt = 0;
            System.out.println("Informe seu nome completo:");
            String nome = s.nextLine();

            System.out.println("""
                    Informe qual é o posto de trabalho desejado.
                    [1] - Comercio
                    [2] - Industria
                    """);
            int cargoDesejado = s.nextInt();

            if (cargoDesejado == 1) {
                candidatosComercio++;
                System.out.println("Informe se sua residência é dentro ou fora da cidade:");
                String cidadeResidencia = s.nextLine();
                System.out.println("Informe seu tempo de residência na cidade em meses:");
                int tempoResidencia = s.nextInt();
                s.nextLine();
                System.out.println("Informe seu nível de escolaridade:");
                String escolaridade = s.nextLine();
                System.out.println("Informe qual o seu tipo de experiência:");
                String experiencia = s.nextLine();

                if (cidadeResidencia.equalsIgnoreCase("Dentro") && tempoResidencia >= 12) verificaApt++;
                if (escolaridade.equalsIgnoreCase("Segundo grau completo") || escolaridade.equalsIgnoreCase("Ensino superior"))
                    verificaApt++;
                if (experiencia.equalsIgnoreCase("Experiência comprovada")) verificaApt++;

                if (verificaApt == 3) {
                    System.out.println("Candidato Apto!");
                    aptosComercio++;
                } else {
                    System.out.println("Candidato Inapto");
                    inaptosComercio++;
                }
            } else if (cargoDesejado == 2) {
                candidatosIndustria++;
                System.out.println("Informe seu nível de escolaridade:");
                String escolaridade = s.nextLine();
                boolean aptoIndustria = false;

                if (escolaridade.equalsIgnoreCase("Segundo grau completo")) {
                    System.out.println("Você pode se ingressar somente em cargos operacionais.");
                    aptoIndustria = true;
                } else if (escolaridade.equalsIgnoreCase("Ensino superior")) {
                    System.out.println("Você pode ingressar em cargos operacionais ou gerência.");
                    System.out.println("""
                            [1] - Cargos operacionais
                            [2] - Cargos de gerência
                            """);
                    int tipoCargo = s.nextInt();
                    s.nextLine();
                    if (tipoCargo == 2) {
                        System.out.println("Informe qual o seu tipo de experiência:");
                        String experiencia = s.nextLine();
                        if (experiencia.equalsIgnoreCase("Experiência comprovada")) {
                            aptoIndustria = true;
                        }
                    } else {
                        aptoIndustria = true;
                    }
                }
                if (aptoIndustria) {
                    System.out.println("Candidato Apto!");
                    aptosIndustria++;
                } else {
                    System.out.println("Candidato Inapto");
                    inaptosIndustria++;
                }
            }
        }
        System.out.println("\nResultados Finais:");
        System.out.println("Candidatos para o Comércio: " + candidatosComercio);
        System.out.println("Candidatos para a Indústria: " + candidatosIndustria);
        System.out.println("Percentual de inaptos no Comércio: " + (inaptosComercio * 100.0 / candidatosComercio) + "%");
        System.out.println("Percentual de inaptos na Indústria: " + (inaptosIndustria * 100.0 / candidatosIndustria) + "%");
        System.out.println("Candidatos aptos no Comércio: " + aptosComercio);
        System.out.println("Candidatos aptos na Indústria: " + aptosIndustria);
    }
}