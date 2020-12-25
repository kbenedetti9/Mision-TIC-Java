
/**
 *
 * @author Karen Benedetti M
 */
public class IPhone extends Telefono implements GPS, Camara {

    public IPhone(String marca, String modelo, String serial, String numTelefonico) {
        super(marca, modelo, serial, numTelefonico);
    }

    public void imprimeVelLuz() {
        System.out.println("Velocidad de la luz :" + GPS.velocidadLuz);
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
