import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("Exercicio ");
        System.out.println("calcular area de um triangulo ");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base do triangulo: ");
        int base = entrada.nextInt();
        System.out.println("Digite a altura do triangulo: ");
        int altura = entrada.nextInt();

        System.out.println("a area do triangulo é:" ((base * altura) / 2);

        entrada.close();
    }
}
