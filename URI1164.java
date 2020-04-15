import java.util.Scanner;
public class URI1164{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num, soma, qtd, a;
        qtd = teclado.nextInt();
        soma = a = 0;
        
        while (a < qtd){
            soma = 0;
            num = teclado.nextInt();
            for (int i = num - 1; i > 0; i--){
                if (num % i == 0){
                    soma = soma + i;
                }
            }
            if (soma == num){
                System.out.println(num +" eh perfeito");
            }
            else{
                System.out.println(num +" nao eh perfeito");
            }
            a++;
        }
    }
}