##RETO SEMANAL 2:

Definir y trabajar con la clase Camión:

***Métodos que puede manejar:***

Construir la clase Camión que defina como atributos a instaciar la marca, capacidad de carga,  Kilometraje recorrido inicial al llenar almacenamiento de combustible, Kilometraje final instantáneo, Capacidad de almacenamiento de combustible, Tasa Combustible consumido por Kilometraje recorrido, Ejes, Placa, Posición Local Base (X0,Y0,Z0), Posición instantánea del camión (Xc,Yc,Zc).

Hacer uso de un constructor para asignar valores iniciales a los atributos instanciables con la palabra clave this, y con la ayuda de los métodos get y set debe poder ver y modificar las variables definidas como el modificador de acceso private (variables de instancias).
Construir un método para calcular el combustible restante (asumiendo que se cargó completamente el depósito de almacenamiento antes de un recorrido).
Construir un método que calcule la distancia euclidiana entre el camión y la posición base (ver reto diario 09).

Construir un programa main que instancie dos objetos camión,  solicite por pantalla los  valores de los atributos de cada uno y responda a las siguientes cuestiones:
Determinar qué camión está más lejos de la base, mostrando la identidad del camión por la placa y un mensaje alusivo a la mayor distancia de la base.
Determinar qué camión tiene más combustible, mostrando la identidad del camión y un mensaje alusivo a la mayor cantidad de combustible.
Determinar la distancia entre los dos camiones. 

***Ejemplo:***
1. Ingresar por medio del Scanner los valores solicitados, en el orden que está en la celda, ya que la plataforma los va a ingresar en ese orden.

2.  Si los valores ingresados son los siguientes:

      mazda (input la marca primer camión) <br>
      1000  (input capacidad primer camión) <br>
      10.1    (input el kilometraje inicial primer camión) <br>
      96.5   (input el kilometraje final primer camión) <br> 
      100  (input la capacidad del tanque de combustible primer camión) <br>
      0.3    (input la tasa del combustible por kilometraje primer camión) <br>
       4    (input el número de ejes primer camión) <br>
      123X  (input la placa primer camión) <br>
      1     (input X0 primer camión) <br>
      2     (input Y0 primer camión) <br>
      3     (input Z0 primer camión) <br>
      4     (input X primer camión) <br>
      5     (input Y primer camión) <br>
      6     (input Z primer camión) <br>
      Kia   (input la marca segundo camión) <br>
      1200  (input capacidad segundo camión) <br>
      15.4    (input el kilometraje inicial segundo camión) <br>
      100.7   (input el kilometraje final segundo camión) <br>
      158   (input la capacidad del tanque de combustible segundo camión) <br>
      0.36  (input la tasa del combustible por kilometraje segundo camión) <br>
      5     (input el número de ejes segundo camión) <br>
      125y  (input la placa segundo camión) <br>
      1     (input X0 segundo camión) <br>
      2     (input Y0 segundo camión) <br>
      4     (input Z0 segundo camión) <br>
      4     (input X segundo camión) <br>
      5     (input Y segundo camión) <br>
      8     (input Z segundo camión) <br>


3. La salida esperada para esa entrada es la siguiente: 

  El camion de placa: 125y se encuentra a mayor distancia de la base que el camion de placa: 123X 

  El camion de placa: 125y tiene mas combustible que el camion de placa: 123X

  La distancia entre los camiones es: 2.0

***Donde:*** 

La cantidad de combustible se determina de la siguiente forma:

    CapacidadDelTanqueDeCombustible-(kilometrajeFinal-kilometrajeInicial)*tasaCombustible

Para la distancia entre los camiones se tiene que calcular con base de la posición instantanea de los camiones.


***Recomendaciones:***
1. La palabra camión en la salida esperada por la plataforma es sin tilde, es decir "camion".

2. Para el cálculo del camión a la distancia de la base consultar fórmula de  distancia euclidiana (ver reto diario 09).

3. Mantener el orden, estructura y formato de la salida esperada.

4. Redondear a una cifra significativa los resultados . Puedes usar String.format("%.1f",1.54) = 1.5 
