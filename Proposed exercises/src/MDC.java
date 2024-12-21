import java.util.Scanner;

public class MDC {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o valor do dividendo");
        int dividendo = s.nextInt();

        System.out.println("Informe o valor do divisor");
        int divisor = s.nextInt();
        int resto = dividendo%divisor;

        while (resto != 0){
            dividendo = divisor;
            divisor = resto;
            resto = dividendo % divisor;
        }

        System.out.println("O MDC é: "+divisor);

    }
}
