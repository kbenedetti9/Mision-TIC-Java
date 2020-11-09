Continuamos trabajando con las clases Persona y Empleado. Resulta que para esta empresa, los
empleados pueden ser fijos o proveedores, la diferencia entre ellos es el tipo de contrato que determina
la forma cómo se realizan contribuciones a las prestaciones sociales.
Vamos entonces a realizar los siguientes cambios a nuestras clases.
1. Crear un método en la clase Empleado llamado getPago(mes a facturar); que recibe como
parámetro el mes a facturar. Mes a facturar es un entero y la función retorna un entero.
2. Genera una clase Fijo que hereda de la clase Empleado:
Atributos adicionales:
- EPS - String
- fondoPension - String
- fondoCesantias - String
- ARL - String
- Salario - int
- horasExtras - int
Método a sobreescribir
- getPago(mes) //donde mes es un entero y la función retorna un entero
El pago de los empleados fijos se calcula tomando su salario y descontando el 8% que se destina
para salud y pensión. Si el empleado cuenta con horas extras se le añade el valor de la hora
extra ($50.000) por cada hora. Por ahora no necesitas realizar ninguna validación con el
parámetro de entrada mes, eso lo realizarás mas adelante.
Orden de los parámetros del constructor: EPS, fondoPension, fondoCesantias, ARL, salario,
horasExtras, codigo, banco, nroCuenta, mesFacturacion, nombre, apellido, identificacion, celular
Consideraciones:
1. Continúa trabajando con las clases del reto anterior, puedes reemplazar las clases con los .java
entregados o copiar y pegar tu código para cada clase en los archivos entregados.
2. Recuerda que todas las clases deben tener los métodos get y set de todos sus atributos. OJO los
métodos get y set debe ser definidos como get<nombre atributo con primera letra mayúscula> y
set<nombre atributo con primera letra mayúscula> .
