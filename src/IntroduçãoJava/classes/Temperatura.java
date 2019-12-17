package IntroduçãoJava.classes;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Temperatura {

    private int id;
    private String data;
    private String horas;
    private float tem;
    private int cod;

    public Temperatura(int id, String data, String horas, float tem, int cod) {
        this.id = id;
        this.data = data;
        this.horas = horas;
        this.tem = tem;
        this.cod = cod;
    }

    public Temperatura() {
    }

    public void print()
    {
        System.out.println("Id:" + this.getId());
        System.out.println("Data:" + this.getData());
        System.out.println("Horario:" + this.getHoras());
        System.out.println("Temperatura do sensor:" + this.getTem());
        System.out.println("Codigo de Acesso:" + this.getCod());
    }

    public void enviarDados()
    {
        Timer timer = new Timer();

        final long SEGUNDOS =(1000 * 60);

        TimerTask tesk = new TimerTask() {
            @Override
            public void run() {
                // run

                System.out.println("Enviar dados a cada uma segundo" + new Date());
            }
        };
        timer.scheduleAtFixedRate(tesk , 0, SEGUNDOS);

    }
    public void enviardados2(){

       for (int i =0; i <= 3600 ; i++){
           if(i ==3600){
               System.out.println("Enviar dados");
               i =0;
               continue;
           }


       }
        }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTem(float tem) {
        this.tem = tem;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public float getTem() {
        return tem;
    }

    public void setTem(short tem) {
        this.tem = tem;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(short cod) {
        this.cod = cod;
    }
}
