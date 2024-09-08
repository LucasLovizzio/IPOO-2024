package ar.unnoba.edu.ipoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Correo {
    private String asunto;
    private String texto;
    private Boolean leido;
    private Contacto contacto;
    private List<Contacto> destinatarios;

    public Correo() {
    }

    public Correo(String asunto, String texto, Boolean leido, Contacto contacto) {
        this.asunto = asunto;
        this.texto = texto;
        this.leido = leido;
        this.contacto = contacto;
        this.destinatarios = new ArrayList<>();
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Boolean getLeido() {
        return leido;
    }

    public void setLeido(Boolean leido) {
        this.leido = leido;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public List<Contacto> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(List<Contacto> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public void agregarDestinatario(Contacto destinatario) {
        this.destinatarios.add(destinatario);
    }

    public void eliminarDestinatario(Contacto destinatario) {
        this.destinatarios.remove(destinatario);
    }

    public int fueLeido () {
        if (Boolean.TRUE.equals(this.leido)) {
            return 1;
        }
        return 0;
    }

    public int noFueLeido () {
        if (Boolean.FALSE.equals(this.leido)) {
            return 1;
        }
        return 0;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Correo correo = (Correo) o;
        return Objects.equals(getAsunto(), correo.getAsunto()) && Objects.equals(getTexto(), correo.getTexto()) && Objects.equals(getLeido(), correo.getLeido()) && Objects.equals(getContacto(), correo.getContacto()) && Objects.equals(getDestinatarios(), correo.getDestinatarios());
    }

    @Override
    public String toString() {
        return "Correo{" +
                "asunto='" + asunto + '\'' +
                ", texto='" + texto + '\'' +
                ", leido=" + leido +
                ", contacto=" + contacto +
                ", destinatarios=" + destinatarios +
                '}';
    }
}
