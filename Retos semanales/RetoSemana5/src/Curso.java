//package retosemana5;

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

        } catch (SQLException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void agregarCurso(long idCurso, long idProfesor) {
        Conexion conectado = new Conexion();

        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "UPDATE cursos SET profesor = ?"
                + "WHERE id = ?";

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
                Profesor profesor = new Profesor();
                profesor.setId(result.getInt("p_id"));
                profesor.setNombre(result.getString("p_nombre"));
                profesor.setCorreo(result.getString("p_correo"));
                profesor.setEdad(result.getInt("p_edad"));
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
