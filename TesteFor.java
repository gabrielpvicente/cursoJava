import java.util.Scanner;
public class TesteFor{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = 5;

        for ( int i=0 ; i<=10 ; i++ ){
            System.out.println(valor + " x "+i+" = "+ valor*i);
            
        }
        //System.out.println("Fim do programa");
    }
}