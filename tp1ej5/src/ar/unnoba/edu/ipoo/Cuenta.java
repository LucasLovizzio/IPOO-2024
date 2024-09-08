package ar.unnoba.edu.ipoo;

import java.util.Objects;

public class Cuenta {
    private String nombre;
    private String direccionMail;
    private String direccionServerEntrada;
    private String direccionServerSalida;

    public Cuenta() {

    }

    public Cuenta(String nombre, String direccionMail) {
        this.nombre = nombre;
        this.direccionMail = direccionMail;
    }

    public Cuenta(String nombre, String direccionMail, String direccionServerEntrada, String direccionServerSalida) {
        this.nombre = nombre;
        this.direccionMail = direccionMail;
        this.direccionServerEntrada = direccionServerEntrada;
        this.direccionServerSalida = direccionServerSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionMail() {
        return direccionMail;
    }

    public void setDireccionMail(String direccionMail) {
        this.direccionMail = direccionMail;
    }

    public String getDireccionServerEntrada() {
        return direccionServerEntrada;
    }

    public void setDireccionServerEntrada(String direccionServerEntrada) {
        this.direccionServerEntrada = direccionServerEntrada;
    }

    public String getDireccionServerSalida() {
        return direccionServerSalida;
    }

    public void setDireccionServerSalida(String direccionServerSalida) {
        this.direccionServerSalida = direccionServerSalida;
    }

    // metodos


    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", direccionMail='" + direccionMail + '\'' +
                ", direccionServerEntrada='" + direccionServerEntrada + '\'' +
                ", direccionServerSalida='" + direccionServerSalida + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cuenta cuenta = (Cuenta) o;
        return Objects.equals(nombre, cuenta.nombre) && Objects.equals(direccionMail, cuenta.direccionMail) && Objects.equals(direccionServerEntrada, cuenta.direccionServerEntrada) && Objects.equals(direccionServerSalida, cuenta.direccionServerSalida);
    }

}
