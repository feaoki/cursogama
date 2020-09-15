package exemplopoo.exemplo01;

public class Pessoa {

    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void apresenta(){
        System.out.println("nome é: " + this.nome);
    }
    
}
