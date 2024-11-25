public class Ex11Incompleto {
    public static void main(String[] args) {
        int[] vet = {43,124,23,12,14,43,51};
        int repete = 0;

        for (int i = 0; i < vet.length; i++){
            for (int x = i + 1; x < (vet.length); x++){
                   if ((vet[x] == vet[i])){
                       repete++;
                   }
            }
            if(repete > 0) {
                System.out.println("O valor " + vet[i] + " aparece " + (repete+1) + " vezes.");
            }

        }

    }
}
