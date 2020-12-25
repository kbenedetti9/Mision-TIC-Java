/* Polimorfismo: SubClase Cuadrado
Acciones:
Se define la SubClase Cuadrado con el atributo
double: lado

Se define el constructor:
Cuadrado(String nombre, double lado) con paso de los parámetros.

Se implemetan los métodos calcularArea y calcularPerimetro, abstractos en la SuperClase

 */

/**
 *
 * @author Karen Benedetti M
 */
public class Cuadrado extends Figura {

    protected double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    public void calcularArea() {
        area = lado * lado;
    }

    public void calcularPerimetro() {
        perimetro = lado * 4;
    }

}
