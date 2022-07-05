
package mvc;

import interfaz.Ingresar;
import interfaz.Menu;
import java.util.ArrayList;

public class Global_2 {

    public static void main(String[] args) {
        ArrayList<SerCantor> cantores = new ArrayList();
        //<------------------- VER PERSISTENCIA
        Ingresar i = new Ingresar();
        var viewer = new Menu(cantores);
        viewer.setVisible(true);
        cantores = i.persistir();
    }  
}
