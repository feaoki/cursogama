package uri;

import java.util.Scanner;

public class exec1006 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt() * 2;
        int b = entrada.nextInt() * 3;
        int c = entrada.nextInt() * 5;
        float media =  (a + b + c) / 10;
        System.out.printf("MEDIA = %.1f\n", media);
        entrada.close();

    }
    
    
}
