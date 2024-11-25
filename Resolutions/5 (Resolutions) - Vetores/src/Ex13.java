public class Ex13 {
    public static void main(String[] args) {
        int [] vet ={1,5,7,6,9,2,8,4,0,3};

        int aux = vet[0];
        for (int i = 0; i < vet.length; i++){
            aux = vet[aux];
            System.out.print(aux + " ");
        }
    }
}
