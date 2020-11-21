### Mini reto sesión 23
Esta semana vas a trabajar en el desarrollo de una aplicación que administre las operaciones de registro
del colegio UNI. Durante el reto de hoy vamos a generar las clases del modelo y la base de datos.
1. Crea una base de datos SQLite colegio.db con cuatro tablas:
a. profesores
i. id – INTEGER autogenerado Primary Key
ii. nombre – VARCHAR
iii. correo – VARCHAR
iv. edad – INTEGER
b. estudiantes
i. id – INTEGER autogenerado Primary Key
ii. nombre – VARCHAR
iii. celular – VARCHAR
iv. edad – INTEGER
c. cursos
i. id – INTEGER autogenerado Primary Key
ii. nombre – VARCHAR
iii. capacidad – Integer
iv. profesor – Foreign key (ID)
d. curso_estudiante
i. id - INTEGER autogenerado Primary Key
ii. id_curso – INTEGER Foreign Key
iii. id_estudiante – INTEGER Foreign Key
2. Crea las siguientes cuatro clases pertenecientes al modelo:
a. Estudiante – Con todos los campos de la base de datos y un ArrayList de Cursos
b. Profesor – Con todos los campos de la base de datos y un ArrayList de cursos
c. Curso – con todos los campos de la base de datos, un Profesor y un ArrayList de
Estudiantes.
3. Crea dos constructores en cada clase, uno con todos los campos (excepto el ArrayList) y otro con
todos los campos (excepto el atributo id y el ArrayList).
4. Crea los métodos get y set para TODOS los atributos de cada clase.
5. Crea una clase Conexión que maneje la conexión a la base de datos (puedes usar como referencia
la clase usada en la semana anterior).
