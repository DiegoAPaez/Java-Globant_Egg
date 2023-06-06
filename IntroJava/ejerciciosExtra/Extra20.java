package extras;

import java.util.Random;


public class Extra20 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        llenarVector(vector);
        imprimirVector(vector);
    }
    public static void llenarVector (int[] v) {
        Random llenar = new Random();
        for (int i = 0; i < 10; i++) {
            v[i] = llenar.nextInt(20);
        }
    }
    public static void imprimirVector(int[] v) {
        for (int i = 0; i < 10; i++) {
            System.out.println("En la posicion " + i + " el vector contiene el valor " + v[i]);
        }
    }
}

/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */