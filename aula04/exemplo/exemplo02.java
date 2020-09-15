package exemplo;

import java.util.Scanner;

public class exemplo02 {
    public static void main(String[] args) {
        System.out.println("inicio exemplo01");
        linha();
        linha(20,'*');
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira o valor");
        int numero = entrada.nextInt();
        System.out.println(numero + "é par? " + ehPar(numero));
        entrada.close();


    }

    static void linha(int tamanho, char tipo){
        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        System.out.println();
    }

    static void linha(){
        linha(10,'@');
    }

    static boolean ehPar(int numero){
        return (numero % 2 == 0);
    }
}
