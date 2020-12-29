package modelo;

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
public class GestionarPagos {
    
    public final static String[] columnas = {"Id", "Empleado", "Valor", "Mes", "Año"};

    public static ArrayList<Object[]> ConsultarPagos() {

        ArrayList<Object[]> pagos = new ArrayList();

        try {
            Conexion conexion = new Conexion("mydb.db");
            conexion.conectar();

            Statement stmt = conexion.getConexion().createStatement();
            ResultSet result = stmt.executeQuery("select * from pagos");
            while (result.next()) {
                long id = result.getInt("id");
                long idEmpleado = result.getLong("id_empleado");
                String valorPago = result.getString("valor_pago");
                String mes = result.getString("mes");
                String ano = result.getString("año");
                Empleado empleado = Empleado.leerEmpleado(idEmpleado);
                Object[] pago = {id, empleado, valorPago, mes, ano};
                pagos.add(pago);
            }
            result.close();

            conexion.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Pagos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pagos;
    }
}
