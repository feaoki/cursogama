package exemplo;

import java.util.Scanner;

public class exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 3 numeros: ");

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        System.out.println("O menor numero é: " + qualMenor(a, b, c));

        teclado.close();
        
    }

    static int qualMenor(int... numero){
        int menor = numero[0];
        for (int i = 1; i < numero.length; i++) {
            if (numero[i] < menor) {
                menor = numero[i]; 
            }
        }

        return menor;
    }
}
