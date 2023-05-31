package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es PAR");
        } else {
            System.out.println("El numero " + num + " es IMPAR");
        }
    }
}
/*
Crear un programa que dado un numero determine si es par o impar.
 */