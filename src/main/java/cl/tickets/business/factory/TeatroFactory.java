package cl.tickets.business.factory;

import cl.tickets.business.Teatro;
import cl.tickets.business.Evento;

import java.util.Date;
import java.util.List;

public class TeatroFactory extends EventoFactory {

    @Override
    public Evento crearEvento(int id, String nombre, Date fecha, int duracion) {
        return null;
    }

    @Override
    public Evento crearEvento(int id, String nombre, Date fecha, int duracion, String director, List<String> actores) {
        return new Teatro(id, nombre, fecha, duracion, director, actores);
    }
}