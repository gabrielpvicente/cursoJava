import java.util.Scanner;
public class Ex20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int sexo;
        float altura, peso = 0;

        System.out.println("Digite o sexo da pessoa. 1 para homem e 2 para mulher: ");
        sexo = teclado.nextInt();
        System.out.println("Digite a altura da pessoa: ");
        altura = teclado.nextFloat();
        
        if ( sexo == 1){
            peso = ((72.7f * altura) - 58f);
        }
        else{
            if ( sexo == 2){
                peso = ((62.1f * altura) - 44.7f);
            }
        }
        System.out.printf("O peso ideal para o sexo %d de altura %.2f eh %.2f\n",sexo,altura,peso);
    }
}