package testeAula;

import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if(numero > 20) {
            System.out.println("numero maior que 20. resultado " + ((float)numero / 2) );
        } else {
            System.out.println("menor igual a 20");
        }

        entrada.close();

    }
    
}
