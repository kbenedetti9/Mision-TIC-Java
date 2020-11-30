//package retosemana5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karen Benedetti M
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            long id = Long.parseLong(lector.nextLine());
            String nombre = lector.nextLine();
            String correo = lector.nextLine();
            int edad = Integer.parseInt(lector.nextLine());

            Profesor profesor = new Profesor(id, nombre, correo, edad);
            profesor.crear();
        }

        for (int i = 0; i < 5; i++) {
            long id = Long.parseLong(lector.nextLine());
            String nombre = lector.nextLine();
            String celular = lector.nextLine();
            int edad = Integer.parseInt(lector.nextLine());

            Estudiante estudiante = new Estudiante(id, nombre, celular, edad);
            estudiante.crear();
        }

        for (int i = 0; i < 4; i++) {
            long id = Long.parseLong(lector.nextLine());
            String nombre = lector.nextLine();
            int capacidad = Integer.parseInt(lector.nextLine());

            Curso curso = new Curso(id, nombre, capacidad);
            curso.crear();
        }

        for (int i = 0; i < 16; i++) {
            int operacion = Integer.parseInt(lector.nextLine());
            String op = lector.nextLine();
            String[] ids = op.split(" - ");

            if (operacion == 1) {
                int idProfesor = Integer.parseInt(ids[0]);
                int idCurso = Integer.parseInt(ids[1]);

                Curso.agregarCurso(idCurso, idProfesor);

            } else {

                int idEstudiante = Integer.parseInt(ids[0]);
                int idCurso = Integer.parseInt(ids[1]);

                Estudiante.agregarCurso(idEstudiante, idCurso);

            }
        }

        long idProfesor = Long.parseLong(lector.nextLine());

        ArrayList<Curso> cursos = Curso.consultarCursoPorProfesor(idProfesor);

        for (Curso cursoRecorrido : cursos) {
            System.out.println("Curso: " + cursoRecorrido.getId() + " - " + cursoRecorrido.getNombre()
                    + " - " + cursoRecorrido.getCapacidad());
        }

        idProfesor = Long.parseLong(lector.nextLine());

        ArrayList<Estudiante> estudiantes = Estudiante.consultarEstudiantePorProfesor(idProfesor);

        for (Estudiante estudianteRecorrido : estudiantes) {
            System.out.println("Estudiante: " + estudianteRecorrido.getId() + " - " + estudianteRecorrido.getNombre() + " - "
                    + estudianteRecorrido.getEdad());
        }
        
        long idCurso = Long.parseLong(lector.nextLine());
        
        estudiantes = Estudiante.consultarEstudiantePorCurso(idCurso);
        
        for (Estudiante estudianteRecorrido : estudiantes) {
            System.out.println("Estudiante: " + estudianteRecorrido.getId() + " - " + estudianteRecorrido.getNombre() + " - "
                    + estudianteRecorrido.getEdad());
        }

    }
}
