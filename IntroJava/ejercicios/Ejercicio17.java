package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random randomNum = new Random();
        System.out.println("Ingrese el tamaño del vector");

        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = randomNum.nextInt(100000);
        }

        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;

        for (int i = 0; i < n; i++) {
            int len = (int) (Math.log10(vector[i]) + 1);
            System.out.println("El numero " + vector[i] + " tiene " + len + " digitos.");
            if (len == 5) {
                cincoDigitos++;
            } else if (len == 4) {
                cuatroDigitos++;
            } else if (len == 3) {
                tresDigitos++;
            } else if (len == 2) {
                dosDigitos++;
            } else {
                unDigito++;
            }
        }
        System.out.println("unDigito = " + unDigito);
        System.out.println("dosDigitos = " + dosDigitos);
        System.out.println("tresDigitos = " + tresDigitos);
        System.out.println("cuatroDigitos = " + cuatroDigitos);
        System.out.println("cincoDigitos = " + cincoDigitos);
    }
}
/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
