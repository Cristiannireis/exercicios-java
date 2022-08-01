import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("Digite o seu nome ou s para sair:");
        nome = entrada.nextLine();
        while (!nome.equals("s")) {
            System.out.println("Bem-vindo \n" + nome);
            System.out.println("Digite seu nome ou s para sair:");
            nome = entrada.nextLine();
        }
        System.out.println("Fim da execução!");

    }
}
