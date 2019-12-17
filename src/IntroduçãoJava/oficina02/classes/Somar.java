package IntroduçãoJava.oficina02.classes;

public class Somar {

    private float num1;
    private float num2;

    public Somar(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public void print(){
        double soma  = getNum1() + getNum2();
        System.out.println(soma);
    }
}
