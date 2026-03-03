package Strategies;

public class DescuentoFijo implements DescuentoStrategy {
    private double montoDescuento;

    public DescuentoFijo(double montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        return Math.max(0, precioOriginal - montoDescuento);
    }
}
