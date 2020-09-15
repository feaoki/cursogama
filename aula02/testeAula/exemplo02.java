package testeAula;

import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira as 2 notas:");
        int nota1 = entrada.nextInt() * 4;
        int nota2 = entrada.nextInt() * 6;
        float resultado = (nota1 + nota2) / 10;

        if(resultado >= 6) {
            System.out.println("aprovado. resultado = " + resultado);
        } else {
            System.out.println("reprovado. resultado = " + resultado);
        }

        entrada.close();
    }
}
