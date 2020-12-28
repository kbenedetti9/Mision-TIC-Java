package mvc;

import controlador.Controlador;
import vista.RegistroEmpleadosFrame;

/**
 *
 * @author Karen Benedetti M
 */

public class MVC {

    public static void main(String[] args) throws ClassNotFoundException {
        RegistroEmpleadosFrame ref = new RegistroEmpleadosFrame();
        Controlador c = new Controlador(ref);
        c.iniciar();
        ref.setVisible(true);
    }

}
