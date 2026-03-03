package Strategies;

public class DescuentoPorcentaje implements DescuentoStrategy {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        double descuento = precioOriginal * (porcentaje / 100);
        return precioOriginal - descuento;
    }
}
