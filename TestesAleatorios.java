import java.util.Scanner;
public class TestesAleatorios{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x,y;

        x=0;
        System.out.println("Valor do x = "+ x++);
        System.out.println("Valor do x = "+ x);

        System.out.println("\n\n");
    
                y=0;
        System.out.println("Valor do y = "+ y++);
        System.out.println("Valor do y = "+ y);

        System.out.println("\n\n");

        for (int k = 0; k < 10 ; ++k){ //++k e k++ nao faz diferenca no for
            System.out.println("Valor do k = "+k);
        }

        System.out.println("\n\n");

        for (int k = 0; k < 10 ; ++k){ //++k e k++ nao faz diferenca no for
            if (k == 5){
                continue;
            }
            System.out.println("Valor do k = "+k);
        }

        System.out.println("\n\n");

        int k = 0;
        while (k<10){
            if (k == 5){
                continue;
            }
            System.out.println("Valor do k = "+k);
            k++;
        }
        //System.out.println("Fim do programa");
    }
}