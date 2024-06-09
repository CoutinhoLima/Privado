package Atividade2;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramaOrdenação {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        int[] vetor = new int[tamanho];

        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        Arrays.sort(vetor);

        
        System.out.println("\nValores do vetor em ordem crescente:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }

        scanner.close();
    }
}
        
    
    

