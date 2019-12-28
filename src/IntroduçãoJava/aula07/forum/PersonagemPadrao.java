package IntroduçãoJava.aula07.forum;

public abstract class PersonagemPadrao {
    private String golpeEspecial;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    abstract public void movimentoPadrao();

    abstract public String golpeespecial(String golpeEspecial);


}
