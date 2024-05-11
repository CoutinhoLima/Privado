package Atividade1;
import java.util.Scanner;

public class Questao7 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a primera nota do aluno:");
double nota1 = scan.nextDouble();
    System.out.println("Digite a segunda nota do aluno:");
double nota2 = scan.nextDouble();
    System.out.println("Digite a terceira nota do aluno:");
double nota3 = scan.nextDouble();
double média = (nota1 + nota2*2 + nota3*3) / 6;

    if (média >= 90) {
        System.out.println("Aprovado, sua nota foi A.");
        
    }else if ((média >= 75) && (média <90)) {
        System.out.println("Aprovado, sua nota foi B.");
        
    }else if ((média >= 60) && (média <75)) {
        System.out.println("Aprovado, sua nota foi C.");
        
    }else if ((média >= 40) && (média < 60)) {
        System.out.println("Reprovado, sua nota foi D, estude mais.");
        
    }else{
        System.out.println("Reprovado, sua nota foi E, estude mais.");
    }







    scan.close();
}
}
/*ProgramaMedia: Escreva um algoritmo que irá pegar as três notas do aluno aplicando a seguinte fórmula para Média abaixo, e 
então imprimir na tela o conceito final do aluno junto com a mensagem de APROVADO (caso conceito A, B ou C) ou REPROVADO (caso conceito D ou E)
Média = (nota1 + nota2*2 + nota3*3) / 6
Conceitos
Média >= 90 -> A 
Média >= 75 e < 90 B
Média >= 60 e < 75 C
Média >= 40 e < 60 D
Média < 40 E
 */