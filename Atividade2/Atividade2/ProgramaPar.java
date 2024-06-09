package Atividade2;

import java.util.Scanner;

public class ProgramaPar {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        int tamanho = 10;
        int[] numeros = new int[tamanho];

        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scan.nextInt();
        }

    
        System.out.println("\nNúmeros pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        scan.close();
    }
}
