import java.util.Scanner;
public class URI1177{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num,x;
        int vetor[];
        vetor = new int[1000];

        num = teclado.nextInt();
        x = 0;


        for (int pos=0 ; pos < vetor.length ; pos++){
            if (x == num){
                x = 0;
            }
            vetor[pos] = x;
            System.out.println("N["+pos+"] = "+x);
            x++;
            // x = (x + 1) % num <-- em vez de fazer o if
        }
    }
}