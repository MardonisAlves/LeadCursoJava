package IntroduçãoJava.aula07.exercicio02;

import java.util.Scanner;

public class OperacaoConta {

    public static void depositar(Conta c , double valor){
        c.creditar(valor);


    }

    public static void main(String[] args) {
        int opc;
        double valor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual tipo de Conta Para Deposito?" + "1 - Conta Corrente , 2 - Conta Poupança");
        opc= entrada.nextInt();
        System.out.println("Qual valor de Deposito");
        valor = entrada.nextDouble();

        if(opc == 1 ){
            depositar(new ContaCorrente() ,valor);
        }else if(opc == 2 ){
            depositar(new ContaPoupança() ,valor);
        }
    }
}
