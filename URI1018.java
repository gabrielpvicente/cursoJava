/*URI1018*/

import java.util.Scanner;
public class URI1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor, n100, n50, n20, n10, n5, n2, n1, resto;
        
        /* Entrada */
        //System.out.println("Digite um valor inteiro : ");
        valor = teclado.nextInt();
                
        /* Processamento */
        n100  = valor / 100;
        resto = valor % 100;
        n50   = resto / 50;
        resto = resto % 50;
        n20   = resto / 20;
        resto = resto % 20;
        n10   = resto / 10;
        resto = resto % 10;
        n5    = resto / 5;
        resto = resto % 5;
        n2    = resto / 2;
        resto = resto % 2;
        n1    = resto / 1;
        resto = resto % 1;
        
        /* Saida */
        System.out.printf("%d\n",valor);
        System.out.printf("%d nota(s) de R$ 100,00\n",n100);
        System.out.printf("%d nota(s) de R$ 50,00\n",n50);
        System.out.printf("%d nota(s) de R$ 20,00\n",n20);
        System.out.printf("%d nota(s) de R$ 10,00\n",n10);
        System.out.printf("%d nota(s) de R$ 5,00\n",n5);
        System.out.printf("%d nota(s) de R$ 2,00\n",n2);
        System.out.printf("%d nota(s) de R$ 1,00\n",n1);
        
    }


}
