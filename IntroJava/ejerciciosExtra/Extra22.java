package extras;

import java.util.Random;
import java.util.Scanner;

public class Extra22 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random llenar = new Random();
        System.out.println("Ingrese el numero de filas de la matriz");
        int n = leer.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz");
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = llenar.nextInt(20);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }

        System.out.println("La suma de los elementos de la matriz es = " + suma);
    }
}
/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
