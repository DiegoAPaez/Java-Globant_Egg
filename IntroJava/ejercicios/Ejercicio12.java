package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fde = "&&&&&";
        String cadena = "";
        int correctas = 0;
        int incorrectas = 0;

        while (!cadena.equals(fde)) {
            System.out.println("Introduzca una cadena");
            cadena = leer.next();
            int longitudCadena = cadena.length();
            if (longitudCadena <= 5) {
                if (cadena.substring(0,1).equals("X") && cadena.substring(longitudCadena-1,longitudCadena).equals("O"))  {
                    correctas++;
                } else if (!cadena.equals(fde)) {
                    incorrectas++;
                }
            }
        }
        System.out.println("El total de cadenas correctas ingresadas es de: " + correctas + ". Mientras que el de cadenas incorrectas es: " + incorrectas);
    }
}
/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */