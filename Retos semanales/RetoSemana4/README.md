CRUD (Create Read Update Delete) – Empleados
Realizar una aplicación grafica en java usando Swing y JFrame el cual implemente a nivel de base
de datos las cuatro operaciones básicas de persistencia de datos: Crear, Leer, Actualizar y Borrar.
Estas operaciones las desarrollaremos sobre la clase Empleado definida a continuación.
Clase Empleado
• Atributos:
o long id (Autogenerado), String nombre, String apellido, String correo, String
celular, Boolean esProveedor, String salario, String cargo
• Método Constructor:
o Los parámetros esenciales para poder crear objetos de esta clase son: nombre,
correo, celular, salario
• Métodos get and set de todos sus atributos.
Importante: Crear la base de datos sqlite3 con el nombre mydb.db (Colocar el archivo en la
carpeta del proyecto al mismo nivel que build, src, test, … la idea con esto es tener mayor facilidad
de acceso) y la tabla empleados, las columnas de la tabla empleados son los atributos de clase
Empleado configurarlos con sus respectivos tipos de dato y sus respectivas restricciones.
Vistas y funcionamiento SUGERIDO
A continuación, hay una imagen de la vista inicial donde tenemos un botón para agregar nuevos
empleados, otro botón para actualizar la lista nos muestra los empleados ya creados (inicialmente
esta lista debe estar vacía). Si damos en clic en agregar o en algún empleado de la lista nos abrirá
una nueva ventana
En caso de dar clic en agregar nuevo
empleado, se nos mostrará una
ventana donde tenemos los
respectivos campos de la clase
Empleado para su asignación
correspondiente. Si todo está según
las restricciones del modelo, el
guardado debe ser exitoso.
Por otra parte, en caso de dar clic en
algún elemento de la lista nos abrirá
una ventana donde tendremos un
label que nos indicará el id del
empleado y los mismos campos de la
clase Empleado, el cual nos permitirá
realizar modificaciones sobre los
valores ya establecidos. En caso de
dar clic en el botón actualizar
empleado, este deberá permitir su
actualización siempre y cuando los
campos cumplan con las
restricciones, y en caso de dar clic en
eliminar este debe eliminar el
registro en cuestión.
