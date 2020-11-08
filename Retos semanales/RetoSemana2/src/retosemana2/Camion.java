package retosemana2;


public class Camion {
    private String marca;
    private double capacidad;
    private double kilometrajeInit;
    private double kilometrajeFinal;
    private int capacidadCombustible;
    private double tasaCombusPorKm;
    private int ejes;
    private String placa;
    private int[] posicionLocal = new int[3];
    private int[] posicionInstantanea = new int[3];

    public Camion(String marca, double capacidad, double kilometrajeInit, double kilometrajeFinal,
            int capacidadCombustible, double tasaCombusPorKm, int ejes, String placa, int[] posicionLocal,
            int[] posicionInstantanea) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.kilometrajeInit = kilometrajeInit;
        this.kilometrajeFinal = kilometrajeFinal;
        this.capacidadCombustible = capacidadCombustible;
        this.tasaCombusPorKm = tasaCombusPorKm;
        this.ejes = ejes;
        this.placa = placa;
        this.posicionLocal = posicionLocal;
        this.posicionInstantanea = posicionInstantanea;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setKilometrajeInit(double kilometrajeInit) {
        this.kilometrajeInit = kilometrajeInit;
    }

    public double getKilometrajeInit() {
        return kilometrajeInit;
    }

    public void setKilometrajeFinal(double kilometrajeFinal) {
        this.kilometrajeFinal = kilometrajeFinal;
    }

    public double getKilometrajeFinal() {
        return kilometrajeFinal;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setTasaCombusPorKm(double tasaCombusPorKm) {
        this.tasaCombusPorKm = tasaCombusPorKm;
    }

    public double getTasaCombusPorKm() {
        return tasaCombusPorKm;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPosicionLocal(int[] posicionLocal) {
        this.posicionLocal = posicionLocal;
    }

    public int[] getPosicionLocal() {
        return posicionLocal;
    }

    public void setPosicionInstantanea(int[] posicionInstantanea) {
        this.posicionInstantanea = posicionInstantanea;
    }

    public int[] getPosicionInstantanea() {
        return posicionInstantanea;
    }

    public double calcularCombustible(int capacidadCombustible, double kilometrajeInit, double kilometrajeFinal,
            double tasaCombusPorKm) {
        double result;
        result = capacidadCombustible - (kilometrajeFinal - kilometrajeInit) * tasaCombusPorKm;
        return result;
    }

    public double distanciaCamionaBase(int[] posicionLocal, int[] posicionInstantanea) {
        double result;
        result = Math.sqrt(Math.pow(posicionInstantanea[0] - posicionLocal[0], 2)
                + Math.pow(posicionInstantanea[1] - posicionLocal[1], 2)
                + Math.pow(posicionInstantanea[2] - posicionLocal[2], 2));
        return result;
    }
}