package Atividade1;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
    double primeiro = scan.nextDouble();
        System.out.println("Digite o segundo valor");
    double segundo = scan.nextDouble();
    double soma = primeiro + segundo;
        System.out.println("A soma dos dois valores é " +soma );

        scan.close();

    }
}
//ProgramaSomaSimples: Faça um programa que pegue dois valores e mostra a soma deles.