import java.util.Scanner;
public class URI1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int opcao,a,g,d;
        a = g = d = 0;
        
        do {
            opcao = teclado.nextInt();
            if (opcao == 1){
                a++;
            }
            if (opcao == 2){
                g++;
            }
            if (opcao == 3) {
                d++;
            }
        } while (opcao != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+a);
        System.out.println("Gasolina: "+g);
        System.out.println("Diesel: "+ d);
    }
}