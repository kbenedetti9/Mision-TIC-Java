
public class RetoDia3 {

    public static void main(String[] args) {

        int[] arreglosPuntosDistribucion = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[] arregloTiempoAsignado = { 11, 14, 11, 12, 12, 10, 13, 15, 10, 10, 15, 12, 15, 12, 15, 10, 10, 14, 14,
                12 };
        int[] arregloCajasAsignadas = { 98, 86, 99, 89, 89, 96, 93, 87, 89, 92, 99, 90, 87, 96, 92, 85, 86, 97, 90,
                98 };
        int[] arregloTiempoRegistrado = { 10, 10, 15, 15, 12, 13, 12, 11, 11, 12, 12, 12, 12, 11, 10, 14, 13, 11, 13,
                11 };
        int[] arregloCajasRegistradas = { 100, 86, 97, 93, 94, 93, 95, 85, 90, 90, 85, 89, 85, 93, 89, 89, 93, 99, 93,
                99 };
        int diferenciaC;
        float diferenciaT;
        float eficiencia = 0;
        int arregloDiferenciaCaja[] = new int[20];
        float arregloDiferenciaTiempo[] = new float[20];
        float arregloEficiencia[] = new float[20];
        float mayorDemora = 0;
        float mayorEntrega = 0;
        int posicionMayorDemora = 0;
        int posicionMayorEntrega = 0;
        int[] arregloPosicionMayorDemora = { 100, 100, 100 };
        int[] arregloPosicionMayorEntrega = { 100, 100, 100 };
        int k = 0;
        int m = 0;

        for (int i = 0; i < arregloCajasAsignadas.length; i++) {
            diferenciaC = arregloCajasAsignadas[i] - arregloCajasRegistradas[i];
            arregloDiferenciaCaja[i] = diferenciaC;
            diferenciaT = arregloTiempoAsignado[i] - arregloTiempoRegistrado[i];
            arregloDiferenciaTiempo[i] = diferenciaT;
            eficiencia = 100 - (float) arregloTiempoRegistrado[i] * 100 / arregloTiempoAsignado[i];
            arregloEficiencia[i] = eficiencia;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("Punto # " + (i + 1));
            System.out.println("Diferencia de cajas = " + arregloDiferenciaCaja[i]);
            System.out.println("Diferencia de tiempos = " + (int) arregloDiferenciaTiempo[i]);
            System.out.printf("Eficiencia = %.1f", arregloEficiencia[i]);
            System.out.println("%");
        }
        System.out.print("Los puntos con mayores demoras de tiempo = ");
        for (int j = 0; j < 3; j++) {
            mayorDemora = 0;
            for (int i = 0; i < 20; i++) {
                if (arregloDiferenciaTiempo[i] < mayorDemora && arregloPosicionMayorDemora[0] != i
                        && arregloPosicionMayorDemora[1] != i && arregloPosicionMayorDemora[2] != i) {
                    mayorDemora = arregloDiferenciaTiempo[i];
                    posicionMayorDemora = i;
                }
            }
            arregloPosicionMayorDemora[k] = posicionMayorDemora;
            k++;
            System.out.print("Punto " + arreglosPuntosDistribucion[posicionMayorDemora] + " :" + (int) mayorDemora);
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
                if (arregloDiferenciaCaja[i] < mayorEntrega && arregloPosicionMayorEntrega[0] != i
                        && arregloPosicionMayorEntrega[1] != i && arregloPosicionMayorEntrega[2] != i) {
                    mayorEntrega = arregloDiferenciaCaja[i];
                    posicionMayorEntrega = i;
                }
            }
            arregloPosicionMayorEntrega[m] = posicionMayorEntrega;
            m++;
            System.out.print("Punto " + arreglosPuntosDistribucion[posicionMayorEntrega] + " :" + (int) mayorEntrega);
            if (j != 2) {
                System.out.print(", ");
            } else {
                System.out.println("");
            }
        }

    }

}
