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
    //Se definen la variable para calcular el area y el perimetro 

    protected double radio;

    //Definición del constructor
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    //Se define el método abstracto calcularArea que viene de la clase super Figura
    @Override
    public double calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    //Se define el método abstracto calcularPerimetro que viene de la clase super Figura
    @Override
    public double calcularPerimetro() {
        perimetro = 2 * radio * Math.PI;
        return perimetro;
    }
}
