package extras;

import java.util.Scanner;

public class Extra16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique cuantas personas desea evaluar");
        int nPersonas = leer.nextInt();

        String[] nombres = new String[nPersonas];
        int[] edades = new int[nPersonas];

        for (int i = 0; i < nPersonas; i++) {
            System.out.println("Ingrese el nombre");
            nombres[i] = leer.next();
            System.out.println("Que edad tiene " + nombres[i] + "?");
            edades[i] = leer.nextInt();
        }

        for (int i = 0; i < nPersonas; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " es mayor de edad.");
            } else {
                System.out.println(nombres[i] + " NO es mayor de edad.");
            }
            System.out.println("Desea continuar? (Si/No)");
            String salir = leer.next();
            if (salir.equals("No")) {
                break;
            }
        }
    }
}
/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
