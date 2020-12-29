package modelo;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karen Benedetti M
 */
public class Pagos {

    private int id;
    private Empleado empleado;
    private String valoPago;
    private String mes;
    private int ano;

    public Pagos(Empleado empleado, String valoPago, String mes, int ano) {
        this.empleado = empleado;
        this.valoPago = valoPago;
        this.mes = mes;
        this.ano = ano;
    }

    public Pagos(int id, Empleado empleado, String valoPago, String mes, int ano) {
        this.id = id;
        this.empleado = empleado;
        this.valoPago = valoPago;
        this.mes = mes;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getValoPago() {
        return valoPago;
    }

    public void setValoPago(String valoPago) {
        this.valoPago = valoPago;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void crear() {
        try {
            Conexion conexion = new Conexion("mydb.db");
            conexion.conectar();

            Statement stmt = conexion.getConexion().createStatement();
            stmt.execute("insert into pagos (id_empleado,valor_pago,mes,año) "
                    + "values ('" + this.empleado.getId() + "','" + this.valoPago + "','" + this.mes + "','" + this.ano
                    + "');");
            //ResultSet result = stmt.executeQuery("SELECT * FROM db_test.usuarios");
            stmt.close();
            conexion.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
