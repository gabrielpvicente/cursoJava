import java.util.Scanner;
public class NotasFacul{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float a, b, me;

        System.out.println("Digite a nota A: ");
        a = teclado.nextFloat();

        System.out.println("Digite a nota B: ");
        b = teclado.nextFloat();

        me = (a + b)/2;
        
        if (me >= 9f) {
            System.out.println("Conceito A");
        }
        else{
            if (me >= 8f){
                System.out.println("Conceito B");
            }
            else{
                if (me >= 7f ){
                    System.out.println("Conceito C");
                }
                else{
                    if (me >= 6f ){
                        System.out.println("Conceito D");
                    }
                    else{
                        System.out.println("Conceito F");
                    }
                }
            }
        }

        System.out.println("FIM DO PROGRAMA!");
    }
}