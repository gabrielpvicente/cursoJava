import java.util.Scanner;
public class URI1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo, qtd;
        float preco=0;

        //System.out.println("Digite o codigo do produto e a quantidade: ");
        codigo = teclado.nextInt();
        qtd = teclado.nextInt();

        switch(codigo){
            case 1:
                preco = 4.00f;
                break;
            case 2:
                preco = 4.50f;
                break;
            case 3:
                preco = 5.00f;
                break;
            case 4:
                preco = 2.00f;
                break;
            case 5:
                preco = 1.50f;
                break;
        }
        preco = preco * qtd;
        System.out.printf("Total: R$ %.2f\n",preco);
    }
}