import java.util.Scanner;
public class URI1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int senha, match;
        senha = 2002;
        
        do {
            match = teclado.nextInt();
            if (match != senha) {
                System.out.println("Senha Invalida");
            }            
        } while (match != senha);
        System.out.println("Acesso Permitido");
    }
}