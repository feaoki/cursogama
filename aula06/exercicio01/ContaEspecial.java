package exercicio01;

public class ContaEspecial extends Conta {
    private double limite;


    public ContaEspecial(int numero) {
        super(numero);
    }

    protected double  getLimiteContaEspecial() {
        return this.limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (getLimiteContaEspecial() + getSaldo() >= valor) {
            return super.sacar(valor);
        } else {
            return false;
        }
    }


    
}
