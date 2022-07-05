
package mvc;

import java.io.Serializable;

public class Instrumento implements Serializable {
    public String nombre;
    public String tipo;

    public Instrumento() {
    }

    
    
    public Instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public boolean ejecuta(){ //<-------------------MIRAR LUEGO 
        if("guitarra".equals(nombre)){
            return true;
        }else if("piano".equals(nombre)){
            return false;
        }
        return true;
    }
    
    
    
}
