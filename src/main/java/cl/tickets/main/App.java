package cl.tickets.main;

import cl.tickets.business.Administrador;
import cl.tickets.business.Evento;
import cl.tickets.persistencia.Conexion;

public class App {

    public static void main (String[]args){

        // Obtener la instancia de la conexión con Singleton
        Conexion conexion = Conexion.getInstance("sistema_ticket.sqlite");

        Administrador adm = new Administrador();
        adm.setUsername("jperez");
        adm.setPassword("(-QF&Q=IN2nFBx");

        // Crear un evento de tipo teatro
        Evento evento = adm.crearEvento("teatro");

        // Guardar administrador y evento
        adm.guardarAdministrador(conexion);
        evento.guardarEvento(conexion);

        // Cerrar la conexión
        conexion.close();
    }
}
