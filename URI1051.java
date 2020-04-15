import java.util.Scanner;
public class URI1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor = teclado.nextFloat();
        float imposto = 0;
                
        if (valor <= 2000f){
            System.out.printf("Isento\n");
        }
        else{
            if (valor <= 3000f){
                imposto = (valor - 2000) * 8 / 100;
                System.out.printf("R$ %.2f\n",imposto);
            }
            else {
                if (valor <= 4500f){
                    imposto = ((valor - 3000)*18/100) + (1000 * 8 / 100);
                    System.out.printf("R$ %.2f\n",imposto);
                }
                else{
                    imposto = ((valor - 4500)*28/100) + (1500 * 18 / 100) + (1000 * 8 / 100);
                    System.out.printf("R$ %.2f\n",imposto);
                }
            }
        }
    }
}