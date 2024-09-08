package ar.unnoba.edu.ipoo;

import java.util.ArrayList;
import java.util.List;

public class ClienteCorreo {
    private List<Correo> enviados;
    private List<Correo> recibidos;
    private List<Contacto> contactos;

    public ClienteCorreo() {
        enviados = new ArrayList<>();
        recibidos = new ArrayList<>();
        contactos = new ArrayList<>();
    }

    public ClienteCorreo(List<Correo> enviados, List<Correo> recibidos, List<Contacto> contactos) {
        this.enviados = enviados;
        this.recibidos = recibidos;
        this.contactos = contactos;
    }

    // getters y setters


    public void setEnviados(List<Correo> enviados) {
        this.enviados = enviados;
    }

    public void setRecibidos(List<Correo> recibidos) {
        this.recibidos = recibidos;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void agregarCorreoEnviados(Correo correo) {
        enviados.add(correo);
    }

    public void agregarCorreoRecibidos(Correo correo) {
        recibidos.add(correo);
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    public void getEnviados() {
        for (Correo correo : enviados) {
            System.out.println(correo);
        }
    }

    public void getRecibidos() {
        for (Correo correo : recibidos) {
            System.out.println(correo);
        }
    }

    public int cantidadCorreos() {
        return enviados.size() + recibidos.size();
    }

    public int cantidadCorreosRecibidos(){
        return recibidos.size();
    }

    public int cantidadCorreosEnviados(){
        return enviados.size();
    }

    public int cantidadCorreosNoLeidos() {
        int noLeidos = 0;
        for (Correo correo : recibidos) {
            noLeidos+= correo.noFueLeido();
        }
        return noLeidos;
    }

    public int cantidadContactos () {
        return contactos.size();
    }
}
