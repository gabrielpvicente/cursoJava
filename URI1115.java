import java.util.Scanner;
public class URI1115{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x=1,y=1;
        String saida;


        while ((x != 0) && (y != 0)) {
            x = teclado.nextInt();
            y = teclado.nextInt();
            if ((x != 0) && (y != 0)){
                if (x > 0){
                    if (y > 0){
                        saida = "primeiro";
                    }
                    else{
                        saida = "quarto";
                    }
                }
                else{
                    if (y > 0){
                        saida = "segundo";
                    }
                    else{
                        saida = "terceiro";
                    }
                }
                System.out.println(saida);
            }
        }
    }
}