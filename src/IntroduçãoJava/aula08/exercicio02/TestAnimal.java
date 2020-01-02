package IntroduçãoJava.aula08.exercicio02;

public class TestAnimal {
    public static void main(String[] args) {
        /***
         * chamada do construtor  do java com apenas  parametros
         */
        Cachorro cachorro1 = new Cachorro("Huuuuu");
        cachorro1.setRaça("Sem Raça");
        cachorro1.setNome("Ralf");
        System.out.println("Cachorro 1");
        System.out.println(cachorro1.getNome() + " " + cachorro1.getSom());



        /***
         * Um outro objeto com outros parametros
         */
        Cachorro cachorro2 = new Cachorro("Uauau" , "Bonzo carne");
        cachorro2.setNome("Ralf");
        cachorro2.setRaça("Pitbull");
        System.out.println("Cachorro 2");
        System.out.println(cachorro2.getNome() +  " " + cachorro2.getSom());

    }
}
