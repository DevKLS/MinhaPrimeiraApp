//Exercício 10 Registro de Compras em Arquivo

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroCompras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            FileWriter escritor = new FileWriter("compras.txt");

            System.out.println("===== CADASTRO DE COMPRAS =====");

            for (int i = 1; i <= 3; i++) {

                System.out.println("\nCompra " + i);

                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.print("Preço unitário: R$ ");
                double preco = Double.parseDouble(
                        scanner.nextLine().replace(",", ".")
                );

                escritor.write(
                        produto + ";" +
                                quantidade + ";" +
                                preco + "\n"
                );
            }

            escritor.close();

            System.out.println("\nCompras salvas no arquivo compras.txt.");

            System.out.println("\n===== COMPRAS REGISTRADAS =====");

            File arquivo = new File("compras.txt");
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {

                String linha = leitor.nextLine();

                String[] dados = linha.split(";");

                String produto = dados[0];
                int quantidade = Integer.parseInt(dados[1]);
                double preco = Double.parseDouble(dados[2]);

                System.out.printf(
                        "Produto: %s | Quantidade: %d | Preço unitário: R$ %.2f%n",
                        produto,
                        quantidade,
                        preco
                );
            }

            leitor.close();

        } catch (IOException e) {

            System.out.println("Erro ao manipular o arquivo: "
                    + e.getMessage());
        }

        scanner.close();
    }
}