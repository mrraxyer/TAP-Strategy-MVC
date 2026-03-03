package Models;

import Strategies.DescuentoStrategy;
import Strategies.SinDescuento;

public class Producto {
    private String nombre;
    private double precioBase;
    private DescuentoStrategy estrategiaDescuento;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.estrategiaDescuento = new SinDescuento(); // Estrategia por defecto
    }

    public void setEstrategiaDescuento(DescuentoStrategy estrategiaDescuento) {
        this.estrategiaDescuento = estrategiaDescuento;
    }

    public double calcularPrecioFinal() {
        return estrategiaDescuento.aplicarDescuento(precioBase);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public DescuentoStrategy getEstrategiaDescuento() {
        return estrategiaDescuento;
    }
}
