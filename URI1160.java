/*NÃO COMECEI*/
import java.util.Scanner;
public class URI1160{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x, y, qtd, a, soma;
        qtd = teclado.nextInt();
        a = soma = 0;
        
        while (a < qtd){
            x = teclado.nextInt();
            y = teclado.nextInt();
            if (x % 2 == 0){
                x++;
            }
            for (int i = 0; i < y; i++){
                soma = soma + x;
                x = x + 2;
                }
            a++;
            System.out.println(soma);
            soma = 0;
        }
    }
}