package IntroduçãoJava.aula07.forum;

public class Jogo {

    public static void print(PersonagemPadrao personagempadrao , String golpeEspecial){
        System.out.println("Golpe Especial"  + personagempadrao.golpeespecial(golpeEspecial));


    }

    public static void main(String[] args) {

        HomeAranha aranha = new HomeAranha();
        aranha.setNome("Spyder Man");
        aranha.movimentoPadrao();
        SuperMan superMan = new SuperMan();
        superMan.setNome("Super Man");
        superMan.movimentoPadrao();



        /***
         * Veja que usamos um metodo para a mesma finalidade de mostrar o poder especial
         * do personagem
         */
        Jogo.print(aranha , "Soltar Casa de Aranha");
        Jogo.print(superMan , "Soltar Raios Infravermelho e Voa");

    }
}
