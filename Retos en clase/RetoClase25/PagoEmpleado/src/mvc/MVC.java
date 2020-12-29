/*
Partes del programa
1. Crear una tabla Pagos en la base de datos con los siguientes campos:
    -	int id (Autogenerado)
    -	int id_empleado (clave foránea)
    -	String valor_pago
    -	String mes
    -	int año

2. Crear una clase Pagos con los campos de la base de datos (un Empleado en lugar de id_empleado),
    adicionalmente crear los métodos set y get, dos constructores, uno con todos los atributos y otro
    con todos excepto el id. Adicionalmente, crear un método crear() para insertar un valor en la base de datos.

3. Crear una clase GestionarPagos() con un método ConsultarPagos() que retorne un ArrayList<Object[]> 
    con todos los pagos de la tabla.

3. Crear un JFrame ListadoPagosFrame que tenga una JTable.

4. Crear un JFramo RegistrarPagoFrame que tenga el id (En el título de la ventana),
   nombre del empleado y su salario, los cuales no se pueden modificar.    
   Adicionalmente una lista desplegable (JComboBox) que mostrará los nombres de los meses, 
   de los cuales se debe seleccionar uno, y otro ComboBox que permita seleccionar 
   un año entre el 2020 y el 2030 y un botón “Ingresar pago”.
   Debe tener un id y un Controlador que se pasan en su constructor

5. Modifica el Controlador
    - Adiciona una variable para el nuevo frame ListadoPagosFrame 
    - Crea un método listarPagosFrame() para que llene la tabla de ListadoPagosFrame con el método creado en GestionarPagos 
    - Crea un método newListadoPagoFrame que instancie el frame ListadoPagosFrame, 
    llame el método listarPagosFrame() y haga visible el frame
    - Crea un método leerEmpleadoParaPagosFrame() que lea el empleado seleccionado, 
    si no hay uno imprime mensaje que Debe Seleccionar un Empleado. 
    Que genere una instancia del frame RegistrarPagoFrame con el id seleccionado y los valores nombre y salario 
    del Empleado en el frame.
    - Crear un método crearPago() que lee los valores del frame RegistrarPagoFrame y llama al modelo para ingresar los valores a la base de datos.

5. Modifica el frame RegistroEmpleadosFrame para adicionar dos botones, uno Listado de Pagos y otro Realizar Pago 
    que llamen a los métodos del controlador.

 */
package mvc;

import controlador.Controlador;
import vista.RegistroEmpleadosFrame;

/**
 *
 * @author Karen Benedetti M
 */

public class MVC {

    public static void main(String[] args) {
        RegistroEmpleadosFrame ref = new RegistroEmpleadosFrame();
        Controlador c = new Controlador(ref);
        c.iniciar();
        ref.setControlador(c);
        ref.setVisible(true);
    }

}
