package uri;

import java.util.Scanner;

public class exec1003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int soma =  A + B;
        System.out.printf("%d", soma);
        entrada.close();
    }
}
