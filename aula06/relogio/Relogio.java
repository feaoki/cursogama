package relogio;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public void relogio(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora(){
        return this.hora;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public int getSegundo(){
        return this.minuto;
    }

    private setHora(int hora){
        if (hora > 23 && hora < 0) {
            System.out.println("Hora recebida invalida");
        }
    }

    private setMinuto(int minuto){
        if (hora > 59 && hora < 0) {
            System.out.println("Hora recebida invalida");
        }
    }

    private setSegundo(int segundo){
        if (hora > 59 && hora < 0) {
            System.out.println("Hora recebida invalida");
        }
    }
