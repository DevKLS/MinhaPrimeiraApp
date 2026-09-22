//Exercício 9 Conta Bancária com Encapsulamento

public class TesteContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(
                "Marlene",
                15000
        );

        System.out.println("===== SALDO INICIAL =====");
        conta.exibirSaldo();

        System.out.println("\n===== DEPÓSITO =====");
        conta.depositar(500);

        System.out.println("\n===== SAQUE =====");
        conta.sacar(300);

        System.out.println("\n===== TENTATIVA DE SAQUE =====");
        conta.sacar(2000);

        System.out.println("\n===== SALDO FINAL =====");
        conta.exibirSaldo();
    }
}