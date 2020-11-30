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
public class Estudiante {

    private int id;
    private String nombre;
    private String celular;
    private int edad;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Estudiante() {
    }

    public Estudiante(int id, String nombre, String celular, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
        this.edad = edad;
    }

    public Estudiante(String nombre, String celular, int edad) {
        this.nombre = nombre;
        this.celular = celular;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "INSERT INTO estudiantes (nombre,celular,edad)" + "VALUES (?,?,?)";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setString(1, nombre);
            prepararSentencia.setString(2, celular);
            prepararSentencia.setInt(3, edad);
            prepararSentencia.executeUpdate();
            System.out.println("Estudiante creado");

        } catch (SQLException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public static ArrayList<Estudiante> leer() throws ClassNotFoundException {
//        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
//        Conexion conectado = new Conexion();
//        Connection estaConectado = conectado.conectar();
//
//        String sql = "SELECT * FROM estudiantes";
//
//        try {
//            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
//            ResultSet rs;
//            //Ejecuata la sentencia y retorna los datos
//            rs = prepararSentencia.executeQuery();
//            while (rs.next()) {
//                Estudiante estudiante = new Estudiante();
//                estudiante.setId(rs.getInt("id"));
//                estudiante.setNombre(rs.getString("nombre"));
//                estudiante.setCelular(rs.getString("celular"));
//                estudiante.setEdad(rs.getInt("edad"));
//                listaEstudiantes.add(estudiante);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        conectado.cerrarConexion();
//        return listaEstudiantes;
//    }
    public static ArrayList<Estudiante> leer() {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList();
        try {
            Conexion conectado = new Conexion();
            try {
                Connection estaConectado = conectado.conectar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
            try (Statement statement = conectado.getConexion().createStatement()) {
                String query = "SELECT * FROM estudiantes";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    Estudiante estudiante = new Estudiante();
                    estudiante.setId(rs.getInt("id"));
                    estudiante.setNombre(rs.getString("nombre"));
                    estudiante.setCelular(rs.getString("celular"));
                    estudiante.setEdad(rs.getInt("edad"));
                    listaEstudiantes.add(estudiante);
                }
            }
            try {
                conectado.cerrarConexion();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException e) {
            System.out.println("Error al leer los datos");
        }

        return listaEstudiantes;
    }

    public void actualizar(Estudiante estudiante) throws ClassNotFoundException {

        Conexion conectado = new Conexion();

        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "UPDATE estudiantes SET nombre = ?,celular = ?, edad = ?,"
                + "WHERE id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setString(1, estudiante.getNombre());
            prepararSentencia.setString(2, estudiante.getCelular());
            prepararSentencia.setInt(3, estudiante.getEdad());
            prepararSentencia.executeUpdate();
            System.out.println("Estudiante editado con exito!");

        } catch (SQLException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectado.cerrarConexion();
    }

    public void eliminar(int id) throws ClassNotFoundException {

        Conexion conectado = new Conexion();
        conectado.conectar();

        String sql = "DELETE FROM estudaintes WHERE id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setLong(1, id);
            prepararSentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

        conectado.cerrarConexion();

    }

}
