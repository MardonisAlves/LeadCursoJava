package IntroduçãoJava.Aula03.classes;



public class Principal {
    public static void main(String[] args) {


        Aluno alunoLead = new Aluno("Mardonis Alves B." , 2322,8.9 , 9.4);
        System.out.println(alunoLead.nome);
        System.out.println(alunoLead.codigo);
        System.out.println(alunoLead.nota1);
        System.out.println(alunoLead.nota2);

        Newaluno newaluno = new Newaluno();
        newaluno.setNome("Mardonis Alves B");
        newaluno.setCodigo(3433);
        newaluno.setNota1(8.9);
        newaluno.setNota2(7.0);
        System.out.println("Seu nome é :" + newaluno.getNome());
        System.out.println("Sua codigo é :" + newaluno.getCodigo());
        System.out.println(" nota1 é :" + newaluno.getNota1());
        System.out.println(" nota2 é :" + newaluno.getNota2());
        System.out.println("Sua media é :" + newaluno.calmedia());

    }
}
