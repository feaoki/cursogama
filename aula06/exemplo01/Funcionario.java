package exemplo01;

public class Funcionario {
    private String nome; 
    private double salario; 

    public Funcionario(String nome, double salario){
            this.nome = nome;
            this.salario = salario;
    }

    public String imprimir(){
        return "nome: " + nome + ", salario: " + salario;
    }

    protected double getSalario(){
        return this.salario;
    }

    protected void setSalario(double salario) {
        if (salario > 0)  {
            this.salario = salario;
        }
    }

    public void aumentarSalario(double percentual) {
        this.salario += (this.salario * percentual);
    }


}
