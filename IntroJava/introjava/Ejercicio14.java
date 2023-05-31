package introjava;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de alumnos");
        int cantidadNombres = leer.nextInt();
        String[] nombres = new String[cantidadNombres];
        System.out.println("Ahora vamos a ingresar sus nombres");
        for (int i = 0; i < cantidadNombres; i++) {
            System.out.println("Escribe un nombre");
            nombres[i] = leer.next();
        }
        for (int i = 0; i < cantidadNombres; i++) {
            System.out.println(nombres[i]);
        }
    }
}
