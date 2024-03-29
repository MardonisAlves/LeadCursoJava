package IntroduçãoJava.aula07.dawncast;

import IntroduçãoJava.aula07.dawncast.classes.Cachorro;
import IntroduçãoJava.aula07.dawncast.classes.ClasseB;
import IntroduçãoJava.aula07.dawncast.classes.ClasseC;
import IntroduçãoJava.aula07.dawncast.classes.PastorAlemao;

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


        /***
         * CLasses A B C
         */

        ClasseC objetoc = new ClasseC();
        /***
         * a referencia da superclasse b esta apontando para o objeto da subclasse c
         * Chamamos isso de Downcast
         */
        ClasseB tipob = objetoc;
        tipob.A();
        tipob.t();
    }
}
