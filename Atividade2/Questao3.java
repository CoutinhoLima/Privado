package Atividade2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroPessoas = 12;
        int idadeMaisNova = Integer.MAX_VALUE;
        int idadeMaisVelha = Integer.MIN_VALUE;

        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scan.nextInt();

            
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
            }

            
            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
            }
        }

        System.out.println("A idade mais nova é: " + idadeMaisNova);
        System.out.println("A idade mais velha é: " + idadeMaisVelha);

       
       
        scan.close();
    }
}
