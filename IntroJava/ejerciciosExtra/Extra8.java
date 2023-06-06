package extras;

import java.util.Scanner;

public class Extra8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numLeidos = 0;
        int numPares = 0;
        int numImpares = 0;
        int num;

        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            numLeidos++;
            if (num % 2 == 0) {
                numPares++;
            } else if (num < 0) {
                numLeidos--;
            } else {
                numImpares++;
            }
        } while (num % 5 != 0);
        System.out.println("Cantidad de numeros leidos = " + numLeidos);
        System.out.println("Cantidad de numeros pares = " + numPares);
        System.out.println("Cantidad de numeros impares = " + numImpares);
    }
}
/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
