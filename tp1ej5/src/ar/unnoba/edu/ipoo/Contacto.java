package ar.unnoba.edu.ipoo;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String direccionMail;

    public Contacto() {
    }

    public Contacto(String nombre, String direccionMail) {
        this.nombre = nombre;
        this.direccionMail = direccionMail;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre) && Objects.equals(direccionMail, contacto.direccionMail);
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", direccionMail='" + direccionMail + '\'' +
                '}';
    }
}
