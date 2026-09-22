//Exercício 6 Cadastro de Veículos

public class CadastroVeiculos {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo(
                "ABC-1234",
                "Volkswagen Nivus",
                2024,
                24500
        );

        Veiculo veiculo2 = new Veiculo(
                "DEF-5678",
                "Honda Civic",
                2022,
                18000
        );

        System.out.println("===== VEÍCULO 1 =====");
        veiculo1.exibirDetalhes();

        System.out.println("\nRegistrando viagem de 250 km...");
        veiculo1.registrarViagem(250);

        System.out.println("\nApós a viagem:");
        veiculo1.exibirDetalhes();

        System.out.println("\n===== VEÍCULO 2 =====");
        veiculo2.exibirDetalhes();

        System.out.println("\nRegistrando viagem de 500 km...");
        veiculo2.registrarViagem(500);

        System.out.println("\nApós a viagem:");
        veiculo2.exibirDetalhes();
    }
}