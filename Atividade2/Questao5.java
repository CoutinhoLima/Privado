package Atividade2;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de níveis da escada: ");
        int niveis = scan.nextInt();

        for (int i = 1; i <= niveis; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        scan.close();
    }
}
