package EstruturasDeRepetição.ex02Nota;

import java.util.Scanner;

public class MainNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota >10){
            System.out.println("nota inválida! digite novamente");
            nota = scan.nextInt();
        }
    }
}
