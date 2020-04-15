import java.util.Scanner;
public class URI1052{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int mesi;
        String mess = "Initialization";

        //System.out.println("Digite o numero do mes: ");
        mesi = teclado.nextInt();
        
        switch(mesi){
            case 1:
                mess = "January";
                break;
            case 2:
                mess = "February";
                break;
            case 3:
                mess = "March";
                break;
            case 4:
                mess = "April";
                break;
            case 5:
                mess = "May";
                break;
            case 6:
                mess = "June";
                break;
            case 7:
                mess = "July";;
                break;
            case 8:
                mess = "August";;
                break;
            case 9:
                mess = "September";;
                break;
            case 10:
                mess = "October";;
                break;
            case 11:
                mess = "November";;
                break;
            case 12:
                mess = "December";;
                break;
        }
        System.out.println(mess);
    }
}