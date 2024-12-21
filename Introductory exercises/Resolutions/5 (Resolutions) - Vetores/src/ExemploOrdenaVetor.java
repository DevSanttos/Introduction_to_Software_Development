import java.util.Scanner;

public class ExemploOrdenaVetor {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String[]lista ={"aaaaa", "aa","aaaaaaaaaa"};

        for(int i = 0; i < lista.length; i++) {
            for (int x = 0; x < lista.length -1; x++) {
                if (lista[x].length() > lista[x + 1].length()) {
                    String aux = lista[x];
                    lista[x] = lista[x + 1];
                    lista[x+1] = aux;
                }
            }
            System.out.println(" " + lista[i]);
        }
    }
}
