package cl.tickets.business.factory;

import cl.tickets.business.Evento;

import java.util.Date;
import java.util.List;

public abstract class EventoFactory {

    public abstract Evento crearEvento(int id, String nombre, Date fecha, int duracion);

    // Sobrecarga para eventos con parámetros adicionales (Teatro)
    public Evento crearEvento(int id, String nombre, Date fecha, int duracion, String director, List<String> actores) {
        throw new UnsupportedOperationException("Esta fábrica no soporta eventos con director y actores");
    }
}