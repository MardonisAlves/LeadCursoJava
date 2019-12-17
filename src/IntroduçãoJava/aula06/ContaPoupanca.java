package IntroduçãoJava.aula06;

public class ContaPoupanca implements  ContaInterface{

    private double saque;
    private double saldo = 1000;

    public ContaPoupanca(double saque) {
        this.saque = saque;
    }

    public double getSaque() {
        return saque;
    }

    @Override
    public void sacar() {
        double rrest = this.getSaque() - this.saldo;
        System.out.println("Seu saldo é =" + rrest);
    }
    @Override
   public  void depositar(){
        System.out.println("depositar");
   }


}
