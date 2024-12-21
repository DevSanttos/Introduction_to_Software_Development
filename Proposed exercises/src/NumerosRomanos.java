import java.util.Scanner;

public class NumerosRomanos {
    static Scanner s = new Scanner(System.in);
    static int converterChar(char caractere) {
        switch (caractere) {
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
            default:  return 0;
        }
    }
    static int converteRomanos(String rom) {
        int valorTotal = 0;
        int numFinal = 0;
        for (int i = rom.length() - 1; i >= 0; i--) {
            int numAtual = converterChar(rom.charAt(i));
            if (numAtual < numFinal) valorTotal -= numAtual;
            else valorTotal += numAtual;
            numFinal = numAtual;
        }
        return valorTotal;
    }
    public static void main(String[] args) {
        String rom = s.nextLine().toUpperCase();
        if (rom.length() > 10) {
            System.out.println("10 max");

            return;
        }
        int resultado = converteRomanos(rom);

        System.out.println(resultado);
    }
}