package exemplos;

import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int par = 0;
        int impar = 0;
        int cont = 1;

        while (cont <= 10) {
            
            if (entrada.nextInt() % 2 == 0) {
                par++; 
            } else {
                impar++;
            }
            cont++;
        }

        System.out.println("total numeros pares: " + par);
        System.out.println("total numeros impares: " + impar);

        entrada.close();
    }
}
