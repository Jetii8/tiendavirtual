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
    public static void main(String[] args) {
        // Crear algunos productos
        Producto producto1 = new Producto("Camiseta", 20.0);
        Producto producto2 = new Producto("Pantalón", 30.0);
        Producto producto3 = new Producto("Zapatos", 50.0);

        // Mostrar los productos
        System.out.println("Productos disponibles:");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
    }
}
