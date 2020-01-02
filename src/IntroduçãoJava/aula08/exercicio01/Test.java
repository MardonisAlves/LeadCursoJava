package IntroduçãoJava.aula08.exercicio01;

public class Test {
    public static void main(String[] args) {

        FuncionarioComissionado commissioned = new FuncionarioComissionado();
        commissioned.setSalario(1200);
        commissioned.setComissao(0.5);
        commissioned.setQtdpecas(100);
        commissioned.valorDoSalario(100);
    }
}
