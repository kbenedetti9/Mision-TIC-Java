package modelo;

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

    private long id;
    private String nombre;
    private int capacidad;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Curso() {
    }

    public Curso(long id, String nombre, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public Curso(String nombre, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public Curso(long id, String nombre, int capacidad, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.profesor = profesor;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
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
            System.out.println("Curso agregado con éxito");

        } catch (SQLException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
                    System.out.println("Obteniendo lista de cursos");
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

        String sql = "UPDATE cursos SET nombre = ?,capacidad = ? WHERE id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setString(1, curso.getNombre());
            prepararSentencia.setInt(2, curso.getCapacidad());
            prepararSentencia.setLong(3, curso.getId());
            prepararSentencia.executeUpdate();
            System.out.println("Curso editado con exito!");

        } catch (SQLException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
        conectado.cerrarConexion();
    }
    
    public void eliminar(long id) throws ClassNotFoundException {

        Conexion conectado = new Conexion();
        conectado.conectar();

        String sql = "DELETE FROM cursos WHERE id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setLong(1, id);
            prepararSentencia.executeUpdate();
            System.out.println("Curso eliminado con exito!");
        } catch (SQLException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }

        conectado.cerrarConexion();

    }

    public static void asignarProfesor(long idCurso, long idProfesor) {
        Conexion conectado = new Conexion();

        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "UPDATE cursos SET profesor = ? WHERE id = ?";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setLong(1, idProfesor);
            prepararSentencia.setLong(2, idCurso);
            prepararSentencia.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Curso> consultarCursoPorProfesor(long idProfesor) {
        Conexion conectado = new Conexion();
        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }

        ArrayList<Curso> listaCursos = new ArrayList<>();

        ResultSet result = null;

        String sql = "SELECT DISTINCT cursos.id AS c_id, cursos.nombre AS c_nombre, cursos.capacidad AS c_capacidad,"
                + " profesores.id AS p_id, profesores.nombre AS p_nombre, profesores.correo AS p_correo,"
                + " profesores.edad AS p_edad From cursos INNER JOIN profesores ON "
                + "cursos.profesor = profesores.id where p_id = " + idProfesor;
        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            result = prepararSentencia.executeQuery();
            while (result.next()) {
                Curso curso = new Curso();
                curso.setId(result.getInt("c_id"));
                curso.setNombre(result.getString("c_nombre"));
                curso.setCapacidad(result.getInt("c_capacidad"));
                listaCursos.add(curso);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaCursos;
    }

}
