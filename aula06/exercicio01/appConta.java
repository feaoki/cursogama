package exercicio01;

import java.util.Scanner;

public class appConta {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcao;
        System.out.println("App Conta");

        exibirOpcoes();

        do {
            opcao = Integer.parseInt(teclado.nextLine());
        } while (opcao == 0);

    }

    public static void exibirOpcoes() {
        System.out.println("0 - Sair");
        System.out.println("1 - Criar Conta Normal");
        System.out.println("2 - Criar Conta Corrente");
        System.out.println("3 - Criar Conta Poupanca");
        System.out.println("4 - Criar Conta Especial");
        System.out.println("5 - Consultar Dados Conta");
        System.out.println("6 - Depositar");
        System.out.println("7 - Sacar");
        System.out.println("8 - Exibir opcoes novamente");
    }
    
}
