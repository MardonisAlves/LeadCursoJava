package IntroduçãoJava.Aula03.classes;

public class Clientes {

    private int id;
    private String nome;

    public Clientes(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Clientes(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listarcliente(){
        System.out.println("Id:" + getId() + "Nome:" + getNome());
    }

}
