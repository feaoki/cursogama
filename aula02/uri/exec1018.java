package uri;

import java.util.Scanner;


/**
 * exec1018
 */
public class exec1018 {
    public static void main(String[] args) {
        
        int [] cedulas = {100,50,20,10,5,2,1};
        Scanner entrada = new Scanner(System.in);
        
        int valor = entrada.nextInt();
        
        int resultado = 0;
        int resto = valor;

        for (int i = 0; i < cedulas.length; i++) {
            resultado = resto / cedulas[i];
            resto = resto % cedulas[i];
            System.out.println(resultado +" nota(s) de R$ " + cedulas[i] + ",00");
        }

        entrada.close();
    }
}