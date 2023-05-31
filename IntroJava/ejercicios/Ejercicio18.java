package ejercicios;

import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Random rellenar = new Random();
                matriz[i][j] = rellenar.nextInt(10);
            }
        }
        int[][] transpuesta = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        System.out.println("Mostrar matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print( matriz[j][i] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\nMostrar tranpuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print( transpuesta[j][i] + " ");
            }
            System.out.print("\n");
        }
    }
}
/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */