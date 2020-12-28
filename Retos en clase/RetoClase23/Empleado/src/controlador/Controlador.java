package controlador;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Empleado;
import modelo.GestionarEmpleados;
import vista.RegistroEmpleadosFrame;

/**
 *
 * @author Karen Benedetti M
 */
public class Controlador {

    public RegistroEmpleadosFrame frame;

    public Controlador() {
    }

    public Controlador(RegistroEmpleadosFrame frame) {
        this.frame = frame;
    }

    public void iniciar() throws ClassNotFoundException {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados = GestionarEmpleados.consultarEmpleados();
        Empleado empleado = new Empleado();
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Proveedor");
        modeloTabla.addColumn("Salario");
        modeloTabla.addColumn("Cargo");
        modeloTabla.addColumn("Activo");

        for (Empleado empleadoRecorrido : listaEmpleados) {
            Object[] data = new Object[8];
            data[0] = empleadoRecorrido.getId();
            data[1] = empleadoRecorrido.getNombre();
            data[2] = empleadoRecorrido.getCorreo();
            data[3] = empleadoRecorrido.getCelular();
            data[4] = empleadoRecorrido.getEsProveedor();
            data[5] = empleadoRecorrido.getSalario();
            data[6] = empleadoRecorrido.getCargo();
            data[7] = empleadoRecorrido.getActivo();
            modeloTabla.addRow(data);
        }

        frame.setTable(modeloTabla);

    }

}
