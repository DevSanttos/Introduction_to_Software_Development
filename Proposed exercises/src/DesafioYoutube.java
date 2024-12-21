import java.util.Scanner;

public class DesafioYoutube {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String[] resp = new String[3];
        int contaAcertos = 0;

        System.out.println("Informe seu nome completo");
        String name = s.nextLine();

        System.out.println("""
                ----------------------------------------
                Pergunta 1
                Qual é a maior estrela do sistema solar?
                
                A) Sol
                B) Lua
                C) Marte
                ----------------------------------------
                """);
        resp[0] = s.next();
        System.out.println("""
                ----------------------------------------
                Pergunta 2
                Qual é a definição de gravidade?
                
                A) Uma energia que flui entre corpos
                B) Uma força que atua sempre em direção ao solo
                C) Uma magia
                ----------------------------------------
                """);
        resp[1] = s.next();
        System.out.println("""
                ----------------------------------------
                Pergunta 3
                Qual é a forma da terra?
                
                A) Triangular
                B) Redonda
                C) Plana
                ----------------------------------------
                """);
        resp[2] = s.next();

        if (resp[0].equals("A")){
            contaAcertos++;
        }
        if (resp[1].equals("B")){
            contaAcertos++;
        }
        if (resp[2].equals("B")){
            contaAcertos++;
        }
        System.out.println("Sua nota na prova é: "+contaAcertos+ " pontos");


    }
}
