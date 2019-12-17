package IntroduçãoJava.aula06;

public class ContaCorrente implements ContaInterface {

    private double saque;
    private  double saldo = 100;

    public ContaCorrente(double saque) {
        this.saque = saque;
    }


    @Override
    public void sacar() {
         double rest = getSaque() - this.saldo;
        System.out.println("Seu Saldo" + rest);
    }

    public double getSaque() {
        return saque;
    }
}
