package EstruturasDeRepetição.ex06Fatorial;

import java.util.Scanner;

public class MainFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplica = 1;

        System.out.println(fatorial + "! = ");

        for(int contador = fatorial; contador >= 1; contador --) {
            multiplica = multiplica * contador;
        }
        System.out.println(multiplica);
    }
}
