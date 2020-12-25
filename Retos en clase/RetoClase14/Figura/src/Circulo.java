/* Polimorfismo: SubClase Circulo
Acciones:
Se define la SubClase Circulo con el atributo
double: radio

Se define el constructor:
Circulo(String nombre, double radio) con paso de los parámetros.

Se implemetan los métodos calcularArea y calcularPerimetro, abstractos en la SuperClase

 */

/**
 *
 * @author Karen Benedetti M
 */
public class Circulo extends Figura {

    protected double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }

    public void calcularPerimetro() {
        perimetro = 2 * radio * Math.PI;
    }

}
