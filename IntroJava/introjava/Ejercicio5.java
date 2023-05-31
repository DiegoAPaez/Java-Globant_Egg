package introjava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa true o false");
        boolean logica = leer.nextBoolean();
        System.out.println("Ingresa un numero decimal");
        double decimal = leer.nextDouble();
        System.out.println("Ingresa un caracter");
        String caracter = leer.next();
    }
}
/*
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 */