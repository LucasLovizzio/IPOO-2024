import ar.unnoba.edu.ipoo.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear monedas
        Moneda yen = new Yen(1000);
        Moneda euro = new Euro(500);
        Moneda dolar = new Dolar(1200);

        // Crear banco
        Banco banco = new Banco("Banco Central", "Buenos Aires", dolar);

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", "Pérez", 12345678);
        Cliente cliente2 = new Cliente("Maria", "Gonzalez", 87654321);
        Cliente cliente3 = new Cliente("Pedro", "Lopez", 11223344);
        Cliente cliente4 = new Cliente("Ana", "Martinez", 55667788);

        // Añadir clientes al banco
        banco.anadirCliente(cliente1);
        banco.anadirCliente(cliente2);
        banco.anadirCliente(cliente3);
        banco.anadirCliente(cliente4);

        // Crear transacciones
        Transaccion transaccionNacional1 = new TransaccionNacional(new Date(), 5000.0, banco, cliente1);
        Transaccion transaccionNacional2 = new TransaccionNacional(new Date(), 2000.0, banco, cliente2);
        Transaccion transaccionInternacional1 = new TransaccionInternacional(new Date(), 10000.0, banco, cliente3);
        Transaccion transaccionInternacional2 = new TransaccionInternacional(new Date(), 7500.0, banco, cliente4);

        // Cambiar moneda del banco a Euro para ver cómo afectan las transacciones
        banco.setMoneda(euro);

        // Añadir transacciones al banco
        banco.anadirTransaccion(transaccionNacional1);
        banco.anadirTransaccion(transaccionNacional2);
        banco.anadirTransaccion(transaccionInternacional1);
        banco.anadirTransaccion(transaccionInternacional2);

        // Mostrar resultados
        System.out.println("Cantidad total de transacciones: " + banco.cantidadTotalDeTransacciones());
        System.out.println("Monto total de transacciones: " + banco.montoTotalDeTransacciones());
        System.out.println("Impuestos a cobrar: " + banco.impuestosACobrar());

        // Detalles de cada transacción
        System.out.println("\nDetalles de las transacciones:");
        for (Transaccion transaccion : banco.getTransacciones()) {
            System.out.println("Transacción: ");
            System.out.println("Cliente Origen: " + transaccion.getClienteOrigen().getNombre() + " " + transaccion.getClienteOrigen().getApellido());
            System.out.println("Monto en pesos: " + transaccion.montoEnPesos());
            System.out.println("Impuesto: " + transaccion.impuesto());
            System.out.println();
        }

        // Probar método para ver impuestos de una transacción específica
        System.out.println("Impuesto a cobrar de la primera transacción nacional: " + banco.impuestoACobrarDe(transaccionNacional1));
    }
}
