package IntroduçãoJava.aula07.exercicio03;

public class Tipo {

    public Tipo(){
        Animal a = new Animal();
        boolean t = a instanceof Animal;

        System.out.println(t);
    }

}
