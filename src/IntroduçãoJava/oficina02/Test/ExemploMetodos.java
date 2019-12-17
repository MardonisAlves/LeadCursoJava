package IntroduçãoJava.oficina02.Test;

import IntroduçãoJava.oficina02.classes.Somar;

public class ExemploMetodos {

    public static void main(String[] args) {

        Somar(5.6 , 7.4);
        Subtrair(5.6 , 7.4);
        Multi(6.6 , 7.4);
        Divisao(6.4  , 6.9);
    }

    public static void Somar(double valor1 , double valor2){
        double soma = valor1 + valor2;
        System.out.println("Somar:" + soma);
    }


    public static void Subtrair(double valor1 , double valor2){
        double sub = valor1 - valor2;
        System.out.println("Subtração:" + sub);
    }

    public static void Multi(double valor1 , double valor2){
        double multi = valor1 * valor2;
        System.out.println("Multiplicação:" + multi);
    }

    public static void Divisao(double valor1 , double valor2) {



        if (valor1 == 0 || valor2 == 0) {
            System.out.println("Não podemos dividri por zero");
        } else {
            double divisao = valor1 / valor2;
            System.out.println("Divisão:" + divisao);
        }
    }

}



