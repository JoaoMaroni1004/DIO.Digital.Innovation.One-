package EstruturasDeRepetição.ex04ParEimpar;

import java.util.Scanner;

public class MainParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int numero;
        int contador = 0;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares ++;
            else quantImpares ++;
            contador ++;
        } while(contador < quantNumeros);

        System.out.println("Quantidade de Par: " + quantPares);
        System.out.println("Quantidade de Impares: " + quantImpares);
    }
}
