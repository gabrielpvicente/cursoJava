import java.util.Scanner;
public class URI1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n,m;

        n = teclado.nextInt();
        m = n*4;

        
        for ( int j=1; j<=m; j++){
            if (j % 4 == 0){
               System.out.println("PUM");
            }
            else{
                System.out.print(j + " "); 
            }              
        }             
        

    }
}