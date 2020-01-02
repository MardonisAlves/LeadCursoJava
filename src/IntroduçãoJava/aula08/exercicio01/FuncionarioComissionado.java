package IntroduçãoJava.aula08.exercicio01;

public class FuncionarioComissionado extends Funcionario {
    private double comissao;
    public int qtdpecas;

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setQtdpecas(int qtdpecas) {
        this.qtdpecas = qtdpecas;
    }

    public double valorDoSalario(double gratificacao){

        double total = super.valorDoSalario() + getComissao() * getQtdpecas() + gratificacao;
        System.out.println(total);
        return total;
    }

    public double getComissao() {
        return comissao;
    }

    public int getQtdpecas() {
        return qtdpecas;
    }
}
