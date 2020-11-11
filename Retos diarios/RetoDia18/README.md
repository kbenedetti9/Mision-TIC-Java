Vamos a continuar con el desarrollo de nuestra interfaz gráfica. Ten presente que continuaremos
usando las clases desarrolladas en las sesiones anteriores (i.e. AgregarEmpleadoFrame y Empleado).
1. Modifica la clase Empleado para que el id del empleado sea un número AutoGenerado.
Pista: Una forma de hacer esto es usando una variable estática y final de tipo AtomicInteger.
Dentro del constructor de la clase puedes usar el método incrementAndGet() para obtener el
siguiente valor de la variable.
2. Crea una nueva clase ManejarEmpleados que tenga un método estático obtenerEmpleados que
retorne un array de Empleados. Por ahora este método va a crear 5 instancias de la clase
Empleado y adicionarlas al array a retornar.
3. Crea un JFrame en tu proyecto llamado RegistroEmpleadosFrame que tenga la siguiente
configuración:
OJO Los nombres adicionados son para usarlos como referencia y debes asegurarte de que los
campos mostrados contengan esos nombres para que el programa pueda ser calificado por
CodeGrade.
a. Dentro de la acción del button jButton1 debes crear una instancia de
AgregarEmpleadoFrame para que se muestre la otra ventana.
b. Crea una función llenarLista(Empleado[] emp) que reciba un array de Empleados y
adicione elementos a la lista (jList1) como “Empleado – id: X“ donde X corresponde al Id 
Generado en las instancias. Pista: Define un DefaultListModel al que adiciones como
elementos los diferentes textos para cada empleado y luego puedes usar el método
setModel de JList para adicionar el modelo creado a la list.
c. Dentro del constructor del Frame, adiciona el llamado al método llenarLista. Puedes
obtener el array de empleados de la clase ManejarEmpleados que creaste
anteriormente.
