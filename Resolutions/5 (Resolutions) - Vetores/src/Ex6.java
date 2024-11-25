public class Ex6 {
    public static void main(String[] args) {
        int[] vet = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < vet.length; i++){
            if (vet[i] % 2 != 0){
                vet[i] = 0;
            }
        }
        for (int j : vet) {
            System.out.print(j + " ");
        }
    }
}
