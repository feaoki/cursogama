package testeAula;

import java.util.Scanner;

public class exemplo07 {
    public static void main(String[] args) {
        System.out.println(" exercio 07 ");

        Scanner entrada = new Scanner(System.in);

        System.out.println("insira o salario: ");
        float salario = entrada.nextFloat();

        if (salario > 50) { System.out.println("salario ok");
            
        }
        entrada.close();
        
    }
}
