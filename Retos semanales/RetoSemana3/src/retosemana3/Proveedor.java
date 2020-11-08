package retosemana3;

/**
 *
 * @author Karen Benedetti M
 */
public class Proveedor extends Empleado {

    private int horasTrabajadas;
    private int valorHora;

    public Proveedor(int horasTrabajadas, int valorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public Proveedor(int horasTrabajadas, int valorHora, String codigo, String banco, int nroCuenta, int mesFacturacion, String nombre, int identificacion) {
        super(codigo, banco, nroCuenta, mesFacturacion, nombre, identificacion);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public Proveedor(int horasTrabajadas, int valorHora, String codigo, String banco, int nroCuenta, int mesFacturacion, String nombre, String apellido, int identificacion, String celular) {
        super(codigo, banco, nroCuenta, mesFacturacion, nombre, apellido, identificacion, celular);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public int getPago(int mesFacturacion) {

        if (this.getMesFacturacion() == mesFacturacion) {
            return horasTrabajadas * valorHora;
        } else if (this.getMesFacturacion() > mesFacturacion) {
            return -1;
        } else {
            return -2;
        }

    }
}
