/* Polimorfismo: SubClase Triangulo
Acciones:
Se define la SubClase Triangulo con los atributos
double: base, altura, lado1, lado2, lado3

Se define el constructor:
Triangulo(String nombre, double base, double altura, double lado1, double lado2, double lado3)
con paso de los parámetros.

Se implemetan los métodos calcularArea y calcularPerimetro, abstractos en la SuperClase

 */

/**
 *
 * @author Karen Benedetti M
 */
public class Triangulo extends Figura {

    protected double altura, base, lado1, lado2, lado3;

    public Triangulo(double altura, double base, double lado1, double lado2, double lado3, String nombre) {
        super(nombre);
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void calcularArea() {
        area = (base * altura) / 2;
    }

    public void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
    }
}
