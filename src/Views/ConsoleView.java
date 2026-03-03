package Views;

import Models.Producto;

public class ConsoleView {

    public void mostrarBienvenida() {
        System.out.println("========================================");
        System.out.println("     SISTEMA DE TIENDA");
        System.out.println("========================================");
        System.out.println();
    }

    public void mostrarProducto(Producto producto) {
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio Base: $" + String.format("%.2f", producto.getPrecioBase()));
    }

    public void mostrarPrecioConDescuento(Producto producto) {
        System.out.println("Precio Final: $" + String.format("%.2f", producto.calcularPrecioFinal()));
    }

    public void mostrarSeparador() {
        System.out.println("----------------------------------------");
        System.out.println();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarError(String error) {
        System.out.println("ERROR: " + error);
    }
}
