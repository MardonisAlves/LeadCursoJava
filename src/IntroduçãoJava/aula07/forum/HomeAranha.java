package IntroduçãoJava.aula07.forum;

public class HomeAranha extends PersonagemPadrao {

    @Override
    public void movimentoPadrao() {
        System.out.println(this.getNome() + " " + "Andar , Pula  etc.");;
    }

    @Override
    public String golpeespecial(String golpeEspecial) {
    return golpeEspecial;
    }
}
