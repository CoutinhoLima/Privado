package Atividade1;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número qualquer");
    double numero = scan.nextDouble();
    if (numero % 2 == 0) {
        System.out.println(numero+" É um numero par");

    }else{
        System.out.println(numero+" É um numero impar");
    }
        scan.close();
    }
}
//ProgramaParImpar: Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.
