package extras;

import java.util.Locale;
import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String vocal = (leer.next()).toLowerCase();

        if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")){
            System.out.println(vocal + " es una VOCAL!");
        } else {
            System.out.println(vocal + " NO es una vocal!");
        }
    }
}
/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */