package IntroduçãoJava.Aula03.classes;

public class Animal {
    private int id;
    private String nome;
    private String cor;
    private String raca;
    /***
     * Variavel de refencia do Objeto Cliente
     */
    private Clientes cliente;

    /***
     * Metodo Construtor da classe
     * @param id
     * @param nome
     * @param cor
     * @param raca
     */
    public Animal(int id, String nome, String cor, String raca) {
        this.id = id;
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;

    }

    /***
     * Metodos Getters e Setters  ou acessores
     * @return
     */
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    /***
     * com this.cliente.getNome acessamos o metodo que retorna o nome
     * da cliente existente na memoria.
     * Com isso podemos chamar este metodo para listar o nome do animal e dono
     */
    public void listaranimal() {
        System.out.println("Nome Cachorro :" + getNome() + "Nome dono : " + this.cliente.getNome());
    }

}
