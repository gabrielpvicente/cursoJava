import java.util.Scanner;
public class ExemploIf{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float n1, n2, me;

        System.out.println("Digite a nota 1: ");
        n1 = teclado.nextFloat();
        System.out.println("Digite a nota 2: ");
        n2 = teclado.nextFloat();
        me = (n1+n2)/2;
        System.out.println("Sua media = "+me);

        if ( me >= 6.0f){
            System.out.println("APROVADO!");
        }
        else{
            System.out.println("REPROVADO!");
        }

        System.out.println("FIM DO PROGRAMA!");
    }
}