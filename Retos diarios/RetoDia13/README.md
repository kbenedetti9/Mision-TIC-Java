Continuamos trabajando con las clases Persona y Empleado. Como vimos en la sesión anterior, para esta
empresa, los empleados pueden ser fijos o proveedores, la diferencia entre ellos es el tipo de contrato
que determina la forma cómo se realizan contribuciones a las prestaciones sociales.
Vamos entonces a realizar los siguientes cambios a nuestro proyecto.
1. Genera una clase Proveedor que hereda de la clase Empleado:
Atributos adicionales:
- horasTrabajadas - int
- valorHora - int
Método a sobreescribir
- getPago(mes) //donde mes es un entero y la función retorna un entero
El pago de los proveedores se calcula como el número de horas trabajadas por el valor de la
hora.
Orden de los parámetros del constructor: horasTrabajadas, valorHora, codigo, banco,
nroCuenta, mesFacturacion, nombre, apellido, identificacion, celular
2. Modifica la clase Principal y define el método estático calcularSalarios que reciba un array de
Empleados (podrán ser Fijos o Proveedores). El método debe llamar por cada empleado en la
lista, el método getPago previamente definido e imprimir por cada uno de ellos el siguiente
mensaje
Empleado: <nombreEmpleado> <apellidoEmpleado> salario: <pago>
Consideraciones:
1. Continúa trabajando con las clases del reto anterior, puedes reemplazar las clases con los .java
entregados o copiar y pegar tu código para cada clase en los archivos entregados.
2. Recuerda que todas las clases deben tener los métodos get y set de todos sus atributos. OJO los
métodos get y set debe ser definidos como get<nombre atributo con primera letra mayúscula> y
set<nombre atributo con primera letra mayúscula>
