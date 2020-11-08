
##Reto semanal 03 – JNomina
JNomina es un proyecto para facilitar el cálculo de lo que un empleado recibirá en el
siguiente pago de nómina. Esta aplicación será genérica por lo cual podemos prestar el
servicio a todas las empresas que requieran una herramienta de ayuda para la gestión de
su pago de nómina.
Detalles del programa
JNomina tiene en su registro dos tipos de personas, por una parte: están los empleados y
por el otra parte los usuarios que tienen acceso a la herramienta. Los empleados pueden
ser fijos o proveedores, la diferencia entre ellos es el tipo de contrato que determina la
forma de cómo se realizan contribuciones a las prestaciones sociales.
La aplicación para este reto debe contar con el registro de personas y con el calculo de su
mes de facturación. Para ello la aplicación debe contar con:
Clases, atributos y métodos
- Persona (Clase abstracta, atributos: nombre, apellido, identificación, celular)
- Empleado (implementa de Persona, atributos: código interno, banco, número de
cuenta, mes a facturar, método: getPago(número del mes))
o Fijo (hereda de Empleado, atributos: EPS, Fondo de Pensión, Fondo de
cesantías, ARL, salario, horas extras, método: getPago(número del mes))
o Proveedor (hereda de Empleado, atributos: horas trabajadas, valor de la
hora, método: getPago(número del mes))
- Usuario (implementa de Persona, atributos: identificación, usuario, contraseña)
- HrasExtras (Interfaz con el valor de la hora extra $50.000 como constante)
Funcionalidad
Al inicio la aplicación debe registrar a las personas, elegir la constante del mes que se va a
liquidar y obtener el salario de los empleados si este ha facturado. Se puede dar el caso que
el mes solicitado ya se ha pagado o todavía no se ha facturado.
El pago de los empleados fijos se calcula tomando su sueldo y descontando el 8% que se
destina para salud y pensión, si el empleado cuenta con horas extras se le añade el valor de
la hora extra por cada hora. El pago de los proveedores es el número de horas trabajadas
por el valor de la hora
Nota: Todas las clases deben tener los métodos get y set de todos sus atributos
EJEMPLO:
Datos de entrada:
2500000
36
ABC
Coomeva
785458
11
Juan
3539
3500000
16
XYZ
Davivienda
155658
12
Jose
3599
48
70000
2528
BBVA
659885
4
Manuel
7845
11
3
5
Datos de salida:
El monto a liquidar del empleado: ABC es: $4100000
Mes ya facturado
Mes sin facturar
Archivos que debes subir a la plataforma:
• Persona.java
• Empleado.java
• Fijo.java
• Proveedor.java
• main.java
• Usuario.java
• HrsExtra.java
El orden de los inputs de entrada se encuentra en el archivo main.java