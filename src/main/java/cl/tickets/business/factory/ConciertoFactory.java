package cl.tickets.business.factory;

import cl.tickets.business.Concierto;
import cl.tickets.business.Evento;

import java.util.Date;

public class ConciertoFactory extends EventoFactory {

    @Override
    public Evento crearEvento(int id, String nombre, Date fecha, int duracion) {
        // Aquí creamos y devolvemos un evento de tipo Concierto
        return new Concierto(id, nombre, fecha, duracion);
    }
}