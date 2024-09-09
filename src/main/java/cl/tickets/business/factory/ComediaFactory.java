package cl.tickets.business.factory;

import cl.tickets.business.Comedia;
import cl.tickets.business.Evento;

import java.util.Date;

public class ComediaFactory extends EventoFactory {

    @Override
    public Evento crearEvento(int id, String nombre, Date fecha, int duracion) {
        // Aquí creamos y devolvemos un evento de tipo Comedia
        return new Comedia(id, nombre, fecha, duracion);
    }
}