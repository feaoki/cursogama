package testeAula;

import java.util.Scanner;

public class exemplo08 {

    public static void main(String[] args) {
        
        System.out.println("exercicio 08");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira os lados de um triangulo");

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        if ((a > b + c) || (b > a + c) || (c > a + b)) {
            System.out.println("Os lados não formam um triangulo");
            
        } else if ((a == b) && (b == c)) {
            System.out.println("Equilatero");
            
        } else if ((a == b) || (b == c) || (c == a)) {
            System.out.println("Isoceles");
            
        } else System.out.println("Escaleno");

        entrada.close();

    };
}
