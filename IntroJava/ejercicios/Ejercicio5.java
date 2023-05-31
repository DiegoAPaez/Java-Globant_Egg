package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println("El doble del num es = " + num*2);
        System.out.println("El triple del num es = " + num*3);
        System.out.println("La raiz cuadrada del num es = " + Math.sqrt(num));
    }
}
/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt()
 */