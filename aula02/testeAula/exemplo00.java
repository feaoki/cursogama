package testeAula;

import java.util.Scanner;

public class exemplo00 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        if(entrada.nextInt() > 6) {
            System.out.println("aprovado ");
        } else {
            System.out.println("reprovado");
        }

        entrada.close();
    }
}
