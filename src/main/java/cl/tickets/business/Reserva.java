package cl.tickets.business;

import java.util.Date;
import java.util.List;

public class Reserva {

    private int id;
    private int cantidad;
    private Date fecha;
    private int precioTotal;
    private String estadoReserva;
    private List<Butaca> butacas;

    // Constructor privado para el patrón Builder
    private Reserva(Builder builder) {
        this.id = builder.id;
        this.cantidad = builder.cantidad;
        this.fecha = builder.fecha;
        this.precioTotal = builder.precioTotal;
        this.estadoReserva = builder.estadoReserva;
        this.butacas = builder.butacas;
    }

    // Getters
    public int getId() { return id; }
    public int getCantidad() { return cantidad; }
    public Date getFecha() { return fecha; }
    public int getPrecioTotal() { return precioTotal; }
    public String getEstadoReserva() { return estadoReserva; }
    public List<Butaca> getButacas() { return butacas; }

    // Clase Builder
    public static class Builder {
        private int id;
        private int cantidad;
        private Date fecha;
        private int precioTotal;
        private String estadoReserva;
        private List<Butaca> butacas;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setCantidad(int cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public Builder setFecha(Date fecha) {
            this.fecha = fecha;
            return this;
        }

        public Builder setPrecioTotal(int precioTotal) {
            this.precioTotal = precioTotal;
            return this;
        }

        public Builder setEstadoReserva(String estadoReserva) {
            this.estadoReserva = estadoReserva;
            return this;
        }

        public Builder setButacas(List<Butaca> butacas) {
            this.butacas = butacas;
            return this;
        }

        public Reserva build() {
            return new Reserva(this);
        }
    }
}
