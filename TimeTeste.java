import java.util.Scanner;
public class TimeTeste{
    public static void main(String args[]){

        Time t = new Time();
        int h, m, s;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        h = teclado.nextInt();

        System.out.println("Digite os minutos: ");
        m = teclado.nextInt();

        System.out.println("Digite os segundos: ");
        s = teclado.nextInt();


        t.setTime(h, m, s);
        t.exibirHoraUniversal();
        t.exibirHoraPadrao();


    }
    
}