package Arrays.ex01OrdemInversa;

public class MainOrdemInversa {
    public static void main(String[] args) {
    // Crie um vetor de 6 números inteiros e mostre-os na ordem inversa
        int [] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        int contador = 0;

        while (contador < vetor.length){
            System.out.print(vetor[contador] + " ");
            contador ++;
        }

        System.out.println("\nVetor: ");
        for(int contador1 = (vetor.length - 1); contador1 >= 0; contador1 --){
            System.out.print(vetor[contador1] + " ");
        }
    }
}


