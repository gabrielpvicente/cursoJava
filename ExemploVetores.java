import java.util.Scanner;
public class ExemploVetores{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        //Declarar um vetor
        int valores[];
        
        //Definer o tamanho
        valores = new int[10];

        for (int pos=0 ; pos < 10 ; pos++){
            valores[pos] = (pos+1)*100;
        }

        for (int pos=0 ; pos < 10 ; pos++){
            System.out.println(valores[pos]);
        }
    }
}