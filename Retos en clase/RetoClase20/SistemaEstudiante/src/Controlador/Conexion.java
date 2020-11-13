package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Karen Benedetti M
 */
public class Conexion {

    public static Connection conectar() {
        String url = "jdbc:sqlite:C:\\Users\\Karen Benedetti M\\OneDrive\\Dokument\\Proyectos\\Mision TIC 2022\\Java\\Ciclo 2\\Clase 20\\estudiantes.db";//Contiene la cadena de conexion hacia la base de datos (Java-SQLite)
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(url);
            if (connect != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido conectar a la base de datos\n" + ex.getMessage());
        }
        return connect;

    }
}
