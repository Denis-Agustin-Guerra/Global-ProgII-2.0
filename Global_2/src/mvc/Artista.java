
package mvc;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class Artista extends SerCantor {
    public ArrayList <Instrumento> usa;

    public boolean hacerCantar(){
        cantar();
        return true;
    }
    
    public Artista(String nombre, Momento cuando, String tipo, Date fecha_de_nacimiento) {
        super(nombre, cuando, tipo, fecha_de_nacimiento);
    }
    
    public Artista(ArrayList<Instrumento> usa, String nombre, Momento cuando, String tipo, Date fecha_de_nacimiento) {
        super(nombre, cuando, tipo, fecha_de_nacimiento);
        this.usa = usa;
    }

    @Override
    public void cantar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    
    
    
    
}
