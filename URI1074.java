import java.util.Scanner;
public class URI1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n,num;
        n = teclado.nextInt();
        String even_odd,pos_neg;

        for ( int i=0 ; i < n ; i++ ){
            num = teclado.nextInt();
            if (num % 2 == 0){
                even_odd = "EVEN";
            }
            else {
                even_odd = "ODD";
            }

            if (num == 0){
                pos_neg = "NULL";                
            }
            else {
                if (num > 0){
                    pos_neg = "POSITIVE";
                }
                else{
                    pos_neg = "NEGATIVE";
                }
            }
            if (num == 0){
                System.out.println(pos_neg);
            }
            else{
                System.out.println(even_odd +" "+ pos_neg);
            } 
        }
    }
}