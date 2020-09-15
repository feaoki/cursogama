package uri;

import java.util.Scanner;

public class exec1010 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        entrada.nextInt();
        int qtd = entrada.nextInt();
        float valor = entrada.nextFloat();
        
        float custo = (qtd * valor);
        
        entrada.nextInt();
        qtd = entrada.nextInt();
        valor = entrada.nextFloat();
        
        custo += (qtd * valor);
        System.out.printf("TOTAL A PAGAR: R$ %.2f\n", custo);
        entrada.close();

    }
}
