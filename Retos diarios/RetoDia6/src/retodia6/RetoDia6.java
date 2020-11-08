package retodia6;

/**
 *
 * @author Karen Benedetti M
 */
public class RetoDia6 {

    public static Camion reto1(String marca, String modelo, float peso, float capacidad, int numEjes, String placa) {
        Camion nuevoCamion = new Camion();
        nuevoCamion.marca = marca;
        nuevoCamion.modelo = modelo;
        nuevoCamion.peso = peso;
        nuevoCamion.capacidad = capacidad;
        nuevoCamion.numEjes = numEjes;
        nuevoCamion.placa = placa;
        return nuevoCamion;
    }

    public static void main(String[] args) {
        Camion camion = new Camion();
        camion = reto1("Mazda", "CX-3", 30, 7, 5, "ABC123");
    }

}
