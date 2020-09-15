import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Exercicio 4");
        System.out.println("Digite o salario minimo");
        double salarioMinimo = entrada.nextDouble();
        System.out.println("Digite o valor do total de KW consumido");
        double kwTotal = entrada.nextDouble();
        System.out.println("o valor em reais do kw/h é " + (salarioMinimo / 500));
        System.out.println("o valor em reais a ser pago pela residencia é " + (kwTotal * (salarioMinimo / 500)));
        System.out.println("o valor em reais a ser pago pela residencia é com desconto de 10% é " + ((kwTotal * (salarioMinimo / 500)) * .9));
        entrada.close();

    }
}
