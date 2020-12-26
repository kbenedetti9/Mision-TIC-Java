/* Polimorfismo: SubClase Rectangulo
Acciones:
Se define la SubClase Rectangulo con los atributos
double: base, altura

Se define el constructor:
Rectangulo(String nombre, double base, double altura) con paso de los parámetros.

Se implemetan los métodos calcularArea y calcularPerimetro, abstractos en la SuperClase

*/
public class Rectangulo extends Figura{
    protected double base, altura;
    
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        area =  base * altura;
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        perimetro =  2*base + 2*altura;
        return perimetro;
    }
        
}
