package retosemana1;

/**
 *
 * @author Karen Benedetti M
 */
public class Planilla {
    
    public void control(int[][] matrizasig, int[][] matrizreg) {

        int matrizResultado[][] = new int[20][3];
        float eficiencia = 0;
        int mayorDemora = 0;
        int mayorEntrega = 0;
        int posicionMayorDemora = 0;
        int posicionMayorEntrega = 0;
        int arregloPosicionMayorDemora[] = new int[3];
        int arregloPosicionMayorEntrega[] = new int[3];
        int k = 0;
        int m = 0;
        int cont = 0, contComa = 1;

        for (int j = 0; j < 20; j++) {
            matrizResultado[j][0] = j + 1;
            matrizResultado[j][1] = matrizasig[j][1] - matrizreg[j][1];
            matrizResultado[j][2] = matrizasig[j][2] - matrizreg[j][2];
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("Punto # " + matrizResultado[i][0]);
            System.out.println("Diferencia de cajas = " + matrizResultado[i][1]);
            System.out.println("Diferencia de tiempos = " + matrizResultado[i][2]);
            eficiencia = 100 - (float) matrizreg[i][2] * 100 / matrizasig[i][2];
            System.out.printf("Eficiencia = %.1f", eficiencia);
            System.out.println("%");
        }

        System.out.print("Los puntos con mayores demoras de tiempo = ");
        for (int j = 0; j < 3; j++) {
            mayorDemora = 0;
            for (int i = 0; i < 20; i++) {
                if (matrizResultado[i][2] < mayorDemora && arregloPosicionMayorDemora[0] != i
                        && arregloPosicionMayorDemora[1] != i && arregloPosicionMayorDemora[2] != i) {
                    mayorDemora = matrizResultado[i][2];
                    posicionMayorDemora = i;
                }
            }
            arregloPosicionMayorDemora[k] = posicionMayorDemora;
            k++;
            System.out.print("Punto " + matrizResultado[posicionMayorDemora][0] + " = " + (int) mayorDemora);
            if (j != 2) {
                System.out.print(", ");
            } else {
                System.out.println("");
            }
        }

        System.out.print("Los puntos con mayores sobre-entregas = ");
        for (int j = 0; j < 3; j++) {
            mayorEntrega = 0;
            for (int i = 0; i < 20; i++) {
                if (matrizResultado[i][1] < mayorEntrega && arregloPosicionMayorEntrega[0] != i
                        && arregloPosicionMayorEntrega[1] != i && arregloPosicionMayorEntrega[2] != i) {
                    mayorEntrega = matrizResultado[i][1];
                    posicionMayorEntrega = i;
                }
            }
            arregloPosicionMayorEntrega[m] = posicionMayorEntrega;
            m++;
            System.out.print("Punto " + matrizResultado[posicionMayorEntrega][0] + " =" + (int) mayorEntrega);
            if (j != 2) {
                System.out.print(", ");
            } else {
                System.out.println("");
            }
        }

        System.out.print("Los puntos donde pasan ambas = ");
        for (int q = 0; q < 20; q++) {
            if (matrizResultado[q][1] < 0 && matrizResultado[q][2] < 0) {
                cont++;
            }
        }

        for (int w = 0; w < 20; w++) {
            if (matrizResultado[w][1] < 0 && matrizResultado[w][2] < 0) {
                if (contComa < cont) {
                    System.out.print("Punto " + (w + 1) + ",");
                    contComa++;
                } else {
                    System.out.print("Punto " + (w + 1));
                }
            }
        }
    }
    
}
