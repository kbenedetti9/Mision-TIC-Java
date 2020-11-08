package RetoDia6.src;

public class App {

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

    public static void main(String[] args) throws Exception {

        Camion camion = new Camion();
        camion = reto1("Mazda", "6", 30, 4, 4, "ABC123");
        System.out.print(camion);
    }
}
