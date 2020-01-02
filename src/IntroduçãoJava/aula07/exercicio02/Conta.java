package IntroduçãoJava.aula07.exercicio02;

public class Conta {
    private double saldo;
    public void creditar(double valor){
        saldo = saldo + valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
