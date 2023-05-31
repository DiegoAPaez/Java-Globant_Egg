package introjava;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el multiplo");
        int num1 = leer.nextInt();
        System.out.println("Ingresa el divisor");
        int num2 = leer.nextInt();
        esMultiplo(num1,num2);
    }
    public static void esMultiplo(int n1, int n2) {
        if ((n1 % n2) == 0) {
            System.out.println(n1 + " es multiplo de " + n2);
        } else {
            System.out.println(n1 + " NO es multiplo de " + n2);
        }
    }
}
/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son
 */