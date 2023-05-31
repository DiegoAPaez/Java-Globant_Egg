package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matrizDiez = new int[10][10];
        int[][] matrizTres = new int[3][3];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Ingrese un numero para la posicion " + i + "," + j + " de matrizDiez -> ");
                matrizDiez[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un numero para la posicion " + i + "," + j + " de matrizTres -> ");
                matrizTres[i][j] = leer.nextInt();
            }
        }


        int posicionI;
        int posicionJ;
        boolean contenida = true;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizDiez[i][j] == matrizTres[0][0]) {
                    posicionI = i;
                    System.out.println("posicionI = " + posicionI);
                    posicionJ = j;
                    System.out.println("posicionJ = " + posicionJ);

                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrizTres[k][l] != matrizDiez[posicionI][posicionJ]) {
                                contenida = false;
                            }
                            posicionJ++;
                        }
                        posicionJ = posicionJ - 3;
                        posicionI++;
                    }

                }
            }
            if (contenida) {
                System.out.println("matrizTres se encuentra contenida por matrizDiez");
                break;
            }
        }
    }
}
/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */