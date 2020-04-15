import java.util.Scanner;
public class URI1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float salario = teclado.nextFloat();
        float reajuste = 0;
        float novo_salario = 0;
        float percentual = 0;
                        
        if (salario <= 400f){
            percentual = 15f;            
        }
        else{
            if (salario <= 800f){
                percentual = 12f;
            }
            else {
                if (salario <= 1200f){
                    percentual = 10f;
                }
                else{
                    if (salario <= 2000f){
                    percentual = 7f;
                    }
                    else{
                    percentual = 4f;
                    }
                }
            }
        }
        reajuste = salario * percentual / 100;
        novo_salario = salario + reajuste;
        System.out.printf("Novo salario: %.2f\n",novo_salario);
        System.out.printf("Reajuste ganho: %.2f\n",reajuste);
        System.out.printf("Em percentual: %.0f %%\n",percentual);
    }
}