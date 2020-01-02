package IntroduçãoJava.aula07.exercicio02;

public class ContaCorrente  extends Conta {


    public void creditar(double valor) {
        setSaldo(getSaldo() + valor - valor * 0.5);
    }
}