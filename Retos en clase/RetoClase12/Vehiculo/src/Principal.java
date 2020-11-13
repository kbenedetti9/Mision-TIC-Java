/**
 *
 * @author Karen Benedetti M
 */
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        // 1. Definición de variables
        Scanner entrada = new Scanner(System.in);
        char resp;
        boolean aa;
        String matricula;
        int numSillas;
        int sillasadic;
        
        // 2. Creacion de objetos v1, v2 y v3 instanciando la SuperClase Vehiculo
        Vehiculo v1 = new Vehiculo();
        System.out.println("El vehiculo con placa " + v1.getMatricula() +
                " tiene " + v1.getnumSillas() + " sillas");
        Vehiculo v2 = new Vehiculo("DHL164");
        System.out.println("El vehiculo con placa " + v2.getMatricula() +
                " tiene " + v2.getnumSillas() + " sillas");
        Vehiculo v3 = new Vehiculo("QHM245", 5);
        System.out.println("El vehiculo con placa " + v3.getMatricula() +
                " tiene " + v3.getnumSillas() + " sillas");
        
        //3. Creación de objetos t1, t2, y t3 instanciando la SubClase Taxi
        
        //3.1. Instancia de Taxi t1 con parámetro AA solamente. Usa el caso de
        //super sin parámetros.
        System.out.print("Primer Taxi: Tiene Aire Acondicionado?(S/N): ");
        resp = entrada.next().charAt(0); // Leer un caracter de teclado
        aa = resp == 'S' || resp == 's';  // Prueba de operador || booleano
        Taxi t1 = new Taxi(aa);
        System.out.println("El primer taxi con matricula " + t1.getMatricula() +
                " tiene " + t1.getnumSillas() + " sillas y "+ 
                (t1.getAA()? "tiene AA":"no tiene AA"));
        
        //3.2. Instancia de Taxi t2 con parámetros AA y matrícula. Usa el caso  
        //de super con parámetro matrícula.
        System.out.print("Segundo Taxi: Numero de matricula: ");
        matricula = entrada.next();
        System.out.print("Segundo Taxi: Tiene Aire Acondicionado?(S/N): ");
        resp = entrada.next().charAt(0); // Leer un caracter de teclado
        aa = resp == 'S' || resp == 's';  // Prueba de operador || booleano
        Taxi t2 = new Taxi(matricula,aa);
        System.out.println("El segundo taxi con matricula " + t2.getMatricula() +
                " tiene " + t2.getnumSillas() + " sillas y "+ 
                (t2.getAA()? "tiene AA":"no tiene AA"));
        
        //3.3. Instancia de Taxi t3 con parámetros AA, matrícula y número de  
        //sillas. Usa el super con parámetro matrícula, y numero de sillas.
        System.out.print("Tercer Taxi: Numero de matricula: ");
        matricula = entrada.next();
        System.out.print("Tercer Taxi: Numero de sillas: ");
        numSillas = entrada.nextInt();
        System.out.print("Tercer Taxi: Tiene Aire Acondicionado?(S/N): ");
        resp = entrada.next().charAt(0); // Leer un caracter de teclado
        aa = resp == 'S' || resp == 's';  // Prueba de operador || booleano
        Taxi t3 = new Taxi(matricula,numSillas,aa);
        System.out.println("El tercer taxi con matricula " + t3.getMatricula() +
                " tiene " + t3.getnumSillas() + " sillas y "+ 
                (t3.getAA()? "tiene AA":"no tiene AA"));
        
        //4. Creación de objeto c1 instanciando la SubClase Camioneta
        // Instancia de Camioneta con parámetros AA y matrícula. Usa el super 
        // con parámetro matrícula.
        System.out.print("Camioneta: Numero de matricula: ");
        matricula = entrada.next();
        System.out.print("Camioneta: Numero de sillas adicionales: ");
        sillasadic = entrada.nextInt();
        System.out.print("Camioneta: Tiene Aire Acondicionado?(S/N): ");
        resp = entrada.next().charAt(0); // Leer un caracter de teclado
        aa = resp == 'S' || resp == 's';  // Prueba de operador || booleano
        Camioneta c1 = new Camioneta(matricula,aa);
        c1.setSillasAdicionales(sillasadic);  //Aumento en el número de sillas 
                                              // para la camioneta
        System.out.println("La camioneta con matricula " + c1.getMatricula() +
                " tiene " + c1.getnumSillas() + " sillas y "+ 
                (c1.getAA()? "tiene AA":"no tiene AA"));        
    }
}
