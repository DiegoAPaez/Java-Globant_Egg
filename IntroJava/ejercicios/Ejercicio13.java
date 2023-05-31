package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el tamaño del cuadrado");
        int tamano = leer.nextInt();

        for (int i = 0; i < tamano; i++) {

            for (int j = 0; j < tamano; j++) {
                if (i == 0){
                    System.out.print("* ");
                } else if (i == (tamano - 1)) {
                    System.out.print("* ");
                } else if (j == 0) {
                    System.out.print("* ");
                } else if (j == (tamano - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
