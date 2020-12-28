## Empleado

Objetivos:
- Trabajar con MVC y mostrar el desarrollo de la aplicación

Partes del programa
1. Modificar la base de datos mydb.db para adicionar un campo booleano Activo (True-Activo, False-Inactivo )
2. Crear los paquetes para el modelo, vista y controlador y mover las clases existentes (Conexion y Empleado)
dentro de los paquetes correspondientes. 
3. Modificar la clase Empleado para que tenga los siguientes campos:
    -	long id (Autogenerado)
    -	String nombre
    -	String apellido
    -	String correo
    -	String celular
    -	Boolean esProveedor
    -	String salario
    -	String cargo 
    -	Boolean activo
3. Crear todos los métodos get y set de la clase Empleado
4. Crear una clase GestionarEmpleados que incluya un método consultarEmpleados() 
    solicite todos los valores de la clase empleados y retorne un objeto con cada 
    uno de los empleados registrados en la base de datos.
5. Adicionar una variable estática a la clase GestionarEmpleados que tenga los nombres de las
    columnas de la tabla Empleado.
5. Crear un JFrame con una JTable para ser llenada desde el controlador
6. Crear una clase Controlador que reciba el frame y llene la tabla consultando los datos a través del modelo.
