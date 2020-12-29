package controlador;

import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import modelo.GestionarEmpleados;
import modelo.GestionarPagos;
import modelo.Pagos;
import vista.RegistroEmpleadosFrame;
import vista.CrearEmpleadoFrame;
import vista.ListadoPagosFrame;
import vista.ModificarEmpleadoFrame;
import vista.RegistrarPagoFrame;

/**
 *
 * @author Karen Benedetti M
 */

public class Controlador {

    private final RegistroEmpleadosFrame registroEmpleadosFrame;
    private static CrearEmpleadoFrame crearEmpleadoFrame;
    private static ModificarEmpleadoFrame modificarEmpleadoFrame;
    private static ListadoPagosFrame listadoPagosFrame;
    private static RegistrarPagoFrame registrarPagoFrame;

    public Controlador(RegistroEmpleadosFrame registroEmpleadosFrame) {
        this.registroEmpleadosFrame = registroEmpleadosFrame;
    }

    public void iniciar() {
        registroEmpleadosFrame.setTitle("Registro de Empleados");
        registroEmpleadosFrame.setLocationRelativeTo(null);
        listarEmpleadosFrame();
    }

    public void listarEmpleadosFrame() {
        DefaultTableModel modelo = new DefaultTableModel(GestionarEmpleados.columnas, 0);
        ArrayList<Object[]> empleados = GestionarEmpleados.ConsultarEmpleados();
        for (Object[] empleado : empleados) {
            modelo.addRow(empleado);
        }
        System.out.println("Modelo adicionado a las base de datos");
        registroEmpleadosFrame.setTable(modelo);
    }

    public void setCrearEmpleadoFrame(CrearEmpleadoFrame crearEmpleadoFrame) {
        this.crearEmpleadoFrame = crearEmpleadoFrame;
    }

    public void newCrearEmpleadoFrame() {
        this.crearEmpleadoFrame = new CrearEmpleadoFrame(this);
        crearEmpleadoFrame.setVisible(true);
    }

    public void newListadoPagoFrame() {
        this.listadoPagosFrame = new ListadoPagosFrame();
        listarPagosFrame();
        listadoPagosFrame.setVisible(true);
    }

    public void crearEmpleado() {
        Empleado e = new Empleado(crearEmpleadoFrame.getJTextField(1), crearEmpleadoFrame.getJTextField(2),
                crearEmpleadoFrame.getJTextField(3), crearEmpleadoFrame.getJTextField(4), crearEmpleadoFrame.getJCheckBox(1),
                crearEmpleadoFrame.getJTextField(5), crearEmpleadoFrame.getJTextField(6), crearEmpleadoFrame.getJCheckBox(2));
        e.crear();
        crearEmpleadoFrame.setVisible(false);
        listarEmpleadosFrame();
    }

    public void actualizarEmpleado() {
        Empleado.actualizar(modificarEmpleadoFrame.getId(), modificarEmpleadoFrame.getJTextField(1), modificarEmpleadoFrame.getJTextField(2),
                modificarEmpleadoFrame.getJTextField(3), modificarEmpleadoFrame.getJTextField(4), modificarEmpleadoFrame.getJCheckBox(1),
                modificarEmpleadoFrame.getJTextField(5), modificarEmpleadoFrame.getJTextField(6), modificarEmpleadoFrame.getJCheckBox(2));
        modificarEmpleadoFrame.setVisible(false);
        listarEmpleadosFrame();
    }

    public void leerEmpleadoRegistroEmpleadosFrame() {
        DefaultTableModel modelo = registroEmpleadosFrame.getTableModel();
        int fila = registroEmpleadosFrame.getValorJTable();
        if (fila == -1) {
            JOptionPane optionPane = new JOptionPane("Debe seleccionar un empleado", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        } else {
            System.out.println(modelo.getValueAt(fila, 0));
            long id = (long) modelo.getValueAt(fila, 0);

            Empleado e = Empleado.leerEmpleado(id);

            modificarEmpleadoFrame = new ModificarEmpleadoFrame(this, id);

            modificarEmpleadoFrame.setJTextField(1, e.getNombre());
            modificarEmpleadoFrame.setJTextField(2, e.getApellido());
            modificarEmpleadoFrame.setJTextField(3, e.getCorreo());
            modificarEmpleadoFrame.setJTextField(4, e.getCelular());
            modificarEmpleadoFrame.setJTextField(5, e.getSalario());
            modificarEmpleadoFrame.setJTextField(6, e.getCargo());

            modificarEmpleadoFrame.setJCheckBox(1, e.getEsProveedor());
            modificarEmpleadoFrame.setJCheckBox(2, e.getActivo());

            modificarEmpleadoFrame.setVisible(true);
        }
    }

    public void listarPagosFrame() {
        DefaultTableModel modelo = new DefaultTableModel(GestionarPagos.columnas, 0);
        ArrayList<Object[]> pagos = GestionarPagos.ConsultarPagos();
        for (Object[] pago : pagos) {
            modelo.addRow(pago);
        }
        listadoPagosFrame.setTable(modelo);
    }

    public void crearPago() {
        Empleado e = Empleado.leerEmpleado(registrarPagoFrame.getId());
        Pagos p = new Pagos(e, e.getSalario(), registrarPagoFrame.getJComboBox(1), Integer.parseInt(registrarPagoFrame.getJComboBox(2)));
        p.crear();
        registrarPagoFrame.setVisible(false);
    }

    public void leerEmpleadoParaPagosFrame() {
        DefaultTableModel modelo = registroEmpleadosFrame.getTableModel();
        int fila = registroEmpleadosFrame.getValorJTable();
        if (fila == -1) {
            JOptionPane optionPane = new JOptionPane("Debe seleccionar un empleado", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        } else {
            long id = (long) modelo.getValueAt(fila, 0);

            Empleado e = Empleado.leerEmpleado(id);

            registrarPagoFrame = new RegistrarPagoFrame(this, id);

            registrarPagoFrame.setJTextField(1, e.getNombre());
            registrarPagoFrame.setJTextField(2, e.getSalario());

            registrarPagoFrame.setVisible(true);
        }
    }
}
