/* Polimorfismo: SubClase Rectangulo
Acciones:
Se define la SubClase Rectangulo con los atributos
double: base, altura

Se define el constructor:
Rectangulo(String nombre, double base, double altura) con paso de los parámetros.

Se implemetan los métodos calcularArea y calcularPerimetro, abstractos en la SuperClase

 */

/**
 *
 * @author Karen Benedetti M
 */
public class Rectangulo extends Figura {

    protected double base, altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        area = base * altura;
    }

    public void calcularPerimetro() {
        perimetro = 2 * altura + 2 * base;
    }

}
