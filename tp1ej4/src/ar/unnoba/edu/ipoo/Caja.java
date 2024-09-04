package ar.unnoba.edu.ipoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Caja extends Producto{

    private List<Simple> productos;

    public Caja(String nombre, Date fechaDeVencimiento, float valor, float peso) {
        super(nombre, fechaDeVencimiento);
        productos = new ArrayList<>();
    }

    // Getters y Setters

    public List<Simple> getProductos() {
        return productos;
    }

    public void setProductos(List<Simple> productos) {
        this.productos = productos;
    }


    // Metodos

    public void anadirProducto(Simple producto) {
        productos.add(producto);
    }

    public float getValor() {
        float valorTotal = 0;
        for (Simple producto : productos) {
            valorTotal += producto.getValor();
        }
        return valorTotal;
    }

    public float getPeso() {
        float pesoTotal = 0;
        for (Simple producto : productos) {
            pesoTotal += producto.getPeso();
        }
        return pesoTotal;
    }
}
