package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class AppConta {

    private ArrayList <Conta> listaDeContas;

    public AppConta() {
        this.listaDeContas = new ArrayList<>(); 
    }

    public static void main(String[] args) {
        AppConta appConta =  new AppConta();
        appConta.executar();
    }


    public void executar(){
        Scanner teclado = new Scanner(System.in);
        
        int opcao;

        System.out.println("App Conta");

        do {
            exibirOpcoes();
            opcao = Integer.parseInt(teclado.nextLine());
            receberOpcao(opcao, teclado);
        } while (opcao == 0);

        teclado.close();
    }


    public void exibirOpcoes() {
        System.out.println("1-Nova Conta Corrente");
        System.out.println("2-Nova Conta Especial");
        System.out.println("3-Nova Conta Poupança");
        System.out.println("4-Fazer depósito");
        System.out.println("5-Fazer saque");
        System.out.println("6-Exibir as contas");
        System.out.println("7-Sair");
        System.out.print("-->");
    }


    public void receberOpcao(int opcao, Scanner teclado){
        
        ContaCorrente cc;
        ContaEspecial ce;
        ContaPoupanca cp;
        int numeroConta;
        double limite;

        switch (opcao) {
            case 1:
                System.out.println("Criando uma conta corrente.");
                System.out.println("Informe o número da conta:");
                numeroConta = teclado.nextInt();
                cc = new ContaCorrente(numeroConta);
                listaDeContas.add(cc);
                break;
            case 2:
                System.out.println("Criando uma conta especial.");
                System.out.println("Informe o número da conta:");
                numeroConta = teclado.nextInt();
                System.out.println("Informe o limite:");
                limite = teclado.nextDouble();
                ce = new ContaEspecial(numeroConta, limite);
                listaDeContas.add(ce);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                for(int i =0; i < listaDeContas.size(); i++){
                    System.out.println(listaDeContas.get(i).exibir());
                }
                break;
            case 7:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
    
}
