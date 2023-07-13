package EjerciciosApp;

import Servicios.ServicioCadena;

import java.util.Scanner;

public class EjCadena {
    public static void main(String[] args) {
        ServicioCadena nuevo = new ServicioCadena();
        Scanner leer = new Scanner(System.in);
        nuevo.invertirFrase();

        nuevo.mostrarVocales();

        System.out.println("Ingrese el caracter que desea buscar");
        nuevo.vecesRepetido(leer.nextLine());

        System.out.println("Ingrese una nueva frase");
        nuevo.compararLongitud(leer.nextLine());

        System.out.println("Ingrese una nueva frase");
        nuevo.unirFrases(leer.nextLine());

        System.out.println("Ingrese un caracter reemplazar todas las 'a'");
        nuevo.reemplazar(leer.nextLine());

        System.out.println("Ingrese el caracter que desea buscar");
        System.out.println(nuevo.contiene(leer.nextLine()));
    }
}