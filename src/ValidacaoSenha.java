//Exercício 2 Validação de Senha Segura

import java.util.Scanner;

public class ValidacaoSenha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha;

        while (true) {

            System.out.print("Digite uma senha: ");
            senha = scanner.nextLine();

            boolean tamanhoValido = senha.length() >= 8;
            boolean temMaiuscula = false;
            boolean temNumero = false;
            boolean temEspecial = false;

            for (int i = 0; i < senha.length(); i++) {

                char caractere = senha.charAt(i);

                if (Character.isUpperCase(caractere)) {
                    temMaiuscula = true;
                }

                if (Character.isDigit(caractere)) {
                    temNumero = true;
                }

                if (!Character.isLetterOrDigit(caractere)) {
                    temEspecial = true;
                }
            }

            boolean senhaValida = true;

            if (!tamanhoValido) {
                System.out.println("Erro: a senha deve ter no mínimo 8 caracteres.");
                senhaValida = false;
            }

            if (!temMaiuscula) {
                System.out.println("Erro: a senha deve conter pelo menos uma letra maiúscula.");
                senhaValida = false;
            }

            if (!temNumero) {
                System.out.println("Erro: a senha deve conter pelo menos um número.");
                senhaValida = false;
            }

            if (!temEspecial) {
                System.out.println("Erro: a senha deve conter pelo menos um caractere especial.");
                senhaValida = false;
            }

            if (senhaValida) {
                System.out.println("Senha cadastrada com sucesso!");
                System.out.println("Usuário: " + nome);
                break;
            }

            System.out.println("Digite uma nova senha.\n");
        }

        scanner.close();
    }
}