Ya generado las clases del modelo, vamos a proceder con la creación de la vista principal.
1. Modifica las clases Estudiante, Profesor y Curso para incluir los métodos:
a. crear – recibe todos los campos excepto id e ingresa el registro en la base de datos.
b. leer – en este caso retorna todos los registros de la tabla.
c. actualizar – recibe todos los campos y actualiza el registro en la tabla.
d. borrar – recibe el id de la tabla y elimina el registro.
2. Crea un JFrame llamado Dashboard.java que tenga la siguiente configuración:
3 Jlist para estudiante, profesor y curso.
3 Botones para agregar debajo de cada Jlist

Crea un método llenarListaProfesor() dentro del JFrame que llame al método leer() previamente
creado en la clase Profesor y llene la lista como “Profesor <nombre> – id: <id>”.
Ejemplo: Profesor Jose – id: 1
4. Crea un método llenarListaEstudiante() dentro del JFrame que llame al método leer()
previamente creado en la clase Estudiante y llene la lista como “Estudiante <nombre> – id: <id>”.
Ejemplo: Estudiante Maria – id: 3
5. Crea un método llenarListaCurso() dentro del JFrame que llame al método leer() previamente
creado en la clase Curso y llene la lista como “Curso <nombre>”.
Ejemplo: Curso Calculo
