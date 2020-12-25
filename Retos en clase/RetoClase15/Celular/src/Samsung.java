
/**
 *
 * @author Karen Benedetti M
 */
public class Samsung extends Telefono implements GPS, Camara {

    public Samsung(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void obtenerCoordenadas() {
        System.out.println("Obteniendo coordenadas");
    }

    @Override
    public void buscarDireccion() {
        System.out.println("Obteniendo direccion");
    }

    @Override
    public void prenderFlash() {
        System.out.println("Prendiendo flash");
    }

    @Override
    public void ApagarFlash() {
        System.out.println("Apagando flash");
    }

    @Override
    public void seleccionarVista() {
        System.out.println("Seleccionando vista");
    }

}
