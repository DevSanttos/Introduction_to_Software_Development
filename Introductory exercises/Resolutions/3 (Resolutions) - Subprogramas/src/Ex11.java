import java.util.Scanner;

public class Ex11 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a sua altura");
        double altura = s.nextDouble();

        System.out.println("informe qual o seu sexo");
        String sexo = s.next();

        System.out.println("O seu peso ideal seria: "+calculaPesoIdeal(altura, sexo));
    }
    public static double calculaPesoIdeal(double altura, String sexo){
        if (sexo.equalsIgnoreCase("Masculino")){
            return 72.7 * altura - 58;
        }
        else
            if (sexo.equalsIgnoreCase("Feminino")){
                return 62.1 * altura - 44.7;
            }
            return 0;
    }
}
