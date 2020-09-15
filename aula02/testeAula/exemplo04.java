package testeAula;

import java.util.Scanner;

public class exemplo04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira 2 numeros:");
        float num1 = entrada.nextFloat();
        float num2 = entrada.nextFloat();

        if (num1 > num2) {
            System.out.println("numeros = " + num1 +" "+ num2);
        } else if (num1 < num2) {
            System.out.println("numeros : " + num2 +" "+ num1);
        } else {
            System.out.println("os numseros são iguais " + num1 + " " + num2);
        }

        entrada.close();

    }

}
