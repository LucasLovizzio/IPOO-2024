package ar.unnoba.edu.ipoo;

import ar.unnoba.edu.ipoo.*;
import java.util.ArrayList;
import java.util.List;

public class Comedor{

    private String direccion;
    private int telefono;
    private List<Reserva> reservas;

    public Comedor() {
    }

    public Comedor(List<Reserva> reservas, int telefono, String direccion) {
        this.reservas = reservas;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Comedor(String direccion, int telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.reservas = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void agregarReservas(List<Reserva> reservas) {
        this.reservas.addAll(reservas);
    }

    public double valorReserva(Reserva reserva) {
        return reserva.valorReserva();
    }

    public int totalPlatosReservados() {
        int total = 0;
        for (Reserva reserva : reservas) {
            total += reserva.cantidadPlatosReservados();
        }
        return total;
    }

    public double totalValorReservas(){
        double total = 0;
        for (Reserva reserva : reservas) {
            total += reserva.valorReserva();
        }
        return total;
    }

    public Reserva reservaMasPlatos() {
        Reserva reservaConMasPlatos = null;
        int cantidadPlatos = 0;
        for (Reserva reserva : reservas) {
            if (reserva.cantidadPlatosReservados() > cantidadPlatos) {
                reservaConMasPlatos = reserva;
                cantidadPlatos = reserva.cantidadPlatosReservados();
            }
        }
        return reservaConMasPlatos;
    }
}
