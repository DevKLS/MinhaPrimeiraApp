//Exercício 11 Simulação de Loteria

import java.util.Random;
import java.util.Scanner;

public class SimulacaoLoteria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numerosSorteados = new int[6];
        int[] numerosUsuario = new int[6];

        for (int i = 0; i < 6; i++) {

            int numero;

            do {
                numero = random.nextInt(60) + 1;
            } while (numeroJaExiste(numerosSorteados, numero, i));

            numerosSorteados[i] = numero;
        }

        System.out.println("===== LOTERIA =====");

        System.out.println("Digite 6 números entre 1 e 60.");

        for (int i = 0; i < 6; i++) {

            int numero;

            do {
                System.out.print("Número " + (i + 1) + ": ");
                numero = scanner.nextInt();

                if (numero < 1 || numero > 60) {
                    System.out.println("Digite um número entre 1 e 60.");
                }

            } while (numero < 1 || numero > 60);

            numerosUsuario[i] = numero;
        }

        int acertos = 0;

        for (int numeroUsuario : numerosUsuario) {

            for (int numeroSorteado : numerosSorteados) {

                if (numeroUsuario == numeroSorteado) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("\n===== RESULTADO =====");

        System.out.print("Números sorteados: ");

        for (int numero : numerosSorteados) {
            System.out.print(numero + " ");
        }

        System.out.println();

        System.out.println("Quantidade de acertos: " + acertos);

        scanner.close();
    }

    public static boolean numeroJaExiste(
            int[] numeros,
            int numero,
            int quantidade
    ) {

        for (int i = 0; i < quantidade; i++) {

            if (numeros[i] == numero) {
                return true;
            }
        }

        return false;
    }
}