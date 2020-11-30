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
public class Estudiante {

    private long id;
    private String nombre;
    private String celular;
    private int edad;
    private ArrayList<Curso> cursos;

    public Estudiante() {
    }

    public Estudiante(long id, String nombre, String celular, int edad) {
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

        } catch (SQLException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void agregarCurso(long idEstudiante, long idCurso) {
        Conexion conectado = new Conexion();
        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "INSERT INTO curso_estudiante (id_curso,id_estudiante)" + "VALUES (?,?)";

        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);
            prepararSentencia.setLong(1, idCurso);
            prepararSentencia.setLong(2, idEstudiante);
            prepararSentencia.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<Estudiante> consultarEstudiantePorProfesor(long idProfesor) {
        Conexion conectado = new Conexion();
        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        ResultSet result = null;

        String sql = "SELECT DISTINCT estudiantes.id AS e_id, estudiantes.nombre AS e_nombre, estudiantes.edad AS e_edad "
                + "FROM profesores INNER JOIN cursos ON profesores.id = cursos.profesor INNER JOIN curso_estudiante ON curso_estudiante.id_curso = cursos.id "
                + "INNER JOIN estudiantes ON curso_estudiante.id_estudiante = estudiantes.id WHERE profesores.id = " + idProfesor;
        try {
            PreparedStatement prepararaSentencia = conectado.getConexion().prepareStatement(sql);

            result = prepararaSentencia.executeQuery();
            while (result.next()) {
                Estudiante estudiante = new Estudiante();

                estudiante.setId(result.getInt("e_id"));
                estudiante.setNombre(result.getString("e_nombre"));
                estudiante.setEdad(result.getInt("e_edad"));

                listaEstudiantes.add(estudiante);

            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaEstudiantes;
    }

    public static ArrayList<Estudiante> consultarEstudiantePorCurso(long idCurso) {
        Conexion conectado = new Conexion();
        try {
            conectado.conectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        ResultSet result = null;

        String sql = "SELECT DISTINCT cursos.id AS c_id, cursos.nombre AS c_nombre, cursos.capacidad AS c_capacidad, "
                + "profesores.id AS p_id, profesores.nombre AS p_nombre, profesores.correo AS p_correo, "
                + "profesores.edad AS p_edad, curso_estudiante.id_estudiante AS ce_iestu, curso_estudiante.id_curso AS ce_icurso,"
                + "estudiantes.id AS e_id, estudiantes.nombre AS e_nombre, estudiantes.celular AS e_celular, estudiantes.edad AS e_edad"
                + " From cursos INNER JOIN profesores ON cursos.profesor = profesores.id INNER JOIN curso_estudiante ON "
                + "cursos.id = curso_estudiante.id_curso INNER JOIN estudiantes ON curso_estudiante.id_estudiante = estudiantes.id"
                + " where c_id=" + idCurso;
        try {
            PreparedStatement prepararSentencia = conectado.getConexion().prepareStatement(sql);

            result = prepararSentencia.executeQuery();
            while (result.next()) {
                Estudiante estudiante = new Estudiante();
                Profesor profe = new Profesor();
                Curso cur = new Curso();
                profe.setId(result.getInt("p_id"));
                profe.setNombre(result.getString("p_nombre"));
                profe.setCorreo(result.getString("p_correo"));
                profe.setEdad(result.getInt("p_edad"));

                cur.setId(result.getInt("c_id"));
                cur.setNombre(result.getString("c_nombre"));
                cur.setCapacidad(result.getInt("c_capacidad"));

                estudiante.setId(result.getInt("e_id"));
                estudiante.setNombre(result.getString("e_nombre"));
                estudiante.setCelular(result.getString("e_celular"));
                estudiante.setEdad(result.getInt("e_edad"));

                listaEstudiantes.add(estudiante);

            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        try {
            conectado.cerrarConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaEstudiantes;
    }

}
