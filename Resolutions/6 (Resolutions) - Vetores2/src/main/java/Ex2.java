public class Ex2 {
    public static void main(String[] args) {

        int[] vet = {1, 2, 3, 4, 5, 6, 7, 8};
        int aux = 0;
        int armazenaPrimeiraMetade = 0;
        int armazenaSegundaMetade = 0;
        int maiorValor = 0;
        int menorValor = 0;
        boolean existePrimo = false;

        double condicao = vet.length / 2;

        for (int i = 0; i < condicao; i++) {
            aux = vet[i];
            armazenaSegundaMetade += vet[i];
            if (vet[i] > maiorValor) maiorValor = vet[i];
            if (vet[i] < menorValor) menorValor = vet[i];

            vet[i] = vet[(vet.length - 1) - i];
            if (vet[(vet.length - 1) - i] > maiorValor) maiorValor = vet[i];
            if (vet[(vet.length - 1) - i] < menorValor) menorValor = vet[i];

            armazenaPrimeiraMetade += vet[(vet.length - 1) - i];
            vet[(vet.length - 1) - i] = aux;

            if (!existePrimo) {
                boolean primo = vet[i] >= 2;
                for (int x = 2; x < vet[i]; x++) {
                    if (vet[i] % x == 0) {
                        primo = false;
                        break;
                    }
                }
            }
        }
        for (int j : vet) {
            System.out.println(j);
        }
        System.out.println("Primeira metade " + armazenaPrimeiraMetade);
        System.out.println("Média da segunda metade " + armazenaSegundaMetade / 4);
        System.out.println(existePrimo);
        System.out.println(maiorValor);
        System.out.println(menorValor);
    }
}
