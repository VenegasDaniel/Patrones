package cl.tickets.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Conexion instance;
    private Connection conn;

    // Constructor privado para evitar instanciación directa
    private Conexion(String dbName) {
        try {
            String url = "jdbc:sqlite:" + dbName;
            conn = DriverManager.getConnection(url);
            System.out.println("Conexión establecida con la base de datos: " + dbName);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método estático para obtener la única instancia
    public static Conexion getInstance(String dbName) {
        if (instance == null) {
            instance = new Conexion(dbName);
        }
        return instance;
    }

    public Connection getConnection() {
        return conn;
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
                instance = null;  // Reiniciar instancia al cerrar conexión
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
