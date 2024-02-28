import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Defina a senha
        String senhaCorreta = "senha123";
        int tentativasRestantes = 3;

        Scanner scanner = new Scanner(System.in);

        while (tentativasRestantes > 0) {
            // Solicite ao usuário que digite a senha
            System.out.print("Digite a senha: ");
            String senhaDigitada = scanner.nextLine();

            // Verifique se a senha fornecida está correta
            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Acesso autorizado! Bem-vindo!");
                // Se a senha estiver correta, saia do loop
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes == 0) {
                    System.out.println("Senha incorreta. Acesso bloqueado.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }
        
        // Feche o Scanner quando não for mais necessário
        scanner.close();
    }
}
