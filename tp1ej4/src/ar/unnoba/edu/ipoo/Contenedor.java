package ar.unnoba.edu.ipoo;

import java.util.ArrayList;
import java.util.List;

public class Contenedor{

    private int id;
    private String paisDestino;
    private float pesoMaximo;
    private List<Producto> productos;

    // Constructor


    public Contenedor(int id, String paisDestino, float pesoMaximo) {
        this.id = id;
        this.paisDestino = paisDestino;
        this.pesoMaximo = pesoMaximo;
        this.productos = new ArrayList<>();
    }

    // Getters y Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public float getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(float pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    // Metodos

    public void anadirProducto(Producto producto) {
        this.productos.add(producto);
    }

    public float pesoContenedor() {
        float pesoTotal = 0;
        for (Producto producto : productos) {
            pesoTotal+= producto.getPeso();
        }
        return pesoTotal;
    }

    public float pesoProducto(Producto unProducto) {
        return unProducto.getPeso();
    }

    public float valorDeLosProductos() {
        float valorTotal = 0;
        for (Producto producto : productos) {
            valorTotal += producto.getValor();
        }
        return valorTotal;
    }

}
