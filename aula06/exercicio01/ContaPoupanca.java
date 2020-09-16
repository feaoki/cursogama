package exercicio01;

public class ContaPoupanca extends Conta{

    // static pois a taxa servira para todas as contas
    private static double taxa;

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public static void alteraTaxa(double taxaNova) {
        taxa = taxaNova;
    }

    public static double getTaxa() {
        return taxa;
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() - (valor + getTaxa()) {
            return super.sacar(saldo)
        } else {
            return false;
        }
    }
    
}
