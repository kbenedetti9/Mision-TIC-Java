package retodia12;

/**
 *
 * @author Karen Benedetti M
 */
public class Empleado extends Persona {

    private String codigo;
    private String banco;
    private int nroCuenta;
    private int mesFacturacion;

    public Empleado(String codigo, String banco, int nroCuenta, int mesFacturacion, String nombre, String apellido, int identificacion, String celular) {
        super(nombre, apellido, identificacion, celular);
        this.codigo = codigo;
        this.banco = banco;
        this.nroCuenta = nroCuenta;
        this.mesFacturacion = mesFacturacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public int getMesFacturacion() {
        return mesFacturacion;
    }

    public void setMesFacturacion(int mesFacturacion) {
        this.mesFacturacion = mesFacturacion;
    }

    public int getPago(int mesFacturacion) {
        return 0;
    }
}
