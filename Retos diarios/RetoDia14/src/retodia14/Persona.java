package retodia14;

/**
 *
 * @author Karen Benedetti M
 */
public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int identificacion;
    protected String celular;

    public Persona() {
    }

    public Persona(String nombre, int identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public Persona(String nombre, String apellido, int identificacion, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.celular = celular;
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

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public abstract int getPago(int mesFacturacion);

}
