package extras;

import java.util.Scanner;

public class Extra9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un numero y luego su divisor");
        int num = leer.nextInt();
        int divisor = leer.nextInt();
        int resto;
        int cociente = 0;


        while (num < 0 || num < divisor) {
            System.out.println("Ingrese un numero mayor a uno y mayor al divisor");
            num = leer.nextInt();
        }


        do {
            resto = num - divisor;
            num = resto;
            cociente++;
        } while (resto > divisor);
        System.out.println("cociente = " + cociente);
        System.out.println("resto = " + resto);
    }
}
/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */

/* resto = n1 - n2, si resto > n2 -> n1 = resto */