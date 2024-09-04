import ar.unnoba.edu.ipoo.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Logistica
        Logistica logistica = new Logistica("Logística Internacional", "Av. Siempre Viva 123");

        // Crear algunos contenedores
        Contenedor contenedor1 = new Contenedor(1, "Argentina", 1000f);
        Contenedor contenedor2 = new Contenedor(2, "Brasil", 1500f);

        // Crear algunos productos simples
        Producto producto1 = new Simple("Producto A", new Date(), 100f, 10f);
        Producto producto2 = new Simple("Producto B", new Date(), 200f, 20f);
        Producto producto3 = new Simple("Producto C", new Date(), 300f, 30f);

        // Crear caja y añadir productos
        Caja caja1 = new Caja("Caja 1", new Date(), 0f, 0f);
        caja1.anadirProducto((Simple) producto1);
        caja1.anadirProducto((Simple) producto2);

        // Añadir productos a los contenedores
        contenedor1.anadirProducto(producto1);
        contenedor1.anadirProducto(producto2);
        contenedor2.anadirProducto(producto3);

        // Añadir contenedores a la logistica
        logistica.anadirContenedor(contenedor1);
        logistica.anadirContenedor(contenedor2);

        // Pruebas
        System.out.println("Peso total de los contenedores: " + logistica.pesoContenedores());
        System.out.println("Valor total de los productos en logistica: " + logistica.valorDeTodosLosProductos());
        System.out.println("Peso del contenedor 1: " + contenedor1.pesoContenedor());
        System.out.println("Valor de los productos en el contenedor 1: " + contenedor1.valorDeLosProductos());
        System.out.println("Peso de la caja 1: " + caja1.getPeso());
        System.out.println("Valor de la caja 1: " + caja1.getValor());
    }
}