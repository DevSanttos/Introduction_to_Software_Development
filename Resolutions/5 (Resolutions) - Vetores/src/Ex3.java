public class Ex3 {
    public static void main(String[] args) {
        int[] vet = {1,2,3,4,5,6,7,8,9,10};
        int aux = 0;

        for (int i = 0; i < 5; i++) {
            aux = vet[i];
            vet[i] = vet[(vet.length - 1) - i];
            vet[(vet.length - 1) - i] = aux;
        }

        for (int i = 0; i < vet.length; i++){
            System.out.println(vet[i]);
        }
    }
}
