package Strategies;

public class DescuentoTemporada implements DescuentoStrategy {
    private double porcentajeBase;

    public DescuentoTemporada() {
        this.porcentajeBase = 15.0;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        double descuento = precioOriginal * (porcentajeBase / 100);
        return precioOriginal - descuento;
    }
}
