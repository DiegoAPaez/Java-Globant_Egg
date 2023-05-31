package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la temperatura en grados Centigrados");
        int gradosC = leer.nextInt();
        System.out.println("Dicha temperatura se corresponde a " + (32 + (9 * gradosC / 5)) + " grados Fahrenheit.");
    }
}
/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */