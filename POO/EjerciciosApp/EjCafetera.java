package EjerciciosApp;

import Entidades.Cafetera;

import java.util.Scanner;

public class EjCafetera {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera v60 = new Cafetera();
        System.out.println("Indique la cacidad maxima de la cafetera");
        v60.setCapacidadMaxima(leer.nextInt());
        v60.setCapacidadActual(0);

        System.out.println("Cuanto cafe desea agregar a la cafetera?");
        v60.agregarCafe(leer.nextInt());

        System.out.println("Cuanto cafe desea servirse?");
        v60.servirTaza(leer.nextInt());

    }
}
