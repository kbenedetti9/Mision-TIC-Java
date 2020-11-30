import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class Profesor {

    private int id;
    private String nombre;
    private String correo;
    private int edad;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Profesor() {
    }

    public Profesor(int id, String nombre, String correo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    public Profesor(String nombre, String correo, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void crear() {

        Conexion conectado = new Conexion();
        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "INSERT INTO profesores (nombre,correo,edad)" + "VALUES (?,?,?)";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setString(1, nombre);
            prepararSentencia.setString(2, correo);
            prepararSentencia.setInt(3, edad);
            prepararSentencia.executeUpdate();
            System.out.println("Profesor creado");

        } catch (SQLException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public static ArrayList<Profesor> leer() throws ClassNotFoundException {
//        ArrayList<Profesor> listaProfesores = new ArrayList<>();
//        Conexion conectado = new Conexion();
//        Connection estaConectado = conectado.conectar();
//
//        String sql = "SELECT * FROM profesores";
//
//        try {
//            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
//            ResultSet rs;
//            //Ejecuata la sentencia y retorna los datos
//            rs = prepararSentencia.executeQuery();
//            while (rs.next()) {
//                Profesor profesor = new Profesor();
//                profesor.setId(rs.getInt("id"));
//                profesor.setNombre(rs.getString("nombre"));
//                profesor.setCorreo(rs.getString("correo"));
//                profesor.setEdad(rs.getInt("edad"));
//                listaProfesores.add(profesor);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        conectado.cerrarConexion();
//        return listaProfesores;
//    }
    public static ArrayList<Profesor> leer() {
        ArrayList<Profesor> listaProfesores = new ArrayList();
        try {
            Conexion conectado = new Conexion();
            try {
                Connection estaConectado = conectado.conectar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
            }
            try (Statement statement = conectado.getConexion().createStatement()) {
                String query = "SELECT * FROM profesores";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    Profesor profesor = new Profesor();
                    profesor.setId(rs.getInt("id"));
                    profesor.setNombre(rs.getString("nombre"));
                    profesor.setCorreo(rs.getString("correo"));
                    profesor.setEdad(rs.getInt("edad"));
                    listaProfesores.add(profesor);
                }
            }
            try {
                conectado.cerrarConexion();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException e) {
            System.out.println("Error al leer los datos");
        }

        return listaProfesores;
    }

    public void actualizar(Profesor profesor) throws ClassNotFoundException {

        Conexion conectado = new Conexion();

        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "UPDATE profesores SET nombre = ?,correo = ?, edad = ?,"
                + "WHERE id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setString(1, profesor.getNombre());
            prepararSentencia.setString(2, profesor.getCorreo());
            prepararSentencia.setInt(3, profesor.getEdad());
            prepararSentencia.executeUpdate();
            System.out.println("Profesor editado con exito!");

        } catch (SQLException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectado.cerrarConexion();
    }

    public void eliminar(int id) throws ClassNotFoundException {

        Conexion conectado = new Conexion();
        conectado.conectar();

        String sql = "DELETE FROM profesores WHERE id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setLong(1, id);
            prepararSentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }

        conectado.cerrarConexion();

    }
}
