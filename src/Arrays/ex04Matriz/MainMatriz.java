package Arrays.ex04Matriz;

import java.util.Random;

public class MainMatriz {
    public static void main(String[] args) {
        Random random = new Random();
        // O primmeiro numero dentro do colchete representa a linha
        // O segundo número dento do colchete representa a coluna
        int[][] matriz = new int[10][10];

        for(int linha = 0; linha < matriz.length; linha ++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna ++){
                matriz[linha][coluna] = random.nextInt(9);
            }
        }

        System.out.print("Matriz: \n");
        for(int[] linha1 : matriz){
            for(int coluna1 : linha1){
                System.out.print(coluna1 + " ");
            }
            System.out.println();
        }
    }
}
