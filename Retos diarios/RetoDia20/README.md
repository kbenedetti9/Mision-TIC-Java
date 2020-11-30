Vamos a continuar con el desarrollo de nuestra aplicación. Ten presente que continuaremos usando las
clases desarrolladas en las sesiones anteriores, así como la base de datos mydb.db. Remember to add
the sqllite jar to your libraries.
1. Crea una clase Conexión
a. Atributos:
i. String url
ii. Connection conexion
b. Métodos:
i. conectar() – Abre la conexion a la base de datos para el url que fue asignado a la
instancia.
ii. cerrarConexion() – Cierra conexion
iii. get y set para todos los atributos.
2. Modifica la clase Empleado:
a. Cambia el tipo de dato de salario a un String. Debes realizar ajustes al constructor, los
métodos get y set y todos los que hagan llamado a estos.
b. Elimina el AtomicInteger pues la generación automática de los id los hará la base de
datos.
c. Crea un constructor adicional que reciba todos los campos de Empleado en el siguiente
orden: id, nombre, apellido, correo, celular, esProveedor, salario, cargo.
d. Crea un constructor adicional que reciba los siguientes campos de Empleado en el
siguiente orden: nombre, apellido, correo, celular, esProveedor, salario, cargo.
e. Adiciona a la clase Empleado los siguientes métodos:
i. Crear() – inserta un empleado a la tabla empleados en la base de datos mydb,
basado en los valores de la instancia.
ii. Método estático Leer que retorna un ArrayList<Empleado> - Este método
retorna todos los valores de la tabla empleados.
3. Modifica el método del botón Agregar en el JFrame AgregarEmpleadoFrame para que llama al
nuevo método Crear de la clase Empleado.
4. Modifica el método llenarLista en el JFrame RegistroEmpleadosFrame para que no reciba ningún
parámetro y llene la lista con el método Leer creado.
