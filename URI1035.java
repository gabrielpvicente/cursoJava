import java.util.Scanner;
public class URI1035{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d;

        //System.out.println("Digite A: ");
        a = teclado.nextInt();
        //System.out.println("Digite B: ");
        b = teclado.nextInt();
        //System.out.println("Digite C: ");
        c = teclado.nextInt();
        //System.out.println("Digite D: ");
        d = teclado.nextInt();
        
        if ((b > c) && (d > a) && ((c + d) > (a + b)) && (c > 0) && (d > 0) && (a % 2 == 0)) {
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }

        //System.out.println("FIM DO PROGRAMA!");
    }
}