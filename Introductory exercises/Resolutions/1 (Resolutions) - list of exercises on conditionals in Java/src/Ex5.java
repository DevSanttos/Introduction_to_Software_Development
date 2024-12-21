import java.util.Scanner;

public class Ex5 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int quantCaloriasTotal = 0;
        System.out.println("""
                [1] Vegetariano
                [2] Peixe
                [3] Frango
                [4] Carne
                """);
        System.out.println("informe qual será a opção de prato");
        int opcaoPrato = s.nextInt();
        //Verifica quantidade de calorias do prato
        switch (opcaoPrato) {
            case 1:
                quantCaloriasTotal += 180;
                break;
            case 2:
                quantCaloriasTotal += 230;
                break;
            case 3:
                quantCaloriasTotal += 250;
                break;
            case 4:
                quantCaloriasTotal += 350;
                break;
        }
        System.out.println("""
                [1] Abacaxi
                [2] Sorvete diet
                [3] Mouse diet
                [4] Mouse chocolate
                """);
        System.out.println("informe qual será a opção de sobremesa");
        int opcaoSobremesa = s.nextInt();
        //Verifica quantidade de calorias da sobremesa
        switch (opcaoSobremesa) {
            case 1:
                quantCaloriasTotal += 75;
                break;
            case 2:
                quantCaloriasTotal += 110;
                break;
            case 3:
                quantCaloriasTotal += 170;
                break;
            case 4:
                quantCaloriasTotal += 200;
                break;
        }
        System.out.println("""
                [1] Chá
                [2] Suco de Laranja
                [3] Suco de Melão
                [4] Refringerante diet
                """);
        System.out.println("informe qual será a opção de Bebida");
        int opcaoBebida = s.nextInt();
        //Verifica quantidade de calorias da bebida
        switch (opcaoBebida) {
            case 1:
                quantCaloriasTotal += 20;
                break;
            case 2:
                quantCaloriasTotal += 70;
                break;
            case 3:
                quantCaloriasTotal += 100;
                break;
            case 4:
                quantCaloriasTotal += 65;
                break;
        }
        System.out.println("A quantidade de calorias totais consumidas nesta refeição foi: " + quantCaloriasTotal);
    }
}
