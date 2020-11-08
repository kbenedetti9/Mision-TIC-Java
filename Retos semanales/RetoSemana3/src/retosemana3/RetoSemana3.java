package retosemana3;

import java.util.Scanner;

/**
 *
 * @author Karen Benedetti M
 */
public class RetoSemana3 {

    public static void calcularSalarios(Empleado emps, int mesfacturacion) {

        int pago = emps.getPago(mesfacturacion);

        if (pago == -2) {
            System.out.println("Mes sin facturar");
        } else if (pago == -1) {
            System.out.println("Mes ya facturado");
        } else {
            System.out.println("El monto a liquidar del empleado: " + emps.getCodigo() + " es: $" + pago);
        }
    }

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int salario1 = lector.nextInt();//Input el salario del empleado 1 (Int) 
        int horasExtra1 = lector.nextInt();//Input las horas extras del empleado 1 (Int)
        String codigo1 = lector.next();// Input el codigo del empleado 1 (String)
        String banco1 = lector.next();// Input el banco a consignasr del empleado 1 (String)
        lector.nextLine();
        int numCuenta1 = Integer.parseInt(lector.next());// Input el numero de cuenta del empleado 1 (Int)
        int mesFacturacion1 = Integer.parseInt(lector.next());// Input el mes que se facturará del empleado 1 (Int)
        String nombre1 = lector.next();// Input el nombre del empleado 1 (String)
        int id1 = lector.nextInt();// Input la identifiacion del empleado 1 (Int)

        int salario2 = lector.nextInt();//Input el salario del empleado 1 (Int) 
        int horasExtra2 = lector.nextInt();//Input las horas extras del empleado 1 (Int)
        String codigo2 = lector.next();// Input el codigo del empleado 1 (String)
        String banco2 = lector.next();// Input el banco a consignasr del empleado 1 (String)
        lector.nextLine();
        int numCuenta2 = lector.nextInt();// Input el numero de cuenta del empleado 1 (Int)
        int mesFacturacion2 = Integer.parseInt(lector.next());// Input el mes que se facturará del empleado 1 (Int)
        String nombre2 = lector.next();// Input el nombre del empleado 1 (String)
        int id2 = lector.nextInt();// Input la identifiacion del empleado 1 (Int)    

        int hrsTrabajadasPro1 = lector.nextInt();// Input las horas trabajadas prooveedor 1 (Int)
        int valorHora1 = lector.nextInt();// Input el valor de la hora del proovedor 1 (Int)
        String codPro1 = lector.next();// Input el codigo del proovedor 1 (String)
        String bancoPro1 = lector.next();// Input el banco a consignar del prooveedor 1 (String)
        lector.nextLine();
        int numCuentaPro1 = lector.nextInt();// Input el numero de cuenta del prooveedor 1 (Int)
        int mesFacturacionPro1 = Integer.parseInt(lector.next());// Input el mes a facturar del prooveedor 1 (Int)
        String nombrePro1 = lector.next();// Input el nombre del prooveedor 1 (String)
        int idPro1 = lector.nextInt();// Input la identificacion del prooveedor 1 (Int)
        int mesALiquidar1 = lector.nextInt();// Input el mes a facturar del empleado 1 (Int)
        int mesALiquidar2 = lector.nextInt();// Input el mes a facturar del empleado 2 (Int)
        int mesALiquidarPro = lector.nextInt();// Input el mes a facturar del proovedor (Int)

        Fijo fijo1 = new Fijo(salario1, horasExtra1, codigo1, banco1, numCuenta1, mesFacturacion1, nombre1, id1);
        Fijo fijo2 = new Fijo(salario2, horasExtra2, codigo2, banco2, numCuenta2, mesFacturacion2, nombre2, id2);
        Proveedor provedor = new Proveedor(hrsTrabajadasPro1, valorHora1, codPro1, bancoPro1, numCuentaPro1, mesFacturacionPro1, nombrePro1, idPro1);
        Empleado[] emps = new Empleado[3];

        emps[0] = fijo1;
        emps[1] = fijo2;
        emps[2] = provedor;

        for (int i = 0; i < 3; i++) {
            int mes = 0;
            if (i == 0) {
                mes = mesALiquidar1;
            } else if (i == 1) {
                mes = mesALiquidar2;
            } else {
                mes = mesALiquidarPro;
            }
            calcularSalarios(emps[i], mes);
        }

    }

}
