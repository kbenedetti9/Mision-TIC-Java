package retodia2;

import java.util.Scanner;

/**
 *
 * @author Karen Benedetti M
 */
public class RetoDia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int ptoDistribucion;
        int cajasAsignadas = 0;
        int cajasRegistradas = 0;
        float tiempoAsignado = 0;
        float tiempoRegistrado = 0;
        int difCajas = 0;
        float difTiempos = 0;
        float eficiencia = 0;

        System.out.println("Ingresa el numero de puntos de distribucion");
        ptoDistribucion = lector.nextInt();

        for (int i = 0; i < ptoDistribucion; i++) {
            System.out.println("Ingresa el numero de cajas asigandas para el pto de distribucion");
            cajasAsignadas = lector.nextInt();
            System.out.println("Ingresa el tiempo de despacho asignado");
            tiempoAsignado = lector.nextInt();
            System.out.println("Ingresa el numero de cajas registradas para el pto de distribucion");
            cajasRegistradas = lector.nextInt();
            System.out.println("Ingresa el tiempo de despacho registrado");
            tiempoRegistrado = lector.nextInt();

            difCajas = cajasAsignadas - cajasRegistradas;
            difTiempos = tiempoAsignado - tiempoRegistrado;
            eficiencia = 100 - (tiempoRegistrado * 100 / tiempoAsignado);

            System.out.println("Punto # " + (i + 1));
            System.out.println("Diferencia de cajas = " + difCajas);
            System.out.printf("Diferencia de tiempos = %.0f", difTiempos);
            System.out.println("");
            System.out.printf("Eficiencia = %.1f", eficiencia);
            System.out.print("%");

        }
    }
}
