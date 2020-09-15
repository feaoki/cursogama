package uri;

import java.util.Scanner;

public class exec1043 {
    public static void main(String[] args) {
        int [] intervalo = {0,400,800,1200,2000,};

        Scanner entrada = new Scanner(System.in);

        float valor = entrada.nextFloat();
        
        if ((valor < intervalo[0]) || (valor > intervalo[ intervalo.length  ])) {
            System.out.println("Fora de intervalo");
        }

        for (int i = 0; i < intervalo.length - 1; i++) {
           if (valor > intervalo[i] && valor < intervalo[i+1]) {
               System.out.println("Intervalo [" + intervalo[i] + "," + intervalo[i+1] + "]");
               break;
           }
        }

        entrada.close();
    }
}
