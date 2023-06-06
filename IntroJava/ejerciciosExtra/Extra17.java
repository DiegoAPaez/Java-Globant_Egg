package extras;

import java.util.Scanner;

public class Extra17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar si es primo");
        int numero = leer.nextInt();
        System.out.println("El numero ingresado es primo?.. " + esPrimo(numero));
    }
    public static Boolean esPrimo(int num) {
        boolean result = true;

        if (num == 0 || num == 1 || num == 4) {
            result = false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
            }
        }
        return result;
    }
}
/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
 */
