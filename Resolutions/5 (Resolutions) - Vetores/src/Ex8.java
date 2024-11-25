public class Ex8 {
    public static void main(String[] args) {
        int[] vet = {1,2,3,4,5};
        int armazena = 0;

        for (int i = 0; i < vet.length; i++){
            armazena += vet[i];
            vet[i] = armazena;
        }
        for (int j : vet) {
            System.out.print(j + " ");
        }

    }

}

