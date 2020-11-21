import java.util.ArrayList;

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

}
