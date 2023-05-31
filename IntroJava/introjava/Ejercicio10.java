package introjava;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String asteriscos = "";
        int num;
        int contador = 0;

        do {
            System.out.println("Ingrese un numero entre 1 y 20");
            num = leer.nextInt();
            for (int i = 0; i < num; i++) {
                asteriscos += "*";
            }
            System.out.println(num + " " + asteriscos);
            contador++;
            asteriscos = "";
        } while (contador < 4);
    }
}
