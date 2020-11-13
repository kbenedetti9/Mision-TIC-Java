
/**
 *
 * @author Karen Benedetti M
 */
public class Taxi extends Vehiculo {

    private boolean AA;

    public Taxi(boolean AA) {
        this.AA = AA;
    }

    public Taxi(String matricula, boolean AA) {
        super(matricula);
        this.AA = AA;
    }

    public Taxi(String matricula, int numSillas, boolean AA) {
        super(matricula, numSillas);
        this.AA = AA;
    }

    public boolean getAA() {
        return AA;
    }

    public void setAA(boolean AA) {
        this.AA = AA;
    }
}
