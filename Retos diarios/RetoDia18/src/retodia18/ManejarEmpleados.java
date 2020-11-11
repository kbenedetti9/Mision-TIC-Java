
import java.util.ArrayList;

public class ManejarEmpleados {

    public static Empleado[] obtenerEmpleados() {

        Empleado[] listaEmpleados = new Empleado[5];
        Empleado empleado1 = new Empleado("nombre", "correo", "celular", 0);
        Empleado empleado2 = new Empleado("nombre", "correo", "celular", 0);
        Empleado empleado3 = new Empleado("nombre", "correo", "celular", 0);
        Empleado empleado4 = new Empleado("nombre", "correo", "celular", 0);
        Empleado empleado5 = new Empleado("nombre", "correo", "celular", 0);

        listaEmpleados[0] = empleado1;
        listaEmpleados[1] = empleado2;
        listaEmpleados[2] = empleado3;
        listaEmpleados[3] = empleado4;
        listaEmpleados[4] = empleado5;
        return listaEmpleados;
    }

}
