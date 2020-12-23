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

    public void pagar(String medioDePago, double total) {
        System.out.println("Resumen de pago");
        System.out.println("Medio de pago: " + medioDePago);
        System.out.println("Valor a pagar: " + total);
    }

    public void pagar(String medioDePago, double total, int cuotas) {
        System.out.println("Resumen de pago");
        System.out.println("Medio de pago: " + medioDePago);
        System.out.println("Valor a pagar: " + total);
        System.out.println("Numero de cuotas: " + cuotas);

    }

}
