package extras;

import java.util.Scanner;

public class Extra24 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el numero de la sucesion que desea realizar");
        int n = leer.nextInt();

        System.out.println("El resultado para la sucesion de " + n + " es " + fibonacci(n));
    }
    public static int fibonacci (int n) {
        int sucesion = 1;

        if (n >=2) {
            sucesion = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return sucesion;
    }
}
/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci.
 */