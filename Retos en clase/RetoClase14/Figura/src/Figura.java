/* Polimorfismo: SuperClase Figura
Acciones:
Se define la SuperClase Figura con los atributos
String: nombre
double: area, perimetro

Se define el constructor:
Figura(String nombre) con paso de los parámetros.

Se definen los métodos abstractos calcularArea y calcularPerimetro

Se definen los  métodos set y get para la variable de instancia nombre

Se definen el método imprimeInfoFigura
*/

public abstract class Figura{

    protected String nombre;
    protected double area, perimetro;
    
    public Figura(String nombre){
        this.nombre = nombre;
    }

     public String getNombre() {
        return nombre;
    }
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimeInfoFigura() {
        System.out.println("Nombre: "+ this.nombre + " Area: " + this.area + " Perimetro: " + this.perimetro);
    }
    
    public abstract void calcularArea();
  
    public abstract void calcularPerimetro();
    
}   

