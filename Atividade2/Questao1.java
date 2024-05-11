package Atividade2;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de rodas (A quantidade minima de rodas é igual a 2)");
    int rodas = scan.nextInt();
        System.out.println("Digite o peso do veículo");
    double peso = scan.nextDouble();
        System.out.println("Digite a quantidade máxima de pessoas que cabem no veículo, caso pretenda obter uma categoria de transporte");
    int pessoas = scan.nextInt();
    
    if ((rodas >= 2) && (rodas <= 3)) {
        System.out.println("A categoria necessaria para conduzir tal veículo é a (A)");
    }else if (rodas >= 4) {
        if ((pessoas <= 8) && (peso <= 3500)) {
            System.out.println("A categoria necessaria para conduzir tal veículo é a (B)");    
        }else if ((peso > 3500) && (peso <= 6000)) {
            System.out.println("A categoria necessaria para conduzir tal veículo é a (C)");
        }else if (pessoas > 8) {
            System.out.println("A categoria necessaria para conduzir tal veículo é a (D)");
        }else if (peso > 6000) {
            System.out.println("A categoria necessaria para conduzir tal veículo é a (E)");
        }
    }else{
        System.out.println("Não foi possivel descobrir a categoria do veiculo, verifique as informações e tente novamente");
    }
        scan.close();

        

    }
    
}
/*CategoriaCNH: Faça um programa que recebe as algumas características de um veículo e, com base nas informações, informar a categoria necessária para dirigir/pilotar o veículo:
Informações necessárias:
Quantidade de rodas;
Peso bruto do veículo, em kgs;
Quantidade de pessoas no veículo;
Categorias:
A: veículo com 2 ou 3 rodas;
B: veículos com 4 rodas e até 8 pessoas e peso de até 3500 kg;
C: veículos com 4 rodas ou mais e com peso entre 3500 e 6000 kg;
D: veículos com 4 rodas ou mais e com mais de 8 pessoas;
E: veículos com 4 rodas ou mais e com mais de 6000 kg;
 */