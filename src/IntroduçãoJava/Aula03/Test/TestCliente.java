package IntroduçãoJava.Aula03.Test;

import IntroduçãoJava.Aula03.classes.Animal;
import IntroduçãoJava.Aula03.classes.Clientes;

public class TestCliente {

    public static void main(String[] args) {
        /***
         * 1 Precisamos instanciar as duas classe Cliente e Animal
         * 2 Devemos passar a variavel de refencia por parametro para a classe animal
         */

        Clientes clientes = new Clientes(321, "Mardonis Alves B");
        Animal animal = new Animal(12,"Ralf" , "Preto", "Sem Raça");
        /***
         * clientes e a nossa referencia da classe Clientes
         */
        animal.setCliente(clientes);
        animal.listaranimal();
    }
}
