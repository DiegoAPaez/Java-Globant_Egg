package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un numero para la posicion " + i + "," + j + " -> ");
                num = leer.nextInt();
                matriz[i][j] = validarIngreso(num);
            }
        }

        validarMatriz(matriz);
    }
    public static int validarIngreso(int n) {
        Scanner leer = new Scanner(System.in);
        if (n < 1 || n > 9) {
            System.out.print("Numero NO VALIDO. Ingrese un numero entre 1 y 9 -> ");
            n = leer.nextInt();
            validarIngreso(n);
        }
        return n;
    }

    public static void validarMatriz(int[][] matriz) {
        int diagonalPrincipal = 0;
        int segundaFila = 0;
        int primerColumna = 0;

        for (int i = 0; i < 3; i++) {
            diagonalPrincipal = diagonalPrincipal + matriz[i][i];
            segundaFila = segundaFila + matriz[1][i];
            primerColumna = primerColumna + matriz[i][0];
        }

        if (diagonalPrincipal == segundaFila && diagonalPrincipal == primerColumna) {
            System.out.println("El cuadrado es magico!");

        } else {
            System.out.println("El cuadrado NO es magico :(");
        }

        System.out.println("primerColumna = " + primerColumna);
        System.out.println("segundaFila = " + segundaFila);
        System.out.println("diagonalPrincipal = " + diagonalPrincipal);
    }
}
/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */