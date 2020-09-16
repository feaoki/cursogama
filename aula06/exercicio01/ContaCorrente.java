package exercicio01;

public class ContaCorrente extends Conta{
    final double TAXA_DEPOSITO = 0.1d;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public void depositar(double valor){
        super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public boolean sacar(souble valor){
        if (getSaldo() >= valor) {
            super.sacar(valor);
        } 
    }

}
