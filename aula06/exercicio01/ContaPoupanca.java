package exercicio01;

public class ContaPoupanca extends Conta{

    private static double taxa;

    public ContaPoupanca(int numero){
        super(numero);
    }

    protected static void setTaxa(double taxaNova){
        taxa = taxaNova;
    }

    protected static double getTaxa(){
        return  taxa;
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor + getTaxa()) {
            return super.sacar(valor + getTaxa());
        } else {
            return false;
        }
    }
    
    
}
