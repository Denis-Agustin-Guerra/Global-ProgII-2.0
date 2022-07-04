
package mvc;

import static interfaz.Ingresar.toCalendar;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public abstract class SerCantor implements PuedeCantar, Serializable{
    public final String nombre;
    public String tipo;
    public final Date fecha_de_nacimiento;
    public final Momento cuando;
    
    @Override
    public abstract void cantar();
    public void hacerCantar(SerCantor cantante){
        
    }

    public SerCantor(String nombre, Momento cuando, String tipo, Date fecha_de_nacimiento) {
        this.nombre = nombre;
        this.cuando = cuando;
        this.tipo = tipo;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }
    
    public String calcularEdad(){
        String edad;
        int años;
        
        //Guarda el dia actual
        Calendar hoy = Calendar.getInstance();
        //Toma la fecha de nacimiento del cantor y la pasa a Calendar
        Calendar fechaCumCalen = toCalendar(this.fecha_de_nacimiento);
        
        //Hace la cuenta para saber la cantidad de años que tiene
        años = hoy.get(Calendar.YEAR) - fechaCumCalen.get(Calendar.YEAR);
        
        //Si aun no ha pasado el dia en el que cumple, le saca un año
        if(fechaCumCalen.get(Calendar.MONTH)+1<hoy.get(Calendar.MONTH) || (fechaCumCalen.get(Calendar.MONTH)+1== hoy.get(Calendar.MONTH) && fechaCumCalen.get(Calendar.DAY_OF_MONTH)< hoy.get(Calendar.DAY_OF_MONTH))){
             años = años - 1;
        }
        edad = años +" años.";
        return edad;
    }
    
}
