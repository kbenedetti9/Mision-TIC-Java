package carritodecompras;

import java.util.ArrayList;

/**
 *
 * @author Karen Benedetti M
 */
public class Canasta {

    private double total;
    private ArrayList<Producto> productosEnCanasta = new ArrayList<>();

    public Canasta() {
    }

    public double getTotal() {
        return total;
    }

//    public void setTotal(double total) {
//        this.total = total;
//    }
    public boolean insertarProducto(Producto productoACanasta) {
        System.out.println("El producto ha sido agregado con exito!");
        return productosEnCanasta.add(productoACanasta);
    }

    public boolean borrarProducto(int productoAEliminar) {

        try {

            productosEnCanasta.remove(productoAEliminar);
            return true;
        } catch (Exception ex) {
            System.out.println("No se pudo eliminar el producto de la canasta");
        }
        return false;
    }

    public void listarProductosEnCanasta() {
        int i = 0;
        System.out.println("Productos en la Canasta");

        if (productosEnCanasta.isEmpty()) {
            System.out.println("No hay productos en la canasta");
        }
        for (Producto p : productosEnCanasta) {
            System.out.println(i++ + " " + p.getNombre());
        }
    }

    public double calcularTotal() {
        int i = 0;
        for (Producto p : productosEnCanasta) {
            total += p.getPrecio();
        }
        return total;
    }

}
