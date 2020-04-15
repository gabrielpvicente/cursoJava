/*URI1017*/

import java.util.Scanner;
public class URI1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float tempo, vel_med;
        float litros;

        /* Entrada */
        //System.out.println("Digite o tempo gasto de viagem e a velocidade media : ");
        tempo = teclado.nextFloat();
        vel_med = teclado.nextFloat();
        
        /* Processamento */
        litros = ((tempo*vel_med/12));

        /* Saida */
        System.out.printf("%.3f\n",litros);

    }


}
