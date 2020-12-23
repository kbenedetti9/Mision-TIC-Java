package carritodecompras;

import java.util.ArrayList;

/**
 *
 * @author Karen Benedetti M
 */
public class ListadoDeProductos {

    private ArrayList<Producto> productosEnTienda = new ArrayList<>();

    public ArrayList<Producto> getProductosEnTienda() {
        return productosEnTienda;
    }

    public void setProductosEnTienda(ArrayList<Producto> productosEnTienda) {
        this.productosEnTienda = productosEnTienda;
    }

    public boolean insertarProducto(Producto productoAAgregar) {
        return productosEnTienda.add(productoAAgregar);
    }

    public void listarProductosEnTienda() {
        int i = 0;
        System.out.println("[Productos en Tienda]");
        for (Producto p : productosEnTienda) {
            System.out.println(i++ + " " + p.getNombre());
        }
    }
}
