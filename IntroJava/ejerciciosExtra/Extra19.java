package extras;

import java.util.Scanner;

public class Extra19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique cuantos numeros posee el vector");
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un valor para vector 1 en posicion " + i);
            vector1[i] = leer.nextInt();
            System.out.println("Ingrese un valor para vector 2 en posicion " + i);
            vector2[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Los vectores NO son iguales");
                break;
            }
        }
        System.out.println("Los vectores son iguales");
    }
}
/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos)
 */
