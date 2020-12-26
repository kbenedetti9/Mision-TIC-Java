## Figura

Objetivos:
- Mostrar el funcionamiento de Swing en Java y los componentes principales
- Identificar la visibilidad y manipulacion de los componentes desde el codigo
- Mostrar el codigo creado cuando se modifica la interfaz grafica

Partes del programa
1. Continuar construyendo en la interfaz de figura incluyendo 
    - Radio Buttons para Circulo, Rectangulo y Cuadrado
    - Crear un nuevo boton seleccionar para escoger una figura
    - Crear tres labels para lado o base (medida de un lado), altura (medida de otro lado para rectangulos) y radio
    - Crear tres TextFields para recibir la informacion de los labels
    - Agregar un buttonGroup
2. Modificar el constructor para agregar los radio buttons a un grupo y hacer todos los labels y TextFields con los valores de las figuras no visibles
3. Modificar la accion del boton Seleccionar para identificar que radioButton fue seleccionado y mostrar:
    - Para circulo - Radio y el texfield de radio
    - Para cuadrado - Lado y el textfield de lado
    - Para rectangulo - Base y Altura y los dos TextFields
4. Modificar el boton Calcular para que una vez presionado identifique la seleccion de la figura, recoja los valores necesarios y calcule el area y el perimetro
3. Los valores retornados deben ser formateados a dos cifras decimales (se recomienda importar java.text.DecimalFormat;)
4. Modificar los TextField creados para mostrar el resultado del area y el perimetro

