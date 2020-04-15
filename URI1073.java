import java.util.Scanner;
public class URI1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n;
        n = teclado.nextInt();
        
        for ( int num=1 ; num<=n ; num++ ){
            if (num % 2 == 0){
                System.out.println(num+"^2"+num+" = "+ num*num);

            }            
        }
    }
}