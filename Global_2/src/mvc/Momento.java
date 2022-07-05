package mvc;

import interfaz.Ingresar;
import java.io.Serializable;
import java.util.Calendar;

public class Momento implements Serializable {

    public Ingresar i;
    public String tipo;
    private boolean alegria;

    public String horario() {

//        String momento="";
//        int hora = Integer.parseInt(i.h);
//        if(hora<12){
//            momento="Mañana";
//        }else if(hora>12 && hora<20){             //MOMENTO DEL DIA QUE CANTA <---------- ESTO ES NUESTRO
//            momento= "Tarde";
//        }else{
//            momento="Noche";
//        }    
//        return momento;
        String horaD;
        //Guardar el dia y la hora actual
        Calendar diaYHora = Calendar.getInstance();
        String hora = Integer.toString(diaYHora.get(Calendar.HOUR_OF_DAY)) + ":" + Integer.toString(diaYHora.get(Calendar.MINUTE)); //<----------  ESTO ES LO DE LA PAZ

        //Segun la hora del dia que sea, decir si es de mañana o de tarde
        if (diaYHora.get(Calendar.HOUR_OF_DAY) < 12) {
            horaD = "Mañana";
        } else {
            horaD = "Tarde";
        }

        return horaD;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Momento(boolean alegria) {
        this.tipo = horario();
        this.alegria = alegria;
    }

    public boolean getAlegria() {
        return alegria;
    }

    public void setAlegria(boolean alegria) {
        this.alegria = alegria;
    }

}
