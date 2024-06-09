package Atividade2;

import java.util.Scanner;

public class ProgramaHelloVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        int[] vetor = new int[tamanho];

        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        System.out.println("\nValores do vetor:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        scanner.close();
    }
}
    