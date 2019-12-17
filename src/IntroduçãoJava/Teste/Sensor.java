package IntroduçãoJava.Teste;

import IntroduçãoJava.classes.Temperatura;

public class Sensor {
    public static void main(String[] args) {

        Temperatura temperatura = new Temperatura(1,"12.03.1987","22:30", (float) 67.9,23);
        temperatura.print();
       // temperatura.enviarDados();
        temperatura.enviardados2();
    }
}
