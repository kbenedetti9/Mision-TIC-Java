/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Karen Benedetti M
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Primera parte: Polimorfismo en el uso del método de impresión");
        Figura p = new Figura("Rectangulo", 4);
        Figura t = new AreaFigura("Triangulo",3,12);
        AreaFigura c = new AreaFigura("Cuadrado", 4, 16);
        p.imprimeMensaje();
        t.imprimeMensaje();
        c.imprimeMensaje();
        System.out.println("");
        
        System.out.println("Segunda parte: Vector de objetos instanciados a partir de la SuperClase");
        Figura[] figuras = new Figura[3];
        figuras[0] = new Figura("Triangulo", 3);
        figuras[1] = new Figura("Paralelogramo", 4);
        figuras[2] = new AreaFigura("Trapecio", 4, 18);

        for (int i = 0; i < 3; i++) {
            figuras[i].imprimeMensaje();
        }
        
        System.out.println("\nOtra forma de imprimirlo con for");       
        for (Figura f: figuras){
            f.imprimeMensaje();
        }
    }
    
}
