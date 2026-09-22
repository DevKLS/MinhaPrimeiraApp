//Exercício 9 Conta Bancária com Encapsulamento

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado.%n", valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado.%n", valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s%n", titular);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }
}