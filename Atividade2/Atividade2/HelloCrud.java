package Atividade2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloCrud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> alunos = new ArrayList<>();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Remover aluno");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.next();
                    alunos.add(nome);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nLista de alunos:");
                    for (String aluno : alunos) {
                        System.out.println(aluno);
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do aluno a ser removido: ");
                    String alunoRemover = scanner.next();
                    if (alunos.remove(alunoRemover)) {
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado na lista.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa. Até mais!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");


    
            }
        }
    }
}