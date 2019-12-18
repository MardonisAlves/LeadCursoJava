package IntroduçãoJava.aula06.classesabstratatas;

public class Professor extends Pessoa implements Pessoal{
    private String turma;

    public Professor(String turma) {
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    @Override
    public void print() {
        System.out.println("Nome:" + getNome() + "  " + getTurma());
    }



}
