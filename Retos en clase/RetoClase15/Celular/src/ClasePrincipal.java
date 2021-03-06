
/**
 *
 * @author Karen Benedetti M
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        Telefono[] tels = new Telefono[4];

        tels[0] = new IPhone("Apple", "iPhone 7", "VN4567", "3008765432");
        tels[1] = new Samsung("Samsung", "Galaxy 10");
        tels[2] = new Inalambrico("VTex", "10.2", "yt45", "3456234");
        tels[3] = new IPhone("Apple", "iPhone 10", "VN2367", "3204536754");

        for (int i = 0; i < tels.length; i++) {
            System.out.println("Marca: " + tels[i].getMarca() + " Modelo: " + tels[i].getModelo());
            if (tels[i] instanceof IPhone) {
                IPhone p = (IPhone) tels[i];
                p.obtenerCoordenadas();
                p.imprimeVelLuz();
            } else if (tels[i] instanceof Samsung) {
                Samsung s = (Samsung) tels[i];
                s.ApagarFlash();
            }
        }

        System.out.println("Velocidad de la luz: " + GPS.velocidadLuz);
    }

}
