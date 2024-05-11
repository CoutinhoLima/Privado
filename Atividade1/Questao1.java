package Atividade1;
import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome");
    String nome = scan.nextLine();
        System.out.println("Digite sua idade");
    int idade = scan.nextInt();
        System.out.println("Olá " +nome+ " você tem " +idade+ " anos");


      scan.close();  
    }
    
}
/*Programa HelloWorld: Faça um programa que recebe o seu nome e sua idade, e 
então mostrará uma mensagem de saudação “Olá NOME_COMPLETO, você tem IDADES anos”.*/


