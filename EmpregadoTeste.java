public class EmpregadoTeste{
    public static void main(String args[]){

        Empregado e1;
        e1 = new Empregado("Isidro da Silva Pereira", 30000.00);
        Empregado e2;
        e2 = new Empregado("Gabriel de Paula Vicente", 1000.00);

        e1.imprimir();
        e1.aumentarSalario(0.1);

        e2.imprimir();
        e2.aumentarSalario(0.2);
        e2.imprimir();
        e2.aumentarSalario(0.5);
    }

}