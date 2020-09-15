import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("exercicio 1.2");
        System.out.println("Calculo média aritimética");
        double nota1 = 0;
        double nota2 = 0;
        System.out.println("Digite as médias:");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        System.out.println("resultado é =" + ((nota1 + nota2) / 2));

        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("Calculo reajuste salarial");
        double salario = 0;
        double reajuste = 0;
        System.out.println("Digite o salario");
        salario = entrada.nextDouble();
        reajuste = salario * 1.25;
        System.out.println("o salario com reajuste será =" + reajuste);

        entrada.close();
    }
}
