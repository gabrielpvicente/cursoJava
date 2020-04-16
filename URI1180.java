import java.util.Scanner;
public class URI1180{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n,valor,posicao;
        int vetor[];

        n = teclado.nextInt();
        vetor = new int[n];

        for (int pos=0 ; pos < n; pos++){
            vetor[pos] = teclado.nextInt();
        }
        /*
        for (int pos=0 ; pos < n; pos++){
            System.out.println(vetor[pos]);
        }
        */
        valor = vetor[0];
        posicao = 0;

        for (int pos=1 ; pos < n; pos++){
            if(vetor[pos] < valor){
                valor = vetor[pos];
                posicao = pos;
            }
        }
        System.out.println("Menor valor: "+valor);
        System.out.println("Posicao: "+posicao);
    }
}