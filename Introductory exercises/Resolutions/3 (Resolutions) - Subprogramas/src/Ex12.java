import java.util.Scanner;

public class Ex12 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o valor de X");
        double valorX = s.nextDouble();
        System.out.println("Informe o valor de Y");
        double valorY = s.nextDouble();
        System.out.println("Informe o valor de Z");
        double valorZ = s.nextDouble();

        //System.out.println("Seu resultado é "+avaliaTriangulo(valorX,valorY,valorZ));
    }
    public static Boolean avaliaTriangulo(int valorX, int valorY, int valorZ){
        return valorX < valorY + valorZ && valorY < valorX + valorZ && valorZ < valorY + valorX;
    }
    public static String nomeiaTrangulo(int valorX, int valorY, int valorZ){
        if (avaliaTriangulo(valorX, valorY, valorZ) == true){
            if (valorX == valorY && valorX == valorZ) return "Triângulo Equilátero";
            else
                if (valorX == valorY && valorX != valorZ || valorX == valorZ && valorX != valorY)
                    return "Triângulo Isóceles";
                else
                    return "Triângulo Escaleno";
        }

        return "Seu valor não configura um triangulo existente";
    }
}
