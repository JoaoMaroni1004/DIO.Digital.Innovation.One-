package EstruturasDeRepetição.ex03MaiorEMedia;

import java.util.Scanner;

public class MainMaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;
        int contador = 0;

        do {
            System.out.println("número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;
            contador ++;

        } while(contador < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
