import java.util.Scanner;
public class URI1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int ddd;
        String cidade;

        //System.out.println("Digite o DDD da cidade: ");
        ddd = teclado.nextInt();
        
        switch(ddd){
            case 61:
                cidade = "Brasilia";
                break;
            case 71:
                cidade = "Salvador";
                break;
            case 11:
                cidade = "Sao Paulo";
                break;
            case 21:
                cidade = "Rio de Janeiro";
                break;
            case 32:
                cidade = "Juiz de Fora";
                break;
            case 19:
                cidade = "Campinas";
                break;
            case 27:
                cidade = "Vitoria";
                break;
            case 31:
                cidade = "Belo Horizonte";
                break;
            default:
                cidade = "DDD nao cadastrado" ;
        }
        System.out.println(cidade);
    }
}