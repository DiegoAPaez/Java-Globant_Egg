package extras;

import java.util.Scanner;

public class Extra18 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique cuantos numeros ingresara");
        int n = leer.nextInt();
        int num;
        int[] numeros = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            numeros[i] = num;
            suma = suma + num;
        }
        System.out.println("La suma de los numeros ingresados es = " + suma);
    }
}
/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */