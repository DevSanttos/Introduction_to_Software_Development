public class Ex12 {
    public static void main(String[] args) {
        int[] vet = {1,2,0,3,0,0,7,42,0,23};
        int aux = 0;

        for (int i = 0; i < vet.length; i++){
            if (vet[i] < vet[i +1]) {
                aux = vet[i];
                vet[i] = vet[i + 1];
                vet[i + 1] = aux;
            }
        }
    }
}
