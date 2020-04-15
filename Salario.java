/* Você foi contratado para fazer o calculo do salario de um novo colaborador do time de DEVs
O calculo é estipulado da seguinte maneira:
Dado o salário, o imposto é 15%
Você deve informar o salario que foi digitado, o imposto que foi calculado e o salario liquido final

    Meu programa sabe quanto vale o salario do funcionário?
        Não - preciso informá-lo (Entrada de Dados)
    Sei como calcular o imposto?
        Sim - para isso vamos precisar do valor do salario e também armazenar esse imposto calculado
    Sei como calcular o salario liquido
        Sim - a partir do valor do salario original e do imposto calculado, conseguimos subtrair esse
        valor e ter o salario liquido

    Como fica então?
    Passo 1: Saber quanto vale o salario
    Passo 2: Calcular o imposto que é 15%
    Passo 3: Subtrair o valor do Passo 1 do valor Passo 2
    Passo 4: Exibir tudo na tela
*/

import java.util.Scanner;

public class Salario{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        float salario, imposto, sal_liq;
        
        /* entrada */
        System.out.print("Por favor, digite o salario: ");
        salario = teclado.nextFloat();

        /* processamento */
        imposto = salario * 15 / 100;
        sal_liq = salario - imposto;

        /* saída */
        System.out.printf("Salario Bruto   R$ %10.2f \n",salario);
        System.out.printf("Imposto         R$ %10.2f \n",imposto);
        System.out.printf("Salario Liquido R$ %10.2f \n",sal_liq);

        //System.out.println("Salario Bruto   R$ "+ salario);
        //System.out.println("Imposto         R$ "+ imposto);
        //System.out.println("Salario Líquido R$ "+ sal_liq);
    }


}



