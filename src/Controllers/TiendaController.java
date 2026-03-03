package Controllers;

import Models.*;
import Views.ConsoleView;

public class TiendaController {
    private ConsoleView vista;

    public TiendaController(ConsoleView vista) {
        this.vista = vista;
    }

    public void ejecutarTienda() {
        vista.mostrarBienvenida();

        // Crear productos
        Producto laptop = new Producto("Laptop Gamer", 1500.00);
        Producto camisa = new Producto("Camisa de Algodón", 50.00);

        // Procesar Laptop
        procesarProducto(laptop, "Descuento 20%");
        laptop.setEstrategiaDescuento(new DescuentoPorcentaje(20));
        vista.mostrarPrecioConDescuento(laptop);

        vista.mostrarSeparador();

        procesarProducto(laptop, "Descuento Fijo $200");
        laptop.setEstrategiaDescuento(new DescuentoFijo(200));
        vista.mostrarPrecioConDescuento(laptop);

        vista.mostrarSeparador();

        procesarProducto(laptop, "Sin Descuento");
        laptop.setEstrategiaDescuento(new SinDescuento());
        vista.mostrarPrecioConDescuento(laptop);

        vista.mostrarSeparador();
        vista.mostrarSeparador();

        // Procesar Camisa
        procesarProducto(camisa, "Descuento Temporada");
        camisa.setEstrategiaDescuento(new DescuentoTemporada());
        vista.mostrarPrecioConDescuento(camisa);

        vista.mostrarSeparador();
        vista.mostrarMensaje("Gracias por usar el sistema");
        System.out.println("========================================");
    }

    private void procesarProducto(Producto producto, String tipoDescuento) {
        vista.mostrarProducto(producto);
        vista.mostrarMensaje("Descuento aplicado: " + tipoDescuento);
    }
}
