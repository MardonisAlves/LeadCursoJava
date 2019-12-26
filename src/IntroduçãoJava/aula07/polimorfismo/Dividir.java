package IntroduçãoJava.aula07.polimorfismo;

public class Dividir extends Operacao {
    @Override
    public double calcular(double n1, double n2) {
        return n1 / n2;
    }
}
