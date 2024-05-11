package Atividade1;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor original do produto:");
        double valorOriginal = scan.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À vista, pix, débito");
        System.out.println("2 - Crédito à vista");
        System.out.println("3 - Crédito parcelado");
        int formaPagamento = scan.nextInt();

        double valorFinal = 0;

        switch (formaPagamento) {
            case 1:
                valorFinal = valorOriginal * 0.9; // Aplica 10% de desconto
                System.out.println("O valor Final fica de " + valorFinal);
                break;
            case 2:
                valorFinal = valorOriginal; // Preço normal, sem desconto
                System.out.println("O preço não sofre alteração: " +valorOriginal);
                break;
            case 3:
                System.out.println("Digite a quantidade de parcelas: ");
                int parcelas = scan.nextInt();
                double taxaJuros = 0.1; // 10% ao mês
                valorFinal = valorOriginal * (1 + (taxaJuros * parcelas)); // Aplica juros simples
                System.out.println("Com o juros simples aplicado o valor vai para: " +valorFinal);
                break;
        }


        scan.close();
    }
}
/*ProgramaCompra: Elaborar um algoritmo que calcula o valor final de um produto com base na forma de pagamento escolhida, caso escolhe parcelado, 
solicitar também a quantidade de parcelas:
A vista, pix, débito: 10% de desconto;
Crédito a vista, preço normal;
Crédito parcelado, aplicado Juros Simples com taxa de 10% ao mês
Fórmula J = C * i * t, onde C=valor original, i=taxa de juros(0,01 nesse caso) e t=quantidade de parcelas;
 */