package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite = 0;
        int num;
        while (limite < 10) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            limite = limite + num;
        }

    }
}
/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
