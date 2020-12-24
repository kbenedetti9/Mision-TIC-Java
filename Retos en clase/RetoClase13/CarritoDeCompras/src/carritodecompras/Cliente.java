package carritodecompras;

import java.util.ArrayList;

/**
 *
 * @author Karen Benedetti M
 */
public class Cliente extends Persona {

    private Canasta canastaDeCliente;

    public Cliente() {
    }

    public Cliente(int doc, String nombre) {
        super(doc, nombre);
    }

    public Canasta getCanastaDeCliente() {
        return canastaDeCliente;
    }

    public void setCanastaDeCliente(Canasta canastaDeCliente) {
        this.canastaDeCliente = canastaDeCliente;
    }

    public boolean verificarClienteExistente(Cliente nuevoCliente, ArrayList<Cliente> listaCliente) {
        return listaCliente.contains(new Cliente(nuevoCliente.getDoc(), nuevoCliente.getNombre()));
    }

    public ArrayList<Cliente> agregarCliente(Cliente nuevoCliente, ArrayList<Cliente> listaCliente) {
        listaCliente.add(nuevoCliente);
        return listaCliente;
    }

    public void pagar(int medioDePago, Canasta canastaAPagar) {
        System.out.println("Resumen de pago");
        System.out.println("Medio de pago: Efectivo");
        System.out.println("Valor a pagar: " + canastaAPagar.calcularTotal());
    }

    public void pagar(int medioDePago, Canasta canastaAPagar, int cuotas) {
        System.out.println("Resumen de pago");
        System.out.println("Medio de pago: Tarjeta de credito");
        System.out.println("Valor a pagar: " + canastaAPagar.calcularTotal());
        System.out.println("Numero de cuotas: " + cuotas);

    }

}
