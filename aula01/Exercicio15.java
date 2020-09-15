import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args) {
        System.out.println(" Exercicio 5");
        double kmXmilhas     = .62137;
        double milhasXjardas = 1.760;
        double jardasXpes    = 3.0;
        double pesXpolegadas    = 12.0;    

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a medida em Km");
        double inputKm = entrada.nextDouble();
       
        System.out.println("o valor em reais km em milhas    é " + (inputKm * kmXmilhas));
        System.out.println("o valor em reais km em jardas    é " + ((inputKm * kmXmilhas) * milhasXjardas));
        System.out.println("o valor em reais km em pés       é " + (((inputKm * kmXmilhas) * milhasXjardas) * jardasXpes));
        System.out.println("o valor em reais km em polegadas é " + ((((inputKm * kmXmilhas) * milhasXjardas) * jardasXpes) * pesXpolegadas));
    
        entrada.close();
    }
}
