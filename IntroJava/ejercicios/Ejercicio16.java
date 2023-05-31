package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random randomNum = new Random();
        System.out.println("Ingrese el tamaño del vector");

        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = randomNum.nextInt(10);
        }

        System.out.println("Que numero desea buscar?");
        int buscando = leer.nextInt();
        int posicion;
        int repetido = 0;
        boolean seEncuentra = false;

        for (int i = 0; i < n; i++) {
            if (vector[i] == buscando) {
                seEncuentra = true;
                posicion = i;
                repetido++;
                System.out.println("El numero se encuentra en la posicion -> " + posicion);
            }
        }
        if (repetido > 1) {
            System.out.println("El numero se repite " + repetido + " veces.");
        }
        if (!seEncuentra) {
            System.out.println("El numero " + buscando + " no se encuentra almacenado");
        }

    }
}
/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
