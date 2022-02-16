package EstruturasDeRepetição.ex05Tabuada;

import java.util.Scanner;

public class MainTabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada: " + tabuada);
        for (int contador = 1; contador <= 10; contador ++){
            System.out.println(tabuada + " X " + contador + " = " + (tabuada * contador));
        }
    }
}
