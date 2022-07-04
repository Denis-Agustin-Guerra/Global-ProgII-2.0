
package mvc;

import java.util.Date;

public class Gallo extends SerCantor{

    public Gallo(String nombre, Momento cuando, String tipo, Date fecha_de_nacimiento) {
        super(nombre, cuando, tipo, fecha_de_nacimiento);
    }

    @Override
    public void cantar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
    
    
    
}
