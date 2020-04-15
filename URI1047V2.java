import java.util.Scanner;
public class URI1047V2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hor_ini, hor_fim, min_ini, min_fim, hor_tot = 0;
        int min_tot = 0;      

        //System.out.println("Digite a hora e min de inicio e hora e min de fim: ");
        hor_ini = teclado.nextInt();
        min_ini = teclado.nextInt();
        hor_fim = teclado.nextInt();
        min_fim = teclado.nextInt();
        
        if ((hor_ini == hor_fim) && (min_ini < min_fim)) {
            hor_tot = 0;
            min_tot = min_fim - min_ini;
        }
        else{
            if ((hor_ini == hor_fim) && (min_ini > min_fim)){
                hor_tot = 23;
                min_tot = (60 - min_ini) + min_fim;
            }
            else{
                if ((hor_ini == hor_fim) && (min_ini == min_fim)){
                    hor_tot = 24;
                    min_tot = 0;
                }
            }
        }                          
        if ((hor_ini < hor_fim) && (min_ini < min_fim)){
                hor_tot = hor_fim - hor_ini;
                min_tot = min_fim - min_ini;
        }
        else{
            if ((hor_ini < hor_fim) && (min_ini > min_fim)){
                hor_tot = hor_fim - hor_ini -1;
                min_tot = (60 - min_ini) + min_fim;
            }
            else{                    
                if ((hor_ini < hor_fim) && (min_ini == min_fim)){
                    hor_tot = hor_fim - hor_ini;
                    min_tot = 0;
                }
            }
        }
        if ((hor_ini > hor_fim) && (min_ini < min_fim)){
            hor_tot = (24 - hor_ini) + hor_fim;
            min_tot = min_fim - min_ini;
        }
        else{
            if ((hor_ini > hor_fim) && (min_ini > min_fim)){
                hor_tot = (24 - hor_ini) + hor_fim;
                min_tot = (60 - min_ini) + min_fim;
                }
                else{                    
                     if ((hor_ini > hor_fim) && (min_ini == min_fim)){
                        hor_tot = (24 - hor_ini) + hor_fim;
                        min_tot = 0;
                    }
                }
            }
    
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",hor_tot,min_tot);

    }
}