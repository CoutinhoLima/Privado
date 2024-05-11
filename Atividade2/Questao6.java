package Atividade2;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();

        String binario = Integer.toBinaryString(numero);

        System.out.println("A representação binária de " + numero + " é: " + binario);

        scan.close();
    }
}
