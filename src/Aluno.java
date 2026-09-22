//Exercício 7 Gerenciador de Alunos

public class Aluno {

    String nome;
    String matricula;
    double nota1;
    double nota2;
    double nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao() {

        double media = calcularMedia();

        System.out.printf("Média: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}