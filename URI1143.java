import java.util.Scanner;
public class URI1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a, b, c, num;
        num = teclado.nextInt();
        a = 1;
        
        for (int i = 0; i < num; i++){
            b = a*a;
            c = a*a*a;
            System.out.println(a +" "+ b +" "+ c);
            a++;
        }
    }
}