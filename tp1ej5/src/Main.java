//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package ar.unnoba.edu.ipoo;



public class Main {
    public static void main(String[] args) {
        // Crear algunos contactos
        Contacto contacto1 = new Contacto("Juan Pérez", "juan.perez@example.com");
        Contacto contacto2 = new Contacto("María García", "maria.garcia@example.com");

        // Crear una cuenta
        Cuenta cuenta = new Cuenta("Juan Pérez", "juan.perez@example.com", "imap.example.com", "smtp.example.com");

        // Crear un correo
        Correo correo = new Correo("Reunión", "La reunión será mañana a las 10 AM.", false, contacto1);
        correo.agregarDestinatario(contacto2); // Agregar destinatario

        // Crear un cliente de correo y agregar el correo enviado
        ClienteCorreo clienteCorreo = new ClienteCorreo();
        clienteCorreo.agregarCorreoEnviados(correo);

        // Agregar contactos al cliente de correo
        clienteCorreo.agregarContacto(contacto1);
        clienteCorreo.agregarContacto(contacto2);

        // Mostrar contactos, correos enviados y recibidos
        System.out.println("Contactos:");
        clienteCorreo.getContactos().forEach(System.out::println);

        System.out.println("\nCorreos Enviados:");
        clienteCorreo.getEnviados();

        // Verificar la cantidad de correos y contactos
        System.out.println("\nCantidad de correos enviados: " + clienteCorreo.cantidadCorreosEnviados());
        System.out.println("Cantidad de contactos: " + clienteCorreo.cantidadContactos());
    }
}
