package Arrays.ex03NumerosAleatorios;

import java.util.Random;

public class MainNumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        for (int contador = 0; contador < numerosAleatorios.length; contador++) {
            int numero = random.nextInt(100);
            numerosAleatorios[contador] = numero;
            }

        System.out.print("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }

        System.out.print("\nSucessor dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}
