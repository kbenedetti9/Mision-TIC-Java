package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karen Benedetti M
 */
public class GestionarEmpleados {

    static String id = "id";
    static String nombre = "nombre";
    static String apellido = "apellido";
    static String correo = "correo";
    static String celular = "celular";
    static String salario = "salario";
    static String proveedor = "esProveedor";
    static String cargo = "cargo";
    static String activo = "activo";
    

    public static ArrayList<Empleado> consultarEmpleados() {
        ArrayList<Empleado> listaEmpleados = new ArrayList();
        try {
            Conexion conectado = new Conexion();
            try {
                Connection estaConectado = conectado.conectar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
            }
            try (Statement statement = conectado.getConexion().createStatement()) {
                String query = "SELECT * FROM empleados";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    Empleado empleado = new Empleado();
                    empleado.setId(rs.getLong(id));
                    empleado.setNombre(rs.getString(nombre));
                    empleado.setApellido(rs.getString(apellido));
                    empleado.setCorreo(rs.getString(correo));
                    empleado.setCelular(rs.getString(celular));
                    empleado.setEsProveedor(rs.getBoolean(proveedor));
                    empleado.setSalario(rs.getString(salario));
                    empleado.setCargo(rs.getString(cargo));
                    empleado.setActivo(rs.getBoolean(activo));

                    listaEmpleados.add(empleado);
                }
            }
            try {
                conectado.cerrarConexion();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException e) {
            System.out.println("Error al leer los datos");
        }

        return listaEmpleados;
    }

}
