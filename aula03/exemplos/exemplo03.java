package exemplos;

import java.util.Scanner;

public class exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int numero = -1;
        int cont = 1;
        
        while (numero != 0) {
            System.out.println("Digite o " + (cont++) + "º numero");
            numero = entrada.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);

        entrada.close();
    }
    
}
