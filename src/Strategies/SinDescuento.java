package Strategies;

public class SinDescuento implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal;
    }
}
