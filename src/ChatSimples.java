//Exercício 12 Sistema de Chat Simples com Arrays

import java.util.Scanner;

public class ChatSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] mensagens = new String[10];

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        int posicao = 0;

        for (int rodada = 0; rodada < 5; rodada++) {

            System.out.print(
                    usuario1 + ", digite sua mensagem: "
            );

            String mensagem1 = scanner.nextLine();

            mensagens[posicao] =
                    usuario1 + ": " + mensagem1;

            posicao++;

            System.out.print(
                    usuario2 + ", digite sua mensagem: "
            );

            String mensagem2 = scanner.nextLine();

            mensagens[posicao] =
                    usuario2 + ": " + mensagem2;

            posicao++;
        }

        System.out.println("\n===== Histórico de Mensagens =====");

        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }

        System.out.println(
                "\nObrigado por utilizarem o sistema! "
                        + "Boa sorte para vocês!"
        );

        scanner.close();
    }
}