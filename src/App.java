import Controllers.TiendaController;
import Views.ConsoleView;

public class App {
    public static void main(String[] args) throws Exception {
        ConsoleView vista = new ConsoleView();

        TiendaController controlador = new TiendaController(vista);

        controlador.ejecutarTienda();
    }
}
