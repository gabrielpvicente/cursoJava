/*
    DDMMAAAA

    ano??
    13042020 / 10000
        2020    1304
         +----------------> ano

    1304 / 100
      04 /  13  ----------> dia
       +------------------> mês
*/

import java.util.Scanner;
public class CapturaData{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, ano, mes, dia, resto;
        System.out.print("Digite um data no formato DDMMAAAA: ");
        numero = teclado.nextInt();

        ano = numero % 10000;
        resto = numero / 10000;

        dia = resto / 100;
        mes = resto % 100;

        System.out.println("Dia: "+ dia);
        System.out.println("Mes: "+ mes);
        System.out.println("Ano: "+ ano);

    }
    
}