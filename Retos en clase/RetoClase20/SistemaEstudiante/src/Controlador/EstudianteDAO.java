package Controlador;

import Modelos.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karen Benedetti M
 */
public class EstudianteDAO {

    public static boolean guardar(Estudiante estudiante) {
        boolean respuesta = false;
        Connection conect = Conexion.conectar();
        String sql = "INSERT INTO Estudiantes (documento,nombre, genero, ciclo, estado)" + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement psm = conect.prepareStatement(sql);
            psm.setInt(1, estudiante.getDocumento());
            psm.setString(2, estudiante.getNombre());
            psm.setString(3, estudiante.getGenero());
            psm.setString(4, estudiante.getCiclo());
            psm.setBoolean(5, estudiante.isEstado());
            psm.executeUpdate();
            respuesta = true;

        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (conect != null) {
            try {
                conect.close();
            } catch (SQLException ex) {
                Logger.getLogger(EstudianteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return respuesta;
    }

    public static ArrayList<Estudiante> listar() {
        Connection con = Conexion.conectar();
        String sql = "SELECT * FROM estudiantes";
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        try {
            //Prepara la sentencia SQL a ejecutar
            PreparedStatement sp = con.prepareStatement(sql);
            ResultSet rs;
            //Ejecuata la sentencia y retorna los datos
            rs = sp.executeQuery();
            while (rs.next()) {
                Estudiante estudiante = new Estudiante();

                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setEstado(rs.getBoolean("estado"));
                estudiante.setCiclo(rs.getString("ciclo"));
                estudiante.setGenero(rs.getString("genero"));
                listaEstudiantes.add(estudiante);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(EstudianteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaEstudiantes;

    }

}
