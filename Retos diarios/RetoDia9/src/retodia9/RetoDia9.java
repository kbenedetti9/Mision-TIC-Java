package retodia9;

import java.util.Scanner;

/**
 *
 * @author Karen Benedetti M
 */
public class RetoDia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String marca1 = lector.next();// input la marca primer camión
        double capacidad1 = lector.nextDouble(); // input capacidad primer camión
        double kilometrajeInit1 = lector.nextDouble();// input el kilometraje inicial primer camión
        double kilometrajeFinal1 = lector.nextDouble();// input el kilometraje final primer camión
        int capacidadCombustible1 = lector.nextInt();// input la capacidad del tanque de combustible primer camión
        double tasaCombusPorKm1 = lector.nextDouble();// input la tasa del combustible por kilometraje primer
        int ejes1 = lector.nextInt();// input el numero de ejes primer camión
        String placa1 = lector.next();// input la placa primer camión
        int posicionLocalX1 = lector.nextInt();// input X0 primer camión
        int posicionLocalY1 = lector.nextInt();// input Y0 primer camión
        int posicionLocalZ1 = lector.nextInt();// input Z0 primer camión
        int posicionInstantaneaX1 = lector.nextInt();// input Digite X primer camión
        int posicionInstantaneaY1 = lector.nextInt();// input Digite Y primer camión
        int posicionInstantaneaZ1 = lector.nextInt();// Digite Z primer camión
        int posicionLocal1[] = {posicionLocalX1, posicionLocalY1, posicionLocalZ1};
        int posicionInstantanea1[] = {posicionInstantaneaX1, posicionInstantaneaY1, posicionInstantaneaZ1};
        Camion camion1 = new Camion(marca1, capacidad1, kilometrajeInit1, kilometrajeFinal1, capacidadCombustible1,
                tasaCombusPorKm1, ejes1, placa1, posicionLocal1, posicionInstantanea1);

        double distanciaC1 = camion1.distanciaCamionaBase(camion1.getPosicionLocal(), camion1.getPosicionInstantanea());

        System.out.println("La distancia del camión con placa " + camion1.getPlaca() + " de la base es de " + distanciaC1);

    }

}
