/* Polimorfismo: SubClase Cuadrado
Acciones:
Se define la SubClase Cuadrado con el atributo
double: lado

Se define el constructor:
Cuadrado(String nombre, double lado) con paso de los parámetros.

Se implemetan los métodos calcularArea y calcularPerimetro, abstractos en la SuperClase

 */
public class Cuadrado extends Figura {

    //Se definen la variable para calcular el area y el perimetro 
    protected double lado;

    //Definición del constructor
    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    //Se define el método abstracto calcularArea que viene de la clase super Figura
    @Override
    public double calcularArea() {
        area = lado * lado;
        return area;
    }

    //Se define el método abstracto calcularPerimetro que viene de la clase super Figura
    @Override
    public double calcularPerimetro() {
        perimetro = lado * 4;
        return perimetro;
    }
}
