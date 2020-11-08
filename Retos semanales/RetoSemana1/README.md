
## RETO SEMANA 1 

Hemos empezado con Java! En esta primera semana, y a modo de entrenamiento, haremos una migración del Reto 3 del Ciclo 1:

El Departamento de Logística de Frigoaves S.A.S., obedeciendo a una directriz del Departamento de TICs, ha solicitado migrar el desarrollo a Java. Recuerda que lo que se busca es implementar un sistema de planillas en el que se asignan a cada camión una Orden de Despacho con el número de cajas y los tiempos de despacho, por cada punto de distribución. 

Estas planillas podrán ser incorporadas en tu sistema para contrastar “lo asignado” por Frigoaves contra “lo registrado” por el conductor de cada camión de Transportes del Norte. Desarrolla una nueva funcionalidad que  permita calcular, para cada punto de distribución:
1. La diferencia de cajas entregadas, reflejando “lo asignado” menos “lo registrado”. Los valores negativos corresponden a sobre-entregas (unidades entregadas de más).
2. La diferencia de tiempos de despacho, reflejando “lo asignado” menos “lo registrado”. Los valores negativos corresponden a demoras en el punto de distribución.
3. La eficiencia en los tiempos de despacho, reflejada como un porcentaje que toma como referencia  “lo asignado”: 

Eficiencia en tiempos de despacho = (Tiempo total de despacho asignado - Tiempo total de despacho registrado) / Tiempo de total despacho asignado x 100

Los valores negativos corresponden a deficiencias.

Este nuevo desarrollo debe generar un reporte con los cálculos anteriores, y además debe listar:

1. Los 3 puntos de distribución que registran mayores sobre-entregas. Si hay dos iguales, selecciona primero el del punto de distribución menor 
2. Los 3 puntos de distribución que registran las mayores demoras. Si hay dos iguales, selecciona primero el del punto de distribución menor 
3. Todos los puntos de distribución que registran ambas condiciones negativas: tanto sobre-entregas, como demora en su tiempo de despacho.

Nuevos estudios muestran que en estos puntos es más probable que ocurran posibles robos de mercancía.


### Ejemplo 

1. Esta es la Orden de Despacho (que contiene las cajas asignadas y tiempos asignados, por punto de distribución) emitida por Frigroaves :

