//Exercício 8 Sistema de Funcionários

public class SistemaFuncionarios {

    public static void main(String[] args) {

        Gerente gerente = new Gerente(
                "Wagner",
                5000
        );

        Estagiario estagiario = new Estagiario(
                "Bianca",
                2000
        );

        System.out.println("===== FUNCIONÁRIOS =====");

        System.out.println("Gerente: " + gerente.nome);
        System.out.printf("Salário final: R$ %.2f%n",
                gerente.calcularSalario());

        System.out.println();

        System.out.println("Estagiário: " + estagiario.nome);
        System.out.printf("Salário final: R$ %.2f%n",
                estagiario.calcularSalario());
    }
}