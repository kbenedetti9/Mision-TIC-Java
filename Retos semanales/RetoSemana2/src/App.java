package RetoSemana2.src;

public class App {

    public static void main(String[] args) throws Exception {
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
        int posicionLocal1[] = { posicionLocalX1, posicionLocalY1, posicionLocalZ1 };
        int posicionInstantanea1[] = { posicionInstantaneaX1, posicionInstantaneaY1, posicionInstantaneaZ1 };
        Camion camion1 = new Camion(marca1, capacidad1, kilometrajeInit1, kilometrajeFinal1, capacidadCombustible1,
                tasaCombusPorKm1, ejes1, placa1, posicionLocal1, posicionInstantanea1);

        String marca2 = lector.next();
        double capacidad2 = lector.nextDouble();
        double kilometrajeInit2 = lector.nextDouble();
        double kilometrajeFinal2 = lector.nextDouble();
        int capacidadCombustible2 = lector.nextInt();
        double tasaCombusPorKm2 = lector.nextDouble();
        int ejes2 = lector.nextInt();
        String placa2 = lector.next();
        int posicionLocalX2 = lector.nextInt();
        int posicionLocalY2 = lector.nextInt();
        int posicionLocalZ2 = lector.nextInt();
        int posicionInstantaneaX2 = lector.nextInt();
        int posicionInstantaneaY2 = lector.nextInt();
        int posicionInstantaneaZ2 = lector.nextInt();
        int posicionLocal2[] = { posicionLocalX2, posicionLocalY2, posicionLocalZ2 };
        int posicionInstantanea2[] = { posicionInstantaneaX2, posicionInstantaneaY2, posicionInstantaneaZ2 };
        Camion camion2 = new Camion(marca2, capacidad2, kilometrajeInit2, kilometrajeFinal2, capacidadCombustible2,
                tasaCombusPorKm2, ejes2, placa2, posicionLocal2, posicionInstantanea2);

        double combustibleC1 = camion1.calcularCombustible(camion1.getCapacidadCombustible(),
                camion1.getKilometrajeInit(), camion1.getKilometrajeFinal(), camion1.getTasaCombusPorKm());
        double combustibleC2 = camion2.calcularCombustible(camion2.getCapacidadCombustible(),
                camion2.getKilometrajeInit(), camion2.getKilometrajeFinal(), camion2.getTasaCombusPorKm());

        double distanciaC1 = camion1.distanciaCamionaBase(camion1.getPosicionLocal(), camion1.getPosicionInstantanea());
        double distanciaC2 = camion2.distanciaCamionaBase(camion2.getPosicionLocal(), camion2.getPosicionInstantanea());

        if (distanciaC1 > distanciaC2) {
            System.out.println("El camion de placa: " + camion1.getPlaca()
                    + " se encuentra a mayor distancia de la base que el camion de placa: " + camion2.getPlaca());
        } else {
            System.out.println("El camion de placa: " + camion2.getPlaca()
                    + " se encuentra a mayor distancia de la base que el camion de placa: " + camion1.getPlaca());
        }

        if (combustibleC1 > combustibleC2) {
            System.out.println("El camion de placa: " + camion1.getPlaca()
                    + " tiene mas combustible que el camion de placa: " + camion2.getPlaca());
        } else {
            System.out.println("El camion de placa: " + camion2.getPlaca()
                    + " tiene mas combustible que el camion de placa: " + camion1.getPlaca());
        }

        double difDistancia = camion1.distanciaCamionaBase(camion1.getPosicionInstantanea(),
                camion2.getPosicionInstantanea());
        System.out.printf("La distancia entre los camiones es: " + "%.1f", difDistancia);
    }
    }
}
