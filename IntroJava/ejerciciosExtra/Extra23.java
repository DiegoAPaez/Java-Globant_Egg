package extras;

import java.util.Random;
import java.util.Scanner;
import static java.lang.String.valueOf;

public class Extra23 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        String[][] sopa = new String[20][20];

        cargarSopa(sopa);
        mostrarSopa(sopa);
    }

    public static String solicitarPalabra() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra que contenga de 3 a 5 caracteres");
        String palabra = leer.nextLine();
        if (palabra.length() < 3 || palabra.length() > 5) {
            solicitarPalabra();
        }
        return palabra;
    }
    public static void cargarSopa(String[][] sopa) {
        Random aleatorio = new Random();
        String palabra;
        int palabras = 0;
        int posicionI = aleatorio.nextInt(10);
        int posicionJ;
        int k = 0;

        while (palabras < 5) {
            for (int i = posicionI; i < posicionI + 5; i++) {
                palabra = solicitarPalabra();
                palabras++;
                posicionJ = aleatorio.nextInt(10);
                for (int j = posicionJ; j < (posicionJ + palabra.length()); j++) {
                    sopa[i][j] = palabra.substring(k, k + 1);
                    k++;
                }
                k = 0;
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == null) {
                    sopa[i][j] = valueOf(aleatorio.nextInt(10));
                }
            }
        }
    }
    public static void mostrarSopa(String[][] sopa) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
*/


