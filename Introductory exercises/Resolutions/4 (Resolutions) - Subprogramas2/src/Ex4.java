import java.util.Scanner;

public class Ex4 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Informe a massa inicial do material Radioativo");
        double massa = s.nextDouble();
//        if (calculaMeiaVida(massa) != 0) {
//            System.out.println(calculaMeiaVida(massa));
//        }

        minhaIdeia(massa);
        double resultadoDaFuncao = calculaMeiaVida(100);
    }
    public static double calculaMeiaVida(double massa) {
        double recebeValor = 0;
        double fazDivisao = massa / 2;
        double contaMeiaVida = 1;

        if (fazDivisao > 0.5) {
            while (recebeValor < 0.5) {
                contaMeiaVida++;

                fazDivisao = massa / 2;
                recebeValor = fazDivisao;

            }
            return contaMeiaVida;
        }
        return 0;
    }

    public static void minhaIdeia(double massaInicial){
        double massaAtual = massaInicial;
        int meiasVidas = 0;

        while (massaAtual > 0.5){
            massaAtual = massaAtual / 2;
            meiasVidas++;
        }

        System.out.println("Demorou " + meiasVidas * 50 + " segundos para alcançar a a massa.");
    }
}

