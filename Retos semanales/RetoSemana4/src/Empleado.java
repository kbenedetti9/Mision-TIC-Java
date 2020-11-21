package reto_semana4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karen Benedetti M
 */
public class Empleado {

    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
    private boolean esProveedor;
    private String salario;
    private String cargo;

    public Empleado() {
    }

    public Empleado(String nombre, String correo, String celular, String salario) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.salario = salario;
    }

    public Empleado(String nombre, String apellido, String correo, String celular, boolean esProveedor, String salario, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.esProveedor = esProveedor;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Empleado(long id, String nombre, String apellido, String correo, String celular, boolean esProveedor, String salario, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.esProveedor = esProveedor;
        this.salario = salario;
        this.cargo = cargo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isEsProveedor() {
        return esProveedor;
    }

    public void setEsProveedor(boolean esProveedor) {
        this.esProveedor = esProveedor;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void Crear() {

        Conexion conectado = new Conexion();
        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "INSERT INTO empleados (nombre,apellido,correo,celular,esProveedor,salario,cargo)" + "VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setString(1, nombre);
            prepararSentencia.setString(2, apellido);
            prepararSentencia.setString(3, correo);
            prepararSentencia.setString(4, celular);
            prepararSentencia.setBoolean(5, esProveedor);
            prepararSentencia.setString(6, salario);
            prepararSentencia.setString(7, cargo);
            prepararSentencia.executeUpdate();
            System.out.println("Empleado creado");

        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<Empleado> Leer() throws ClassNotFoundException {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        Conexion conectado = new Conexion();
        Connection estaConectado = conectado.conectar();

        String sql = "SELECT * FROM empleados";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            ResultSet rs;
            //Ejecuata la sentencia y retorna los datos
            rs = prepararSentencia.executeQuery();
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId(rs.getLong("id"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setCorreo(rs.getString("correo"));
                empleado.setCelular(rs.getString("celular"));
                empleado.setEsProveedor(rs.getBoolean("esProveedor"));
                empleado.setSalario(rs.getString("salario"));
                empleado.setCargo(rs.getString("cargo"));
                listaEmpleados.add(empleado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        conectado.cerrarConexion();
        return listaEmpleados;
    }

    public void Actualizar(Empleado empleado) throws ClassNotFoundException {

        Conexion conectado = new Conexion();

        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "UPDATE empleados SET nombre = ?, apellido = ?, correo = ?, celular = ?, esProveedor = ?,"
                + "salario = ?, cargo = ?" + "WHERE id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setString(1, empleado.getNombre());
            prepararSentencia.setString(2, empleado.getApellido());
            prepararSentencia.setString(3, empleado.getCorreo());
            prepararSentencia.setString(4, empleado.getCelular());
            prepararSentencia.setBoolean(5, empleado.isEsProveedor());
            prepararSentencia.setString(6, empleado.getSalario());
            prepararSentencia.setString(7, empleado.getCargo());
            prepararSentencia.setLong(8, empleado.getId());
            prepararSentencia.executeUpdate();
            System.out.println("Empleado editado con exito!");

        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectado.cerrarConexion();
    }

    public void Eliminar(long id) throws ClassNotFoundException {

        Conexion conectado = new Conexion();
        conectado.conectar();

        String sql = "DELETE FROM empleados WHERE id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setLong(1, id);
            prepararSentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        conectado.cerrarConexion();

    }

}
