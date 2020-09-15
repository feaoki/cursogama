package testeAula;

import java.util.Scanner;

public class exemplo06 {
    public static void main(String[] args) {
        System.out.println("Exercicio 06");
                
        Scanner entrada = new Scanner(System.in);

        if ("R10p5".equals(entrada.nextLine())) {
            System.out.println("acesso aprovado");
        } else {
            System.out.println("acesso negado");
        }

        entrada.close();

    }
    
}
