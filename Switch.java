import java.util.Scanner;
public class Switch{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        
        switch(valor){
            case 0:
                System.out.println("Digitou o valor 0");
                break;
            case 1:
                System.out.println("Digitou o valor 1");
                break;
            case 2:
                System.out.println("Digitou o valor 2");
                break;
            default:
                System.out.println("Digitou outro valor");
        }
        System.out.println("Fim do programa!!!");
    }
}