class Camion {
    public String marca;
    public String modelo;
    public float peso;
    public float capacidad;
    public int numEjes;
    public String placa;

    public void imprimirCamion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Peso vehicular(kg): " + peso);
        System.out.println("Capacidad de carga(kg): " + capacidad);
        System.out.println("Número de ejes: " + numEjes);
        System.out.println("Placa: " + placa);

    }
}