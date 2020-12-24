/* Herencia: SubClase AreaFigura 
Se define la SubClase AreaFigura con el atributo
int area
y los parámetros de la SuperClase que son heredados
String: nombre
int: numlados

Se definen un constructor:
AreaFigura(String nombre, int numlado, int area) se usa super con paso de 
                 parámetros nombre y numlado para llamar al constructor de la
                 SuperClase. El parámetro area seinicia en el constructor
                 AreaFigura.

Se definen los  métodos set y get para la variable de instancia area de 
AreaFigura
 */

/**
 *
 * @author Karen Benedetti M
 */
public class AreaFigura extends Figura {

    private int area;
    //Constructor especial por ser clase hijo.

    public AreaFigura(String nombre, int numlado, int area) {
        super(nombre, area);
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void imprimeMensaje() {
        System.out.println("\nArea: "+area+ "\nNombre: " + nombre);

    }
}
