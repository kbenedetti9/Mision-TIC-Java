
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private String url;
    private Connection conexion;

    public Conexion(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

//    public Connection conectar() throws ClassNotFoundException {
//        Class.forName("org.sqlite.JDBC");
//        try {
//            conexion = DriverManager.getConnection("jdbc:sqlite:" + url);
//        } catch (SQLException ex) {
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println("Conectado con éxito");
//        return conexion;
//    }
    public void conectar() throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:" + url);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Conectado con éxito");
    }

    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
