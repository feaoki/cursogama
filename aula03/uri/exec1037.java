package uri;

import java.util.Scanner;

public class exec1037 {
    public static void main(String[] args) {

        int [] intervalo = {0,25,50,75,100};

        Scanner entrada = new Scanner(System.in);

        double valor = entrada.nextDouble();
        
        if ((valor <= 0) || (valor > 100)) {
            System.out.println("Fora de intervalo");
        } else {
            for (int i = 0; i < intervalo.length - 1; i++) {
                if (valor > intervalo[i] && valor <= intervalo[i+1]) {
                    System.out.println("Intervalo [" + intervalo[i] + "," + intervalo[i+1] + "]");
                    break;
                }
            }
        
        }

        entrada.close();
    }
}
