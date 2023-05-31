package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los numeros a sumar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("suma = " + suma);
    }
}
/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */