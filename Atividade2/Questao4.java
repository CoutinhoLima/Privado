package Atividade2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero desejado");
        double numero = scan.nextDouble();
        System.out.println("----------Tabuada do numero " +numero+ "----------" );
        for (int i = 1; i <=10; i++) {
           double multiplicação = i * numero; 
            System.out.println(numero+ "x" +i+ "=" +multiplicação );




        }
    scan.close();
    }

}
/*Tabuada: Faça um programa que peça o número e, então, mostre a tabuada do número.
 */