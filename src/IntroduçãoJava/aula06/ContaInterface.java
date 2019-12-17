package IntroduçãoJava.aula06;

public interface ContaInterface {

    public void sacar();

    default void depositar() {

    }
}
