package retodia7;

/**
 *
 * @author Karen Benedetti M
 */
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
    private int[] posicionInstantanea = new int[2];

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

    public double distanciaCamionaBase(int[] posicionLocal, int[] posicionInstantanea) {
        double result;
        result = Math.sqrt(Math.pow(posicionInstantanea[0] - posicionLocal[0], 2)
                + Math.pow(posicionInstantanea[1] - posicionLocal[1], 2)
                + Math.pow(posicionInstantanea[2] - posicionLocal[2], 2));
        return result;
    }
}
