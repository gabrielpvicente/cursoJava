import java.util.Scanner;
public class Ex21{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite a idade: ");
        idade = teclado.nextInt();
                
        if ((idade >= 18) && (idade <= 65)){
            System.out.printf("Obrigatorios entre 18 e 65 anos.\n");
        }
        else{
            if (idade < 16){
                System.out.printf("Nao eleitores menores de 16 anos de idade.\n");
            }
            else {
                System.out.printf("Facultativos entre 16 e 18 e maiores de 65 anos.\n");
            }
        }
    }
}