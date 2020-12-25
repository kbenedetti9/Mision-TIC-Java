
/**
 *
 * @author Karen Benedetti M
 */

public abstract class Telefono {

    protected String marca;
    protected String modelo;
    protected String serial;
    protected String numTelefonico;

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Telefono(String marca, String modelo, String serial, String numTelefonico) {
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.numTelefonico = numTelefonico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(String numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

}
