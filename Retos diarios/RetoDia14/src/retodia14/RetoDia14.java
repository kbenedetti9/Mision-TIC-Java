package retodia14;

/**
 *
 * @author Karen Benedetti M
 */
public class RetoDia14 {

    public static void calcularSalarios(Empleado[] emps, int mesfacturacion) {
        int i = 0;
        System.out.println("Empleado: " + emps[i].nombre + " " + emps[i].apellido + " salario: " + emps[i].getPago(emps[i].getMesFacturacion()));
        i++;
    }

    public static void main(String[] args) {
        Proveedor p1 = new Proveedor(50, 80000, "5463", "Banco de Bogota", 5555, 5, "Marta", "Perez", 1111, "3214567890");
        Proveedor p2 = new Proveedor(10, 40000, "5432", "Bancolombia", 4444, 5, "Pedro", "Sierra", 9999, "3119876543");
        Proveedor p3 = new Proveedor(40, 100000, "4463", "Banco Santander", 3333, 5, "Xiomara", "Martinez", 2222, "3005467892");

        Fijo f1 = new Fijo("Sura", "Proteccion", "Proteccion", "ARL", 1000000, 0, "1234", "Banco de Bogota", 0000, 5, "John", "Pineda", 2222, "3006876543");
        Fijo f2 = new Fijo("Salud Coop", "Proteccion", "Proteccion", "ARL", 1500000, 3, "1234", "BBVA", 1111, 5, "Ana", "Salcedo", 6666, "3214444444");

        Empleado[] emps = new Empleado[5];

        emps[0] = p1;
        emps[1] = p2;
        emps[2] = p3;
        emps[3] = f1;
        emps[4] = f2;

        calcularSalarios(emps, 5);

    }
}
