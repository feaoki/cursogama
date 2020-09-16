package relogio;

public class Relogio {

    public static final String HORA_INVALIDA = "Hora recebida invalida";
    public static final String MIN_INVALIDA = "Minuto recebida invalida";
    public static final String SEG_INVALIDA = "Segundo recebida invalida";
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
        return this.segundo;
    }

    private void setHora(int hora){
        if (hora > 23 && hora < 0) {
            System.out.println(HORA_INVALIDA);
        }
    }

    private void setMinuto(int minuto){
        if (hora > 59 && hora < 0) {
            System.out.println(MIN_INVALIDA);
        }
    }

    private void setSegundo(int segundo){
        if (hora > 59 && hora < 0) {
            System.out.println(SEG_INVALIDA);
        }
    }

}
