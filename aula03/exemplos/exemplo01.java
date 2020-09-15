package exemplos;

import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int numero = entrada.nextInt();

        if (numero >= 1) {
            System.out.print("1");
            int resultado = 2;
            while (resultado <= numero) {
                System.out.print(", " + resultado);
                resultado *= 2;
            }
        }

    
        entrada.close();
    }

}
