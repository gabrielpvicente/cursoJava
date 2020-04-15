import java.util.Scanner;
public class TesteDoWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("I nao ta U - seu banco evriuer");
            System.out.println("1 - para saque");
            System.out.println("2 - para deposito");
            System.out.println("0 - para encerrar");
            opcao = teclado.nextInt();
        } while (opcao != 0);
        System.out.println("Fim do programa");
    }
}