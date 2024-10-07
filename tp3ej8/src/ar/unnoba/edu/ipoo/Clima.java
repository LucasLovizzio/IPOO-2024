package ar.unnoba.edu.ipoo;

import java.time.LocalDateTime;

public class Clima {
    private String ciudad;
    private String provincia;
    private String pais;
    private double temperaturaActual;
    private double temperaturaMinima;
    private double temperaturaMaxima;
    private char escala; // 'C' para Celsius, 'F' para Fahrenheit
    private double presion;
    private double velocidadViento;
    private String direccionViento;
    private int humedad; // En porcentaje
    private int visibilidad; // En metros o kilómetros
    private LocalDateTime ultimaActualizacion;

    // Constructor

    public Clima() {}

    public Clima(String ciudad, String provincia, String pais, double temperaturaActual, double temperaturaMinima,
                 double temperaturaMaxima, char escala, double presion, double velocidadViento,
                 String direccionViento, int humedad, int visibilidad, LocalDateTime ultimaActualizacion) {
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.temperaturaActual = temperaturaActual;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.escala = escala;
        this.presion = presion;
        this.velocidadViento = velocidadViento;
        this.direccionViento = direccionViento;
        this.humedad = humedad;
        this.visibilidad = visibilidad;
        this.ultimaActualizacion = ultimaActualizacion;
    }

    // Getters y Setters
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public char getEscala() {
        return escala;
    }

    public void setEscala(char escala) {
        this.escala = escala;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public double getVelocidadViento() {
        return velocidadViento;
    }

    public void setVelocidadViento(double velocidadViento) {
        this.velocidadViento = velocidadViento;
    }

    public String getDireccionViento() {
        return direccionViento;
    }

    public void setDireccionViento(String direccionViento) {
        this.direccionViento = direccionViento;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public int getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(int visibilidad) {
        this.visibilidad = visibilidad;
    }

    public LocalDateTime getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(LocalDateTime ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }

    @Override
    public String toString() {
        return "Clima{" +
                "ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", pais='" + pais + '\'' +
                ", temperaturaActual=" + temperaturaActual +
                ", temperaturaMinima=" + temperaturaMinima +
                ", temperaturaMaxima=" + temperaturaMaxima +
                ", escala=" + escala +
                ", presion=" + presion +
                ", velocidadViento=" + velocidadViento +
                ", direccionViento='" + direccionViento + '\'' +
                ", humedad=" + humedad +
                ", visibilidad=" + visibilidad +
                ", ultimaActualizacion=" + ultimaActualizacion +
                '}';
    }
}

