package exemplo;

public class Pessoa {

    private String nome;
    private int idade;
    
    public String getNome(){
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public boolean setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
            return true;
            
        } else {
            return false;
        }
    }

    public void setNome(String nome) {
        String aux = nome.toUpperCase();
        if (aux != null && aux.length() > 0) {
            for (int i = 0; i < aux.length; i++) {
                aux.charAt(i) < 'A' || aux.charAt(i) > 'z') {
                    return;
                }              
            }
            this.nome = nome;
            
        }
        return;
        
    }


}