package carritodecompras;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class CarritoDeCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        //Lista de productos
        Producto p1 = new Producto("Leche deslactosada", 3500, "0001");
        Producto p2 = new Producto("Pan tajado Bimbo", 4000, "0002");

        ListadoDeProductos listaProductosTienda = new ListadoDeProductos();
        listaProductosTienda.insertarProducto(p1);
        listaProductosTienda.insertarProducto(p2);

        //ArrayList Clientes
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        //Instancia de Cliente
        Cliente cliente = new Cliente();

        //ArrayList de Canasta
//        ArrayList<Canasta> listaCanastas = new ArrayList<>();
        boolean estadoSistema = true;
        boolean clienteExistente = false;
        int opcionOtroProducto = 1;

        do {
            int opcionTerminarCliente = 2;
            boolean estadoCliente = true;
            //Instancia de Canasta
            Canasta canasta = new Canasta();
            //MENSAJE PARA INICIAR VENTA
            System.out.println("SISTEMA DE FACTURACION TIENDA XX");
            System.out.println("Para iniciar el proceso de compra registre los datos del cliente");
            //PROCESO PARA INGRESAR DATOS DE CLIENTE
            System.out.print("Nombre Completo: ");
            String nombre = lector.next();
            System.out.print("Numero de documento: ");
            int cedula = lector.nextInt();
            Cliente nuevoCliente = new Cliente(cedula, nombre);
            //VALIDANDO SI EL CLIENTE YA EXISTE
            clienteExistente = cliente.verificarClienteExistente(nuevoCliente, listaClientes);
            if (!clienteExistente) {
                listaClientes = cliente.agregarCliente(nuevoCliente, listaClientes);//Agregando cliente
            }
            String mensaje = clienteExistente ? "El cliente ya existe!" : "Cliente agregado con exito!";
            System.out.println(mensaje);
            do {
                //MENU DE ACCIONES PARA CLIENTE
                System.out.println("1. Agregar Producto al Carro");
                System.out.println("2. Borrar Producto del Carro");
                System.out.println("3. Mostrar Productos del Carro");
                System.out.println("4. Pagar");
                int opcion = lector.nextInt();
                switch (opcion) {
                    case 1:
                        do {
                            listaProductosTienda.listarProductosEnTienda();
                            System.out.println("Digita el numero del producto que deseas agregar");
                            int numProductoAComprar = lector.nextInt();
                            Producto productoAComprar = listaProductosTienda.getProductosEnTienda().get(numProductoAComprar);
                            canasta.insertarProducto(productoAComprar);
                            System.out.println("Quiere agregar otro producto [1]Si [2]No");
                            opcionOtroProducto = lector.nextInt();
                            nuevoCliente.setCanastaDeCliente(canasta);
                        } while (opcionOtroProducto == 1);
                        break;
                    case 2:
                        break;
                    case 3:
                        canasta.listarProductosEnCanasta();
                        break;
                    case 4:
                        canasta.calcularTotal();
                        System.out.println("[MEDIOS DE PAGO]");
                        System.out.println("[0]Efectivo [1]Tarjeta de credito");
                        System.out.println("Digite el numero que corresponda medio de pago");
                        int medioDePago = lector.nextInt();

                        if (medioDePago == 1) {
                            System.out.println("Ingrese el numero de cuotas");
                            int numCuotas = lector.nextInt();
                            nuevoCliente.pagar(medioDePago, nuevoCliente.getCanastaDeCliente(), numCuotas);
                        } else {
                            nuevoCliente.pagar(medioDePago, nuevoCliente.getCanastaDeCliente());
                        }
                        break;
                }

                //CERRAR PROCESO CON EL CLIENTE
                System.out.println("Ha terminado el proceso con el cliente [1]Si [2]No");
                opcionTerminarCliente = lector.nextInt();
                if (opcionTerminarCliente == 1) {
                    estadoCliente = false;
                } else {
                    estadoCliente = true;
                }

            } while (opcionTerminarCliente == 2);

            //CERRAR SISTEMA
            System.out.println("Quiere salir [1]Si [2]No");
            int opcionSalir = lector.nextInt();
            if (opcionSalir == 1) {
                estadoSistema = false;
            } else {
                estadoSistema = true;
            }
        } while (estadoSistema);
    }
}
