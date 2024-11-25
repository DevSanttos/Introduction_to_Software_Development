public class Ex5 {
    public static void main(String[] args) {
        int[] vet = {1,2,3,4,5,6,7,8,9,10};
        int contaPares = 0;

        for (int i = 0; i < vet.length; i++){
            if (vet[i] % 2 == 0){
                contaPares++;
                System.out.print(vet[i] + " ");

            }
        }
        System.out.println();
        System.out.println("A quantidade de valores pares encontrada foi: " +contaPares);

    }
}
