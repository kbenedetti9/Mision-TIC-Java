/* Polimorfismo: SuperClase Figura
Acciones:
Se define la SuperClase Figura con los atributos
String: nombre
int: numLados

Se define el constructor:
Figura(String nombre, int num) con paso de todos los parámetros.

Se definen los  métodos set y get para cada una de las variables de instancias
 */

/**
 *
 * @author Karen Benedetti M
 */
public class Figura {

    protected String nombre;
    protected int numLados;

    //Constructor
    public Figura(String nombre, int num) {
        this.nombre = nombre;
        this.numLados = num;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public void imprimeMensaje() {
        System.out.println("\nNumero de lados: "+ numLados+ "\nNombre: " + nombre);
    }
}
