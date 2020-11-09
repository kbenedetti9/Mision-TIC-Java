Continuamos trabajando con las clases Persona, Empleado, Fijo y Proveedor.
El líder de desarrollo del proyecto ha pedido ciertos cambios dentro de la implementación. Estos
cambios incluyen:
1. Hacer la clase Persona abstract.
2. Crear un método abstracto en la clase Persona getPago(mesFacturado)
3. Crear un constructor adicional dentro de la clase Persona que reciba únicamente nombre e
identificacion.
4. Crear un constructor adicional dentro de la clase Empleado que reciba codigo, banco,
nroCuenta, mesFacturacion nombre, identificacion.
5. Crear un constructor adicional dentro de la clase Fijo que reciba EPS, fondoPension,
fondoCesantias, ARL, salario, horasExtras, codigo, banco, nroCuenta, mesFacturacion, nombre,
identificacion.
6. Modificar el método getPago de la clase Fijo para que valide si el mes ingresado como
parámetro es igual al mes de facturación definido para la instancia. Si es, retornar el valor
calculado. Sino, si el mes solicitado ya pasó (mesFacturación de la instancia es mayor al
parámetro) retorna -1 si el mes no ha pasado, retorna -2.
7. Crear un constructor adicional dentro de la clase Proveedor que reciba: horasTrabajadas,
valorHora, codigo, banco, nroCuenta, mesFacturacion, nombre, identificacion.
8. Modificar el método getPago de la clase Proveedor para que valide si el mes ingresado como
parámetro es igual al mes de facturación definido para la instancia. Si es, retornar el valor
calculado. Sino, si el mes solicitado ya pasó (mesFacturación de la instancia es mayor al
parámetro) retorna -1 si el mes no ha pasado, retorna -2.
Consideraciones:
1. Continúa trabajando con las clases del reto anterior, puedes reemplazar las clases con los .java
entregados o copiar y pegar tu código para cada clase en los archivos entregados.
2. Recuerda que todas las clases deben tener los métodos get y set de todos sus atributos. OJO los
métodos get y set debe ser definidos como get<nombre atributo con primera letra mayúscula> y
set<nombre atributo con primera letra mayúscula>
