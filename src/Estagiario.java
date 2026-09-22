//Exercício 8 Sistema de Funcionários

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase - (salarioBase * 0.10);
    }
}