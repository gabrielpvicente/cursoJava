import java.util.Scanner;
public class ComStrings{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        
        nome = "Isidro";

        char vetorLetras[];

        //converte a String para um vetor de caracteres
        vetorLetras = nome.toCharArray();
        
        //imprime uma posicao especifica desse vetor
        System.out.println(vetorLetras[4]);
        //imprime o tamanho da string
        System.out.println(nome.length());
        //imprime a posicao especifica da string sem converter para vetor
        System.out.println(nome.charAt(3));
    }
}