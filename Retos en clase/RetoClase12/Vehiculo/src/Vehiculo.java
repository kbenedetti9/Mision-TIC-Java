
/**
 *
 * @author Karen Benedetti M
 */
public class Vehiculo {

    private String matricula;
    private int numSillas;

    public Vehiculo() {

    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;

    }

    public Vehiculo(String matricula, int numSillas) {
        this.matricula = matricula;
        this.numSillas = numSillas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getnumSillas() {
        return numSillas;
    }

    public void setNumSillas(int numSillas) {
        this.numSillas = numSillas;
    }

}
