package IntroduçãoJava.aula08.exercicio02;

public class Cachorro extends Animal {

    private String som;
    private String tipoRcao;

    public Cachorro() {
    }

    public Cachorro(String som, String tipoRcao) {
        this.som = som;
        this.tipoRcao = tipoRcao;
    }


    public Cachorro(String som) {
        this.som = som;
    }

    public String getSom() {
        return som;
    }

    public String getTipoRcao() {
        return tipoRcao;
    }


}
