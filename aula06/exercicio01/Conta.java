package exercicio01;

public class Conta {
    
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    protected double getSaldo() {
        return this.saldo;
    }

    protected int getNumero() {
        return this.numero;
    }

    public String exibir() {
        return getNumero() + ": " + getSaldo();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public boolean sacar(double valor){
        if (valor > 0) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
}
