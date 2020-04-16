public class Time{
    // Atributos    
    private int hora, minuto, segundo;

    /* Metodo Construtor
    public Time(int h, int m, int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }*/

    // metodos
    public void setTime(int h, int m, int s) {
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }
    public void exibirHoraUniversal() {
        System.out.println(this.hora+":"+this.minuto+":"+this.segundo);
    }
    public void exibirHoraPadrao() {
        if (hora >= 1 && hora <= 12){
            System.out.println(this.hora+":"+this.minuto+":"+this.segundo+" AM");
        }
        else{
            hora = hora - 12;
            System.out.println(this.hora+":"+this.minuto+":"+this.segundo+" PM");
        }
    }    
}