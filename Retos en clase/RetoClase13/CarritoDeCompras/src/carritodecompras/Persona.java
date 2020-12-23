package carritodecompras;

/**
 *
 * @author Karen Benedetti M
 */
public class Persona {

    private int doc;
    private String nombre;
//    private int codigo;

    public Persona() {
    }

    public Persona(int doc, String nombre) {
        this.doc = doc;
        this.nombre = nombre;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() {
        System.out.println("Documento: " + doc + " Nombre: " + nombre);
    }

    public boolean equals(Object obj) {
        return nombre.equalsIgnoreCase(((Persona) obj).nombre);
    }
}
