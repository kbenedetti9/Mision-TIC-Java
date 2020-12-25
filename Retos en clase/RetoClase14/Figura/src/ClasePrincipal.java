/*
Objetivos:
- Construir una SuperClase abstracta y métodos abstractos.
- Sobre-escribir métodos abstractos (Area,Perimetro) en SubClases.
- Aplicar el polimorfismo sobre objetos de distinta clase
- Utilizar un método (imprimeMensaje) en cada SubClase

Partes del programa
1. Creación de un vector de figuras que instancia objetos las SubClases Circulo,
   Cuadrado, Rectangulo, y Triangulo. Se demuestra su adaptabilidad a cada tipo 
   de instancia.
2. Recorrido del vector de instancias de SubClases para  calcular el área y 
   perímetro de cada figura utiliizando el método sobre-escrito en cada SubClase
   e impresión del lnombre de la figura, área y perímetro utilizando el método
   imprimeMensaje() definido en la SuperClase.

Nota: Se demuestra (en comentario) que una clase abstracta no se deja instanciar
por sí sola. El objeto f1 istanciado a partir de Figura genera un error. Pruebe 
eliminando comentarios.

**/

/**
 *
 * @author Karen Benedetti M
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[4];

        figuras[0] = new Triangulo(4, 5, 3, 4, 5, "triangulo");
        figuras[1] = new Circulo("circulo", 8);
        figuras[2] = new Cuadrado("cuadrado", 5);
        figuras[3] = new Rectangulo(20, 10, "rectangulo");

        for (int i = 0; i < figuras.length; i++) {
            figuras[i].calcularArea();
            figuras[i].calcularPerimetro();
            figuras[i].imprimeInfoFigura();
        }

    }
}
