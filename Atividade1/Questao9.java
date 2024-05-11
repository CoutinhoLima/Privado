package Atividade1;
import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
    double primeiro = scan.nextDouble();
        System.out.println("Digite o segundo numero");
    double segundo = scan.nextDouble();

        System.out.println("Escolha uma operação");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
    int operação = scan.nextInt();
    double soma = 0;
    double subtração = 0;
    double divisão = 0;
    double multiplicação = 0;
        switch (operação) {
            case 1:
                soma = primeiro + segundo;
                System.out.println("Sua soma é de " +soma);
                
                break;
            
            case 2:
                subtração = primeiro - segundo;
                System.out.println("Sua subtração é " +subtração);
                break;
            case 3:
                divisão = primeiro / segundo;
                System.out.println("Sua divisão é " +divisão);
                break;
            case 4:
                multiplicação = primeiro * segundo;
                System.out.println("Sua multiplicação é " +multiplicação);
                break;
            default:
            System.out.println("Operação invalida");
            scan.close();
            return;
                
        
        }







        scan.close();
    }
}
/*ProgramaCalculadoraSimples: Faça um programa que receba dois números e a operação desejada de cálculo, então mostrará o resultado da operação
Operações
Soma
Subtração
Divisão
Multiplicação
 */