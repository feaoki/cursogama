package testeAula;

import java.util.Scanner;

public class exemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira as o salario e o  valor da prestação:");
        float salario = entrada.nextFloat();
        float prestacao = entrada.nextFloat();
        float resultado = salario * 0.30f;

        if(prestacao > resultado) {
            System.out.println("aprovado. salario > " + resultado);
        } else {
            System.out.println("reprovado. salario = " + resultado);
        }

        entrada.close();
    }
}
