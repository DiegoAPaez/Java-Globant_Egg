package introjava;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese num1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese num2");
        int num2 = leer.nextInt();
        
        if (num1 > 25) {
            System.out.println("num1 Es mayor a 25 -> " + num1);
        } else if (num2 > 25) {
            System.out.println("num2 Es mayor a 25 -> " + num2);
        } else {
            System.out.println("Ninguno de los numeros ingresados es mayor a 25");
        }
    }
}