package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de Euros");
        double euros = leer.nextDouble(); // el ingreso en consola debe hacerse con ","
        conversor(euros);
    }
    public static void conversor(double num) {
        System.out.println(num + " €  equivalen a: " + num * 0.86 + " libras.");
        System.out.println(num + " €  equivalen a: " + num * 1.28611 + " dolares.");
        System.out.println(num + " €  equivalen a: " + num * 129.852 + " yenes.");
    }
}
/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
    0.86 libras es un 1 €
    1.28611 $ es un 1 €
    129.852 yenes es un 1 €
 */