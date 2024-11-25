import java.util.Scanner;

public class Ex2 {
    static Scanner s = new Scanner(System.in);
    //uma função pra cada formula?
    public static double formulas(){
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Informe qual será a figura");
        String figura = s.next();

        if (figura.equalsIgnoreCase("Cubo")){
            System.out.println("Informe o valor do comprimento de um lado");
            int lado = s.nextInt();
        }
        else
            if (figura.equalsIgnoreCase("Paralelepípedo")){
                System.out.println("Informe o valor da altura");
                double altura = s.nextInt();
                System.out.println("Infome o valor do comprimento");
                double comprimento = s.nextInt();
                System.out.println("Infome o valor da largura");
                double largura = s.nextInt();
            }
            else
                if (figura.equalsIgnoreCase("Cilíndro")){
                    System.out.println("Informe o valor da altura");
                    double altura = s.nextInt();
                    System.out.println("Infome o valor do raio");
                    double raio = s.nextInt();
                }
                else
                    if (figura.equalsIgnoreCase("esfera")){
                        System.out.println("Informe o valor do raio");
                        double raio = s.nextInt();
                    }
                    else
                        if (figura.equalsIgnoreCase("Cilíndro")){
                            System.out.println("Informe o valor da altura");
                            double altura = s.nextInt();
                            System.out.println("Infome o valor do raio");
                            double raio = s.nextInt();
                        }
                        else
                            System.out.println("Nenhum nome encontrado");




    }

}




