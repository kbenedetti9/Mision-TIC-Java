
public class ClasePrincipal {

    public static void main(String[] args) throws ClassNotFoundException {

        Persona e = new Persona(5, "Maria", "Rojo", "Cr 4 # 5- 90", "Medellin");

        e.Crear();
        e.Borrar((long) 1);
        e.Actualizar((long) 2, "Jose", "Martinez", "Cl. 15 # 4 - 43", "Monteria");
        System.out.println(e.Leer().get(0).getNombre());
    }

}
