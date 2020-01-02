package IntroduçãoJava.aula08.exercicio01;

public class Funcionario {
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double valorDoSalario(){
        return getSalario();
    }

}
