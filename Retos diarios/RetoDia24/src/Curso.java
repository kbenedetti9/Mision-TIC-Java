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
public class Curso {

    private int id;
    private String nombre;
    private int capacidad;
//    private int profesor;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Curso() {
    }

    public Curso(int id, String nombre, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public Curso(String nombre, int capacidad) {
//        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void crear() {

        Conexion conectado = new Conexion();
        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "INSERT INTO cursos (nombre,capacidad)" + "VALUES (?,?)";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setString(1, nombre);
            prepararSentencia.setInt(2, capacidad);
            prepararSentencia.executeUpdate();
            System.out.println("Curso creado");

        } catch (SQLException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public static ArrayList<Curso> leer() throws ClassNotFoundException {
//        ArrayList<Curso> listaCursos = new ArrayList<>();
//        Conexion conectado = new Conexion();
//        Connection estaConectado = conectado.conectar();
//
//        String sql = "SELECT * FROM cursos";
//
//        try {
//            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
//            ResultSet rs;
//            //Ejecuata la sentencia y retorna los datos
//            rs = prepararSentencia.executeQuery();
//            while (rs.next()) {
//                Curso curso = new Curso();
//                curso.setId(rs.getInt("id"));
//                curso.setNombre(rs.getString("nombre"));
//                curso.setCapacidad(rs.getInt("capacidad"));
//                listaCursos.add(curso);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        conectado.cerrarConexion();
//        return listaCursos;
//    }
    public static ArrayList<Curso> leer() {
        ArrayList<Curso> listaCursos = new ArrayList();
        try {
            Conexion conectado = new Conexion();
            try {
                Connection estaConectado = conectado.conectar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
            }
            try (Statement statement = conectado.getConexion().createStatement()) {
                String query = "SELECT * FROM cursos";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    Curso curso = new Curso();
                    curso.setId(rs.getInt("id"));
                    curso.setNombre(rs.getString("nombre"));
                    curso.setCapacidad(rs.getInt("capacidad"));
                    listaCursos.add(curso);
                }
            }
            try {
                conectado.cerrarConexion();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException e) {
            System.out.println("Error al leer los datos");
        }

        return listaCursos;
    }

    public void actualizar(Curso curso) throws ClassNotFoundException {

        Conexion conectado = new Conexion();

        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "UPDATE cursos SET nombre = ?,capacidad = ?"
                + "WHERE id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setString(1, curso.getNombre());
            prepararSentencia.setInt(2, curso.getCapacidad());
            prepararSentencia.executeUpdate();
            System.out.println("Curso editado con exito!");

        } catch (SQLException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
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
