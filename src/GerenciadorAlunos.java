//Exercício 7 Gerenciador de Alunos

import java.util.Scanner;

public class GerenciadorAlunos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(
                nome,
                matricula,
                nota1,
                nota2,
                nota3
        );

        System.out.println("\n===== SITUAÇÃO DO ALUNO =====");
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);

        aluno.verificarAprovacao();

        scanner.close();
    }
}