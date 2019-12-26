package IntroduçãoJava.aula07.exercicio.dawncast;

import IntroduçãoJava.aula07.exercicio.classes.Cachorro;
import IntroduçãoJava.aula07.exercicio.classes.PastorAlemao;

public class TestDawncat {

    public static void main(String[] args) {
        /***
         * A classe cachorro é pai da classe Pastoralemao
         * cachorro recebera um valor do tipo alemao
         */
        Cachorro cachorro = new PastorAlemao();

        /***
     *  O trecho abaixo é sempre permitido e sem restrições, já que o
     *  objeto instanciado pastoralemao é do tipo de uma subclasse  da
     *  classe do objeto Cachorro.

         */
        PastorAlemao alemao = (PastorAlemao) cachorro;
        alemao.nome();
    }
}
