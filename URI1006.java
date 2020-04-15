/*URI1006*/

import java.util.Scanner;
public class URI1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double a, b, c, media;

        /* Entrada */
        //System.out.println("Digite as 3 notas do aluno: ");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        /* Processamento */
        media = ((a * 2) + (b * 3) + (c * 5))/10;

        /* Saida */
        System.out.printf("MEDIA = %.1f\n",media);

    }


}