<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
.tg .tg-cey4{border-color:inherit;font-size:16px;text-align:left;vertical-align:top}
.tg .tg-g25u{background-color:#cbcefb;border-color:inherit;font-size:16px;text-align:center;vertical-align:top}
.tg .tg-udtg{border-color:inherit;color:#000000;font-size:16px;text-align:center;vertical-align:bottom}
.tg .tg-pwu9{background-color:#9698ed;border-color:inherit;font-size:16px;font-weight:bold;text-align:center;vertical-align:middle}
.tg .tg-v837{background-color:#9698ed;border-color:inherit;font-size:16px;font-weight:bold;text-align:left;vertical-align:top}
.tg .tg-gtoc{background-color:rgba(66, 165, 245, 0.2);border-color:inherit;font-size:16px;text-align:center;vertical-align:bottom}
.tg .tg-2734{background-color:rgba(66, 165, 245, 0.2);border-color:inherit;color:#000000;font-size:16px;text-align:center;
  vertical-align:bottom}
.tg .tg-rgq0{border-color:inherit;font-size:16px;text-align:center;vertical-align:bottom}
.tg .tg-3mfb{border-color:inherit;font-size:16px;font-weight:bold;text-align:left;vertical-align:bottom}
.tg .tg-yxgd{border-color:inherit;color:#000000;font-size:16px;font-weight:bold;text-align:center;vertical-align:bottom}
</style>
<table class="tg">
<thead>
  <tr>
    <th class="tg-g25u">Asignado por LactoCaribe</th>
    <th class="tg-cey4">Cajas</th>
    <th class="tg-cey4">Tiempos</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-v837">Punto de Distribución</td>
    <td class="tg-pwu9">Cajas</td>
    <td class="tg-pwu9">Tiempo de   despacho<br>     (minutos)</td>
  </tr>
  <tr>
    <td class="tg-gtoc">1</td>
    <td class="tg-2734">98</td>
    <td class="tg-2734">11</td>
  </tr>
  <tr>
    <td class="tg-rgq0">2</td>
    <td class="tg-udtg">86</td>
    <td class="tg-udtg">14</td>
  </tr>
  <tr>
    <td class="tg-rgq0">3</td>
    <td class="tg-udtg">99</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-rgq0">4</td>
    <td class="tg-udtg">89</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-rgq0">5</td>
    <td class="tg-udtg">89</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-rgq0">6</td>
    <td class="tg-udtg">96</td>
    <td class="tg-udtg">10</td>
  </tr>
  <tr>
    <td class="tg-rgq0">7</td>
    <td class="tg-udtg">93</td>
    <td class="tg-udtg">13</td>
  </tr>
  <tr>
    <td class="tg-rgq0">8</td>
    <td class="tg-udtg">87</td>
    <td class="tg-udtg">15</td>
  </tr>
  <tr>
    <td class="tg-rgq0">9</td>
    <td class="tg-udtg">89</td>
    <td class="tg-udtg">10</td>
  </tr>
  <tr>
    <td class="tg-rgq0">10</td>
    <td class="tg-udtg">92</td>
    <td class="tg-udtg">10</td>
  </tr>
  <tr>
    <td class="tg-rgq0">11</td>
    <td class="tg-udtg">99</td>
    <td class="tg-udtg">15</td>
  </tr>
  <tr>
    <td class="tg-rgq0">12</td>
    <td class="tg-udtg">90</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-rgq0">13</td>
    <td class="tg-udtg">87</td>
    <td class="tg-udtg">15</td>
  </tr>
  <tr>
    <td class="tg-rgq0">14</td>
    <td class="tg-udtg">96</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-rgq0">15</td>
    <td class="tg-udtg">92</td>
    <td class="tg-udtg">15</td>
  </tr>
  <tr>
    <td class="tg-rgq0">16</td>
    <td class="tg-udtg">85</td>
    <td class="tg-udtg">10</td>
  </tr>
  <tr>
    <td class="tg-rgq0">17</td>
    <td class="tg-udtg">86</td>
    <td class="tg-udtg">10</td>
  </tr>
  <tr>
    <td class="tg-rgq0">18</td>
    <td class="tg-udtg">97</td>
    <td class="tg-udtg">14</td>
  </tr>
  <tr>
    <td class="tg-rgq0">19</td>
    <td class="tg-udtg">90</td>
    <td class="tg-udtg">14</td>
  </tr>
  <tr>
    <td class="tg-rgq0">20</td>
    <td class="tg-udtg">98</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-3mfb">TOTAL</td>
    <td class="tg-yxgd">1838</td>
    <td class="tg-yxgd">248</td>
  </tr>
</tbody>
</table>
Si al consignar los valores en la plantilla de los registros del conductor obtenemos este resultado:

<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
.tg .tg-g25u{background-color:#cbcefb;border-color:inherit;font-size:16px;text-align:center;vertical-align:top}
.tg .tg-udtg{border-color:inherit;color:#000000;font-size:16px;text-align:center;vertical-align:bottom}
.tg .tg-pwu9{background-color:#9698ed;border-color:inherit;font-size:16px;font-weight:bold;text-align:center;vertical-align:middle}
.tg .tg-v837{background-color:#9698ed;border-color:inherit;font-size:16px;font-weight:bold;text-align:left;vertical-align:top}
.tg .tg-gtoc{background-color:rgba(66, 165, 245, 0.2);border-color:inherit;font-size:16px;text-align:center;vertical-align:bottom}
.tg .tg-laps{background-color:rgba(66, 165, 245, 0.2);border-color:inherit;color:#333333;font-size:16px;text-align:center;
  vertical-align:bottom}
.tg .tg-rgq0{border-color:inherit;font-size:16px;text-align:center;vertical-align:bottom}
.tg .tg-3mfb{border-color:inherit;font-size:16px;font-weight:bold;text-align:left;vertical-align:bottom}
.tg .tg-yxgd{border-color:inherit;color:#000000;font-size:16px;font-weight:bold;text-align:center;vertical-align:bottom}
</style>
<table class="tg">
<thead>
  <tr>
    <th class="tg-g25u" colspan="3">Asignado por LactoCaribe</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-v837">Punto de Distribución</td>
    <td class="tg-pwu9">Cajas a Entregar</td>
    <td class="tg-pwu9">Tiempo de   despacho<br>     (minutos)</td>
  </tr>
  <tr>
    <td class="tg-gtoc">1</td>
    <td class="tg-laps">100</td>
    <td class="tg-laps">10</td>
  </tr>
  <tr>
    <td class="tg-rgq0">2</td>
    <td class="tg-udtg">86</td>
    <td class="tg-udtg">10</td>
  </tr>
  <tr>
    <td class="tg-rgq0">3</td>
    <td class="tg-udtg">97</td>
    <td class="tg-udtg">15</td>
  </tr>
  <tr>
    <td class="tg-rgq0">4</td>
    <td class="tg-udtg">93</td>
    <td class="tg-udtg">15</td>
  </tr>
  <tr>
    <td class="tg-rgq0">5</td>
    <td class="tg-udtg">94</td>
    <td class="tg-udtg">13</td>
  </tr>
  <tr>
    <td class="tg-rgq0">6</td>
    <td class="tg-udtg">93</td>
    <td class="tg-udtg">13</td>
  </tr>
  <tr>
    <td class="tg-rgq0">7</td>
    <td class="tg-udtg">95</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-rgq0">8</td>
    <td class="tg-udtg">85</td>
    <td class="tg-udtg">11</td>
  </tr>
  <tr>
    <td class="tg-rgq0">9</td>
    <td class="tg-udtg">90</td>
    <td class="tg-udtg">11</td>
  </tr>
  <tr>
    <td class="tg-rgq0">10</td>
    <td class="tg-udtg">90</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-rgq0">11</td>
    <td class="tg-udtg">85</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-rgq0">12</td>
    <td class="tg-udtg">89</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-rgq0">13</td>
    <td class="tg-udtg">85</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-rgq0">14</td>
    <td class="tg-udtg">93</td>
    <td class="tg-udtg">11</td>
  </tr>
  <tr>
    <td class="tg-rgq0">15</td>
    <td class="tg-udtg">89</td>
    <td class="tg-udtg">10</td>
  </tr>
  <tr>
    <td class="tg-rgq0">16</td>
    <td class="tg-udtg">89</td>
    <td class="tg-udtg">14</td>
  </tr>
  <tr>
    <td class="tg-rgq0">17</td>
    <td class="tg-udtg">93</td>
    <td class="tg-udtg">12</td>
  </tr>
  <tr>
    <td class="tg-rgq0">18</td>
    <td class="tg-udtg">99</td>
    <td class="tg-udtg">11</td>
  </tr>
  <tr>
    <td class="tg-rgq0">19</td>
    <td class="tg-udtg">93</td>
    <td class="tg-udtg">13</td>
  </tr>
  <tr>
    <td class="tg-rgq0">20</td>
    <td class="tg-udtg">99</td>
    <td class="tg-udtg">11</td>
  </tr>
  <tr>
    <td class="tg-3mfb">TOTAL</td>
    <td class="tg-yxgd">1837</td>
    <td class="tg-yxgd">238</td>
  </tr>
</tbody>
</table>

La salida esperada es la siguiente:

Punto # 1

<p>Diferencia de cajas =  -2</p>
<p>Diferencia de tiempos = 1</p>
<p>Eficiencia = 9.1%</p>

<p>Punto # 2</p>

<p>Diferencia de cajas =  0</p>
<p>Diferencia de tiempos = 4</p>
<p>Eficiencia = 28.6%</p>

<p>Punto # 3</p>

<p>Diferencia de cajas =  2</p>
<p>Diferencia de tiempos = -3</p>
<p>Eficiencia = -25.0%</p>

<p>.</p>
<p>. (Asi mismo para cada punto hasta el 20)</p>
<p>.</p>

<p>Punto # 20</p>

<p>Diferencia de cajas =  -1</p>
<p>Diferencia de tiempos = 1</p>
<p>Eficiencia = 8.3%</p>


Los puntos con mayores demoras de tiempo = Punto 16 = -4, Punto 3 = -3, Punto 4 = -3 <br>
Los puntos con mayores sobre-entregas = Punto 17 = -7, Punto 5 = -5, Punto 4 = -4 <br>
Los puntos donde pasan ambas = Punto 4, Punto 5, Punto 9, Punto 16, Punto 17 <br>

### Recomendaciones:

1. Mantener el formato de la "salida esperada" (orden, palabras y signos). Para ello se recomienda copiar y pegar del ejemplo. 
2. La plataforma discrimina por espacios y mayúsculas.
3. La salida esperada debe truncarse a una cifra significativa. Para redondear numeros reales puedes usar la función String.format("%.1f,valor) de la siguiente manera :
     String.format("%.1f, 1.54) --->   1.5