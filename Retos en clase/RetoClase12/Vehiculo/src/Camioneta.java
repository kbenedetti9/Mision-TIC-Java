
/**
 *
 * @author Karen Benedetti M
 */
public class Camioneta extends Vehiculo {

    private boolean AA;
    private int sillasAdicionales;

    // Usa el constructor de Vehículo con matrícula solamente
    public Camioneta(String matricula, boolean AA) {
        super(matricula);
        this.AA = AA;
    }

    public boolean getAA() {
        return AA;
    }

    public void setAA(boolean AA) {
        this.AA = AA;
    }

    public int getSillasAdicionales() {
        return sillasAdicionales;
    }

    public void setSillasAdicionales(int sillasAdicionales) {
        this.sillasAdicionales = sillasAdicionales;
    }

    public int getnumSillas() {
        return super.getnumSillas() + sillasAdicionales;
    }
}
