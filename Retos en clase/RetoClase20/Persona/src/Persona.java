
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Persona {

    private long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;

    public Persona(long id, String nombre, String apellido, String direccion, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public Persona() {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void Crear() {

        Conexion conectado = new Conexion();

        try {
            conectado.conectar();
            String sql = "INSERT INTO personas (p_id,nombre,apellido,direccion,ciudad)" + "VALUES (?,?,?,?,?)";

            try {
                PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
                prepararSentencia.setLong(1, id);
                prepararSentencia.setString(2, nombre);
                prepararSentencia.setString(3, apellido);
                prepararSentencia.setString(4, direccion);
                prepararSentencia.setString(5, ciudad);
                prepararSentencia.executeUpdate();
                System.out.println("Empleado creado");

            } catch (SQLException ex) {
                Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (conectado != null) {
                conectado.cerrarConexion();
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Borrar(long id) throws ClassNotFoundException {

        Conexion conectado = new Conexion();
        conectado.conectar();

        String sql = "DELETE FROM personas WHERE p_id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setLong(1, id);
            prepararSentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }

        conectado.cerrarConexion();

    }

    public void Actualizar(long id, String nombre, String apellido, String direccion, String ciudad) throws ClassNotFoundException {

        Conexion conectado = new Conexion();

        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "UPDATE personas SET nombre = ?,apellido = ?, direccion = ?, ciudad = ?"
                + "WHERE p_id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setString(1, nombre);
            prepararSentencia.setString(2, apellido);
            prepararSentencia.setString(3, direccion);
            prepararSentencia.setString(4, ciudad);
            prepararSentencia.setLong(5, id);
            prepararSentencia.executeUpdate();
            System.out.println("Persona editado con exito!");

        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectado.cerrarConexion();
    }

    public static ArrayList<Persona> Leer() {
        ArrayList<Persona> listaPersonas = new ArrayList();
        try {
            Conexion conectado = new Conexion();
            try {
                Connection estaConectado = conectado.conectar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            }
            try (Statement statement = conectado.getConexion().createStatement()) {
                String query = "SELECT * FROM personas";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    Persona persona = new Persona();
                    persona.setId(rs.getLong("p_id"));
                    persona.setNombre(rs.getString("nombre"));
                    persona.setApellido(rs.getString("apellido"));
                    persona.setDireccion(rs.getString("direccion"));
                    persona.setCiudad(rs.getString("ciudad"));
                    listaPersonas.add(persona);
                }
            }
            try {
                conectado.cerrarConexion();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException e) {
            System.out.println("Error al leer los datos");
        }

        return listaPersonas;
    }
}
