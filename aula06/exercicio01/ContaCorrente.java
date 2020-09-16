package exercicio01;

public class ContaCorrente extends Conta{
    static final double TAXA_DEPOSITO = 0.1d;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public void depositar(double valor){
        super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public boolean sacar(double valor){
        if (getSaldo() >= valor) {
            return super.sacar(valor);
        } else {
            return false;
        }
    }

}
