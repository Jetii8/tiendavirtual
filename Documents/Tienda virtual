import java.util.ArrayList;
import java.util.List;

class Producto {
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}

public class TiendaVirtual {
    // Lista para almacenar los productos
    private static List<Producto> productos = new ArrayList<>();

    // Método para agregar un producto a la lista
    public static void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para mostrar los productos disponibles
    public static void mostrarProductos() {
        System.out.println("Productos disponibles:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    // Método para mostrar el total de productos disponibles
    public static void mostrarTotalProductos() {
        System.out.println("Total de productos disponibles: " + productos.size());
    }

    public static void main(String[] args) {
        // Crear algunos productos
        Producto producto1 = new Producto("Camiseta", 20.0);
        Producto producto2 = new Producto("Pantalón", 30.0);
        Producto producto3 = new Producto("Zapatos", 50.0);

        // Agregar los productos a la lista
        agregarProducto(producto1);
        agregarProducto(producto2);
        agregarProducto(producto3);

        // Mostrar los productos y el total
        mostrarProductos();
        mostrarTotalProductos();
    }
}
