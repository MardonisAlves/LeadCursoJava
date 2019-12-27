package IntroduçãoJava.aula07.forum;

public class SuperMan extends PersonagemPadrao {
    @Override
    public void movimentoPadrao() {
        System.out.println(this.getNome()+ " " +"andar , pula ,etc");;
    }

    @Override
    public String golpeespecial(String golpeEspecial) {
        return golpeEspecial;
    }
}
