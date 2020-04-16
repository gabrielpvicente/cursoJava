/*NÃO COMECEI*/
import java.util.Scanner;
public class URI1160{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int t, x, pa, pb, somaa, somab;
        float g1, g2;

        x = teclado.nextInt();
        for (int i = 0 ; i < x ; i++){
            pa = teclado.nextInt();
            pb = teclado.nextInt();
            g1 = teclado.nextFloat();
            g2 = teclado.nextFloat();
            t=0;

            do {
                pa = (int) (pa + (pa * g1/100));
                pb = (int) (pb + (pb * g2/100));
                t++;
                if (t>100){
                    break;
                }
            } while (pa <= pb);
            if (t>100){
                System.out.println("Mais de 1 seculo.");
            }
            else{
                System.out.println(t+" anos.");
            }
        }
    }
}