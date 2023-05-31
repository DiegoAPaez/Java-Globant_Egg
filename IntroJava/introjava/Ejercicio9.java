package introjava;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int num;

        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num > 0) {
                suma += num;
            } else if (num == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            }
            contador++;
        } while (contador < 20);
        System.out.println("La suma de los valores ingresados es: " + suma);
    }
}
/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */