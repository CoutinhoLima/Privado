package Atividade1;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Escreva um número inteiro");
        int A = scan.nextInt();
            System.out.println("Escreva outro número inteiro");
        int B = scan.nextInt();
        if (A > B) {
            int C = A + B;
            System.out.println("Como o primeiro número foi maior que o segundo sua soma é "+C);
            
        }else if (A < B) {
            int C = A * B;
            System.out.println("Como o primeiro número foi menor do que o segundo sua multiplicação é "+C);
            
        }else{
            System.out.println("O primeiro e o segundo número são iguais. Não há operação a ser realizada.");
        }

        scan.close();
    }
    
}/*ProgramaSoma: Faça um algoritmo que leia dois valores inteiros A e B. Se A for o número maior, deverá somar os dois números, caso B seja maior que A, 
então multiplicará os dois valores. Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela,
 e informar qual foi o caminho utilizado.*/

