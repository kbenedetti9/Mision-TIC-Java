package retosemana3;

/**
 *
 * @author Karen Benedetti M
 */
public class Fijo extends Empleado implements HrsExtra {

    private String EPS;
    private String fondoPension;
    private String fondoCesantias;
    private String ARL;
    private int salario;
    private int horasExtras;

    public Fijo(int salario, int horasExtras, String codigo, String banco, int nroCuenta, int mesFacturacion, String nombre, int identificacion) {
        super(codigo, banco, nroCuenta, mesFacturacion, nombre, identificacion);
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public Fijo(String EPS, String fondoPension, String fondoCesantias, String ARL, int salario, int horasExtras, String codigo, String banco, int nroCuenta, int mesFacturacion, String nombre, int identificacion) {
        super(codigo, banco, nroCuenta, mesFacturacion, nombre, identificacion);
        this.EPS = EPS;
        this.fondoPension = fondoPension;
        this.fondoCesantias = fondoCesantias;
        this.ARL = ARL;
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public Fijo(String EPS, String fondoPension, String fondoCesantias, String ARL, int salario, int horasExtras, String codigo, String banco, int nroCuenta, int mesFacturacion, String nombre, String apellido, int identificacion, String celular) {
        super(codigo, banco, nroCuenta, mesFacturacion, nombre, apellido, identificacion, celular);
        this.EPS = EPS;
        this.fondoPension = fondoPension;
        this.fondoCesantias = fondoCesantias;
        this.ARL = ARL;
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getFondoPension() {
        return fondoPension;
    }

    public void setFondoPension(String fondoPension) {
        this.fondoPension = fondoPension;
    }

    public String getFondoCesantias() {
        return fondoCesantias;
    }

    public void setFondoCesantias(String fondoCesantias) {
        this.fondoCesantias = fondoCesantias;
    }

    public String getARL() {
        return ARL;
    }

    public void setARL(String ARL) {
        this.ARL = ARL;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public int getPago(int mesFacturacion) {

        if (this.getMesFacturacion() == mesFacturacion) {
            double saludYPension = salario * 0.08;
            double pagoHrsExtra = horasExtras * HrsExtra.VALOR_HORA_EXTRA;
            double pago = salario - saludYPension + pagoHrsExtra;
            return (int) pago;
        } else if (this.getMesFacturacion() > mesFacturacion) {
            return -1;
        } else {
            return -2;
        }
    }

}
