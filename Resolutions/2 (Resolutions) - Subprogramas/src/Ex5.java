import java.util.Scanner;

public class Ex5 {
    static Scanner s = new Scanner(System.in);

    public static String converteTempo(int seg){
        int horas = seg / 3600;
        int restoHora = seg % 3600;
        int minutos = restoHora / 60;
        int segundos = restoHora % 60;

        return "O tempo de duração do processo é "+horas+" horas, " +minutos+" minutos e "+ segundos+ " segundos";
    }

    public static void main(String[] args) {
        System.out.println("Informe o tempo de duração do processo em segundos");
        int seg = s.nextInt();

        System.out.println(converteTempo(seg));
    }
}
