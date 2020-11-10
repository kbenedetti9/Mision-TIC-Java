Vamos ahora a desarrollar nuestra primera interfaz gráfica. Ten presente que vamos a usar la clase
Empleado que se desarrolló en la sesión anterior y que en este caso en particular las pruebas no se
realizarán un CodeGrade sino en tu propia máquina.
1. Crea un JFrame en tu proyecto llamado AgregarEmpleadoFrame que tenga la siguiente
configuración:
OJO Los nombres adicionados son para usarlos como referencia y debes asegurarte de que los
campos mostrados contengan esos nombres para que el programa pueda ser calificado por
CodeGrade.
2. Dentro de la acción del button jButton1 debes crear una instancia de la clase Empleado con los
valores que hacen parte del constructor y llamar a setXXX para todos los otros valores. Una vez
realizada la operación de crear la instancia, imprime un mensaje a consola (System.out.println)
que diga “Empleado Creado”.
Consideraciones:
1. Si no vas a usar las clases que te entregamos sino que creas tu propio JFrame en NetBeans, ten
presente que debes adicionar el método setNombresComponentes() y modificar el constructor
como se ve en la siguiente figura.