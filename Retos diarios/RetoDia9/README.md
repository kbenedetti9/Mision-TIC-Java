## Retos del día

<b>INFORMACIÓN IMPORTANTE:</b> Recuerda que los retos del día son una oportunidad de reforzar los conocimientos adquiridos en esta sesión teórica y adicionalmente sirven para modificar, practicar y aprender a considerar soluciones alternas. Por este motivo, es importante no sólo usar el contenido de la sesión síncrona y preguntar a los monitores, sino también buscar en Internet soluciones viables a los problemas planteados. 

### Reto 1
Ahora que tenemos la clase Camion definida vamos a crear un método distanciaCamionaBase() que calcula la distancia euclidiana entre la posición inicial y la instantánea de un camión. La distancia euclidiana para dos puntos Xa,Ya,Za y Xb,Yb,Zb se calcula como:

<img src="https://openedx.edunext.co/asset-v1:MT-Uninorte+P2+2020+type@asset+block@distancia_euclidiana.PNG">

***Pista*** La librería o API Math provee métodos para calcular la raíz cuadrada y elevar un número a una potencia. 

Adicionalmente, debes crear un metodo reto() por fuera de la clase Camion que lea los valores de los atributos de un camión e imprima la distancia del camión a base.

***Datos a leer en el método reto en el orden indicado***<br>
marca, capacidad, kmInicial, kmFinal, capacidadCombustible, tasaCombusPorKm, ejes, placa, X0, Y0, Z0, X1, Y1, Z1<br>
En este caso, X0, Y0, Z0 corresponden a la posicion inicial y X1, Y1, Z1 a la posicion instantanea.

***Datos a imprimir para un camión de placa RTF665 posicionLocal{1,4,6} y una posicion instantanea de {2,5,7}***<br>
La distancia del camión con placa RTF665 de la base es de 1.7 

