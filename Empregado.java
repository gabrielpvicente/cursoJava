public class Empregado{
    // Atributos    
    private String nome;
    private double salario;

    // Metodo Construtor
    public Empregado(String name, double wage){
        // Logica - inicializar atributos
        nome = name;
        salario = wage;
    }

    // metodos
    public void imprimir() {
        System.out.printf("Esse eh o funcionario %s com salario de R$ %.2f \n\n",nome,salario);
    }

     public void aumentarSalario(double percentual) {
        salario = salario + salario * percentual;
        System.out.printf("O novo salario do funcionario %s sera de R$ %.2f \n\n",nome,salario);
    }
    
}