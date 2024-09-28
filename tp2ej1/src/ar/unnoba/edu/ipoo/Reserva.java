package ar.unnoba.edu.ipoo;

import ar.unnoba.edu.ipoo.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Reserva {

    private Cliente cliente;
    private List<Plato> platos;
    private Date fecha;

    public Reserva() {
    }

    public Reserva(Date fecha, Plato plato, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.platos = new ArrayList<Plato>();
        platos.add(plato);
    }

    public Reserva(Date fecha, List<Plato> platos, Cliente cliente) {
        this.fecha = fecha;
        this.platos = platos;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void anadirPlato(Plato plato) {
        this.platos.add(plato);
    }

    // METODOS

    public double descuentoReserva(){
        if (platos.size() > 1) {
            return 0.95;
        }
        return 1;
    }

    public double descuentoCliente(){
        return cliente.getDescueto();
    }

    public double valorReserva() {
        double valorTotal = 0;
        for (Plato plato : platos) {
            valorTotal += plato.getPrecio() * descuentoReserva() * descuentoReserva();
        }
        return valorTotal;
    }

    public int cantidadPlatosReservados() {
        return platos.size();
    }

}
