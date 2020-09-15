import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("o nome digitado foi:" + nome);
        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();
        System.out.println("A idade digitado foi:" + idade);
        System.out.println(nome + " tem " + idade + " anos.");
        entrada.close();
    }
    
}
