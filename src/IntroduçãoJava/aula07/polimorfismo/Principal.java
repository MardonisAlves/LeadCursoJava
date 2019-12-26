package IntroduçãoJava.aula07.polimorfismo;

public class Principal {

    public static void print(Operacao operacao , double n1 , double n2){
        System.out.println("valor:" + operacao.calcular(n1 , n2));
    }

    public static void main(String[] args) {
        Principal.print(new Soma() , 23 ,34);
        Principal.print(new Dividir() , 100 , 3);
    }

}
