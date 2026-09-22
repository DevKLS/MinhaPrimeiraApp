//Exercício 4 Simulador de Empréstimo Bancário

import java.util.Scanner;

public class SimuladorEmprestimo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do empréstimo: R$ ");
        double valorEmprestimo = scanner.nextDouble();

        int parcelas;

        do {
            System.out.print("Digite a quantidade de parcelas (6 a 48): ");
            parcelas = scanner.nextInt();

            if (parcelas < 6 || parcelas > 48) {
                System.out.println("Quantidade inválida. Escolha entre 6 e 48 parcelas.");
            }

        } while (parcelas < 6 || parcelas > 48);

        double jurosMensal = 0.03;

        double valorTotal = valorEmprestimo * Math.pow(1 + jurosMensal, parcelas);
        double valorParcela = valorTotal / parcelas;

        System.out.println("\n===== SIMULAÇÃO DO EMPRÉSTIMO =====");
        System.out.println("Cliente: " + nome);
        System.out.printf("Valor solicitado: R$ %.2f%n", valorEmprestimo);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Juros mensal: 3%");
        System.out.printf("Valor total pago: R$ %.2f%n", valorTotal);
        System.out.printf("Valor da parcela mensal: R$ %.2f%n", valorParcela);

        scanner.close();
    }
}